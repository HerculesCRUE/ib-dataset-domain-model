package es.um.asio.domain.sgi.model.comun;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = PromovidoPorFuenteDeFinanciacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PromovidoPorFuenteDeFinanciacionSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2001876967782497007L;

	public static final String TABLE = "PromovidoPorFuenteDeFinanciacion_sgi";

	protected String id;
	protected String idpromovidoPorFuenteDeOrganizacion;
	protected String idfondosDeProgramaDeFinanciacion;
}
