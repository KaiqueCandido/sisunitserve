package br.com.sisunit.entity;

import br.com.sisunit.enums.DiasDaSemanaEnum;
import br.com.sisunit.enums.TurnoEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-04T09:37:10")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-20T10:49:21")
>>>>>>> 3c8979821c8ed7f9f650af0dd5501665f05fe8f8
@StaticMetamodel(Cronograma.class)
public class Cronograma_ { 

    public static volatile SingularAttribute<Cronograma, DiasDaSemanaEnum> diaDaSemana;
    public static volatile SingularAttribute<Cronograma, String> horarioDeInicio;
    public static volatile SingularAttribute<Cronograma, String> horarioDeTermino;
    public static volatile SingularAttribute<Cronograma, Long> id;
    public static volatile SingularAttribute<Cronograma, TurnoEnum> turno;

}