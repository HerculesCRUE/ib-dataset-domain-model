package es.um.asio.domain.sgi.model.comun;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ProveeServicioSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProveeServicioSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6405819949784160266L;

	public static final String TABLE = "ProveeServicio_sgi";

	protected String id;
	protected String titulo;
	protected String idproduceReporte;
	protected String identificador;
	protected String descripcion;
	protected String idprovistoPorOrganizacion;
}
