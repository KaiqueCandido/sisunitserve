package br.com.sisunit.entity;

import br.com.sisunit.enums.StatusDoCadastroEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-15T13:23:02")
@StaticMetamodel(PontoDeParada.class)
public class PontoDeParada_ { 

    public static volatile SingularAttribute<PontoDeParada, StatusDoCadastroEnum> statusDoCadastro;
    public static volatile SingularAttribute<PontoDeParada, String> latitude;
    public static volatile SingularAttribute<PontoDeParada, Long> id;
    public static volatile SingularAttribute<PontoDeParada, Boolean> pontoVisitado;
    public static volatile SingularAttribute<PontoDeParada, String> descricao;
    public static volatile SingularAttribute<PontoDeParada, String> longitude;

}