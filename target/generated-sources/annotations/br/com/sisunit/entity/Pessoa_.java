package br.com.sisunit.entity;

import br.com.sisunit.embeddable.Contato;
import br.com.sisunit.embeddable.DocumentosPessoais;
import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.entity.Conta;
import br.com.sisunit.enums.SexoEnum;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-04T09:37:10")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-20T10:49:21")
>>>>>>> 3c8979821c8ed7f9f650af0dd5501665f05fe8f8
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, Endereco> endereco;
    public static volatile SingularAttribute<Pessoa, Conta> conta;
    public static volatile SingularAttribute<Pessoa, DocumentosPessoais> documentosPessoais;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, String> sobrenome;
    public static volatile SingularAttribute<Pessoa, SexoEnum> sexo;
    public static volatile SingularAttribute<Pessoa, Contato> contato;
    public static volatile SingularAttribute<Pessoa, Date> dataDeNascimento;

}