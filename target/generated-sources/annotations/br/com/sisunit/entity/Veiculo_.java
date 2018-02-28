package br.com.sisunit.entity;

import br.com.sisunit.entity.Cidade;
import br.com.sisunit.entity.Estado;
import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-04T09:37:10")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-20T10:49:21")
>>>>>>> 3c8979821c8ed7f9f650af0dd5501665f05fe8f8
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