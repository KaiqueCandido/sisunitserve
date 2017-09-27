package br.com.sisunit.dominio;

import br.com.sisunit.dominio.Cidade;
import br.com.sisunit.dominio.Estado;
import br.com.sisunit.enums.StatusVeiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-26T21:12:51")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Estado> estado;
    public static volatile SingularAttribute<Veiculo, Cidade> cidade;
    public static volatile SingularAttribute<Veiculo, StatusVeiculo> statusVeiculo;
    public static volatile SingularAttribute<Veiculo, Integer> qtdelugares;
    public static volatile SingularAttribute<Veiculo, Long> id;
    public static volatile SingularAttribute<Veiculo, String> descricao;
    public static volatile SingularAttribute<Veiculo, String> placa;

}