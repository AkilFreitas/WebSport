package java.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Enum> tipoDePagamento;
	public static volatile SingularAttribute<Pagamento, Date> dataDePagamento;
	public static volatile SingularAttribute<Pagamento, String> nome;
	public static volatile SingularAttribute<Pagamento, Integer> id;

}

