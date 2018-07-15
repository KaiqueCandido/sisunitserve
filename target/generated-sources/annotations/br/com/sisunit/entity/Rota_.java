package br.com.sisunit.entity;

import br.com.sisunit.entity.Cronograma;
import br.com.sisunit.entity.Motorista;
import br.com.sisunit.entity.Passageiro;
import br.com.sisunit.entity.PontoDeParada;
import br.com.sisunit.entity.Veiculo;
import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-15T13:23:02")
@StaticMetamodel(Rota.class)
public class Rota_ { 

    public static volatile SingularAttribute<Rota, Veiculo> veiculo;
    public static volatile SingularAttribute<Rota, Cronograma> cronograma;
    public static volatile SingularAttribute<Rota, StatusDoCadastroEnum> statusDoCadastro;
    public static volatile SingularAttribute<Rota, Motorista> motorista;
    public static volatile SingularAttribute<Rota, Long> id;
    public static volatile ListAttribute<Rota, Passageiro> passageiros;
    public static volatile ListAttribute<Rota, PontoDeParada> pontosDeParada;
    public static volatile SingularAttribute<Rota, String> descricao;

}