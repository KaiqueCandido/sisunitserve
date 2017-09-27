package br.com.sisunit.dominio;

import br.com.sisunit.enums.DiasDaSemana;
import br.com.sisunit.enums.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-26T21:12:51")
@StaticMetamodel(Cronograma.class)
public class Cronograma_ { 

    public static volatile SingularAttribute<Cronograma, DiasDaSemana> diaDaSemana;
    public static volatile SingularAttribute<Cronograma, String> horarioDeInicio;
    public static volatile SingularAttribute<Cronograma, String> horarioDeTermino;
    public static volatile SingularAttribute<Cronograma, Long> id;
    public static volatile SingularAttribute<Cronograma, Turno> turno;

}