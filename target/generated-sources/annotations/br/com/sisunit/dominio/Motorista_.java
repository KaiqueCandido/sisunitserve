package br.com.sisunit.dominio;

import br.com.sisunit.enums.Genero;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-26T21:12:51")
@StaticMetamodel(Motorista.class)
public class Motorista_ extends Pessoa_ {

    public static volatile SingularAttribute<Motorista, Genero> genero;
    public static volatile SingularAttribute<Motorista, String> cpf;
    public static volatile SingularAttribute<Motorista, String> nome;
    public static volatile SingularAttribute<Motorista, Date> dataNascimento;
    public static volatile SingularAttribute<Motorista, String> cnh;

}