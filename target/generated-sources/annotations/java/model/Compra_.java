package java.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compra.class)
public abstract class Compra_ {

	public static volatile SingularAttribute<Compra, Date> date;
	public static volatile SingularAttribute<Compra, String> observacoes;
	public static volatile SingularAttribute<Compra, Enum> emProcessamento;
	public static volatile SingularAttribute<Compra, Float> total;
	public static volatile SingularAttribute<Compra, Boolean> concluida;
	public static volatile SingularAttribute<Compra, Float> frete;
	public static volatile SingularAttribute<Compra, Enum> pagamentoIdentificado;
	public static volatile SingularAttribute<Compra, Enum> pedidoRealizado;
	public static volatile SingularAttribute<Compra, Integer> id;
	public static volatile SingularAttribute<Compra, Enum> eviado;
	public static volatile SingularAttribute<Compra, Enum> cloncluido;

}

