package es.um.asio.domain.sgi.model.reservable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ReservableSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ReservableSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8830629374345002382L;

	public static final String TABLE = "Reservable_sgi";

	protected String id;
	protected String titulo;
	protected String descripcion;
	protected String palabraClave;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String idinfrastructuraDePersona;
	protected String idinfraetructuraDeOrganizacion;
}
