package br.com.sisunit.dominio;

import br.com.sisunit.enums.StatusCadastro;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-26T21:12:51")
@StaticMetamodel(PontoDeParada.class)
public class PontoDeParada_ { 

    public static volatile SingularAttribute<PontoDeParada, String> latitude;
    public static volatile SingularAttribute<PontoDeParada, String> nome;
    public static volatile SingularAttribute<PontoDeParada, Long> id;
    public static volatile SingularAttribute<PontoDeParada, Boolean> pontoVisitado;
    public static volatile SingularAttribute<PontoDeParada, String> referencia;
    public static volatile SingularAttribute<PontoDeParada, String> longitude;
    public static volatile SingularAttribute<PontoDeParada, StatusCadastro> status;

}