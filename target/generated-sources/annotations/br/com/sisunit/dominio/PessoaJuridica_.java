package br.com.sisunit.dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-26T21:12:51")
@StaticMetamodel(PessoaJuridica.class)
public class PessoaJuridica_ extends Cliente_ {

    public static volatile SingularAttribute<PessoaJuridica, String> cnpj;
    public static volatile SingularAttribute<PessoaJuridica, String> razaoSocial;
    public static volatile SingularAttribute<PessoaJuridica, String> RepresentanteLegal;

}