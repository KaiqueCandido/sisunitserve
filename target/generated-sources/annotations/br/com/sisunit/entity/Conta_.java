package br.com.sisunit.entity;

import br.com.sisunit.entity.Permissao;
import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-01T17:04:12")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, String> senha;
    public static volatile ListAttribute<Conta, Permissao> permissoes;
    public static volatile SingularAttribute<Conta, StatusDoCadastroEnum> statusDoCadastro;
    public static volatile SingularAttribute<Conta, Long> id;
    public static volatile SingularAttribute<Conta, String> login;

}