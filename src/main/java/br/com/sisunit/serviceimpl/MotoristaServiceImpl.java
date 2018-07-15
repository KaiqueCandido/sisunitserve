/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.constantes.Global;
import br.com.sisunit.corsfilter.jms.NotificationProducer;
import br.com.sisunit.dao.MotoristaDao;
import br.com.sisunit.entity.Motorista;
import br.com.sisunit.entity.PontoDeParada;
import br.com.sisunit.objectvalue.MotoristaLocalizacaoVO;
import br.com.sisunit.service.MotoristaService;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsLeg;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsRoute;
import com.google.maps.model.Duration;
import com.google.maps.model.LatLng;
import com.google.maps.model.TravelMode;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.management.Notification;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(MotoristaService.class)
public class MotoristaServiceImpl implements MotoristaService {

    @EJB
    private MotoristaDao dao;

    @Override
    public Motorista salvar(Motorista motorista) {
        return dao.salvar(motorista);
    }

    @Override
    public Motorista atualizar(Motorista motorista) {
        return dao.atualizar(motorista);
    }

    @Override
    public Motorista excluir(Motorista motorista) {
        return dao.excluir(motorista);
    }

    @Override
    public Motorista pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<Motorista> listar() {
        return dao.listar();
    }

    @Override
    public MotoristaLocalizacaoVO notificarPassageiros(MotoristaLocalizacaoVO mlvo) {
        try {
            // Montagem do ponto de origem.
            LatLng origem = new LatLng(Double.parseDouble(mlvo.getLatitude()), Double.parseDouble(mlvo.getLongitude()));
            LatLng destino = null;
            // Verificação e montagem do ponto de destino.
            for (PontoDeParada pontoDeParada : mlvo.getPontosDeParada()) {
                // Verificando se existe algum ponto de parada restande para efetuar a notificação.
                if (pontoDeParada.getPontoVisitado() == null || pontoDeParada.getPontoVisitado() == false) {
                    // Montagem do ponto de destino.
                    destino = new LatLng(Double.parseDouble(pontoDeParada.getLatitude()), Double.parseDouble(pontoDeParada.getLongitude()));
                    // Ao encontrar um ponto o status de visitado é setado para false.
                    pontoDeParada.setPontoVisitado(Boolean.FALSE);
                    // MOntando o objeto 'GeoApiContext' com a chave privada da API do Google.
                    GeoApiContext context = new GeoApiContext.Builder()
                            .apiKey("AIzaSyDymWYcx2oPiianP1RVAaa_UDqoDhEJIXQ")
                            .build();
                    // Efetuando requisição na API 'DirectionsApi' com os dados montados anteriormente.
                    DirectionsResult result = DirectionsApi.newRequest(context)
                            .mode(TravelMode.DRIVING)
                            .origin(origem).destination(destino)
                            .await();
                    // Verificando se a requisição retornou alguma rota.
                    if (result.routes.length > 0) {
                        // Caso retorno com os dados validados é montado o objeto 'Duration',
                        // sendo assim possivel verificar quanto tempo falta até o proximo ponto de parada.
                        DirectionsRoute route = result.routes[0];
                        DirectionsLeg legs = route.legs[0];
                        Duration duration = legs.duration;
                        // Se a duração até o proximo ponto de parada for menor ou igual a quinze minutos 
                        // é efetuada a notificação.
                        if (duration.inSeconds <= Global.QUINZE_MINUTOS) {
                            new NotificationProducer().notificarPassageiros(mlvo);
                            // O atributo 'pontoVisitado' do ponto de parada é setado para 'true'
                            // para que não seja efetuada uma segunda notifação indevida.
                            pontoDeParada.setPontoVisitado(Boolean.TRUE);
                        }
                    }
                    // Caso seja encontrado um ponto valido o 'For' é interrompido.
                    break;
                }
            }
        } catch (NumberFormatException | ApiException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return mlvo;
    }

}
