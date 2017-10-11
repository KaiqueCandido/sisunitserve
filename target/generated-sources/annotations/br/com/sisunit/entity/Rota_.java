package br.com.sisunit.entity;

import br.com.sisunit.entity.Cronograma;
import br.com.sisunit.entity.Passageiro;
import br.com.sisunit.entity.PontoDeParada;
import br.com.sisunit.entity.Veiculo;
import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T22:34:05")
@StaticMetamodel(Rota.class)
public class Rota_ { 

    public static volatile SingularAttribute<Rota, Veiculo> veiculo;
    public static volatile SingularAttribute<Rota, Cronograma> cronograma;
    public static volatile ListAttribute<Rota, Passageiro> passageirosConfirmados;
    public static volatile SingularAttribute<Rota, Long> id;
    public static volatile ListAttribute<Rota, Passageiro> passageiros;
    public static volatile ListAttribute<Rota, PontoDeParada> pontosDeParada;
    public static volatile SingularAttribute<Rota, String> descricao;
    public static volatile SingularAttribute<Rota, StatusDoCadastroEnum> status;

}