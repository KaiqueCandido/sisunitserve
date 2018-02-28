package br.com.sisunit.entity;

import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-04T09:37:10")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, String> senha;
    public static volatile SingularAttribute<Conta, StatusDoCadastroEnum> statusDoCadastro;
    public static volatile SingularAttribute<Conta, Long> id;
    public static volatile SingularAttribute<Conta, String> login;

}