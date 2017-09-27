package br.com.sisunit.dominio;

import br.com.sisunit.dominio.Cronograma;
import br.com.sisunit.dominio.Motorista;
import br.com.sisunit.dominio.Passageiro;
import br.com.sisunit.dominio.PontoDeParada;
import br.com.sisunit.dominio.Veiculo;
import br.com.sisunit.enums.StatusCadastro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-26T21:12:51")
@StaticMetamodel(Rota.class)
public class Rota_ { 

    public static volatile SingularAttribute<Rota, Veiculo> veiculo;
    public static volatile SingularAttribute<Rota, Cronograma> cronograma;
    public static volatile SingularAttribute<Rota, Motorista> motorista;
    public static volatile ListAttribute<Rota, Passageiro> passageirosConfirmados;
    public static volatile SingularAttribute<Rota, Long> id;
    public static volatile ListAttribute<Rota, PontoDeParada> pontosDeParada;
    public static volatile SingularAttribute<Rota, String> descricao;
    public static volatile SingularAttribute<Rota, StatusCadastro> status;
    public static volatile ListAttribute<Rota, Passageiro> passageirosCadastrados;

}