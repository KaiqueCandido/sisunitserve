package br.com.sisunit.embeddable;

import br.com.sisunit.entity.Cidade;
import br.com.sisunit.entity.Estado;
import br.com.sisunit.enums.TipoDeZonaEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T22:34:05")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, Estado> estado;
    public static volatile SingularAttribute<Endereco, Cidade> cidade;
    public static volatile SingularAttribute<Endereco, String> complemento;
    public static volatile SingularAttribute<Endereco, String> numero;
    public static volatile SingularAttribute<Endereco, String> logradouro;
    public static volatile SingularAttribute<Endereco, String> bairro;
    public static volatile SingularAttribute<Endereco, TipoDeZonaEnum> tipoDeZona;
    public static volatile SingularAttribute<Endereco, String> cep;

}