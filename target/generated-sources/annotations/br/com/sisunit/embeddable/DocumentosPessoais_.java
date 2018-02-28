package br.com.sisunit.embeddable;

import br.com.sisunit.entity.Estado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-04T09:37:10")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-20T10:49:21")
>>>>>>> 3c8979821c8ed7f9f650af0dd5501665f05fe8f8
@StaticMetamodel(DocumentosPessoais.class)
public class DocumentosPessoais_ { 

    public static volatile SingularAttribute<DocumentosPessoais, String> rg;
    public static volatile SingularAttribute<DocumentosPessoais, String> cpf;
    public static volatile SingularAttribute<DocumentosPessoais, Estado> estadoDeEmissaoDoRg;
    public static volatile SingularAttribute<DocumentosPessoais, String> orgaoEmissaoRg;
    public static volatile SingularAttribute<DocumentosPessoais, Date> dataDeEmissaoDoRg;

}