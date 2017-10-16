package br.com.sisunit.entity;

import br.com.sisunit.entity.Cidade;
import br.com.sisunit.entity.Estado;
import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-16T15:34:59")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Estado> estado;
    public static volatile SingularAttribute<Veiculo, Cidade> cidade;
    public static volatile SingularAttribute<Veiculo, StatusDoCadastroEnum> statusDoCadastro;
    public static volatile SingularAttribute<Veiculo, Integer> qtdeAssentos;
    public static volatile SingularAttribute<Veiculo, Long> id;
    public static volatile SingularAttribute<Veiculo, String> descricao;
    public static volatile SingularAttribute<Veiculo, String> placa;

}