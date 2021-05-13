package es.um.asio.domain.sgi.model.comun;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = TieneRolSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TieneRolSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6069923384717117156L;

	public static final String TABLE = "TieneRol_sgi";

	protected String id;
	protected String descripcion;
	protected String dedicacion;
	protected String tieneAreaConocimiento;
	protected String idrelacionadoConPatentAplication;
	protected String idrelacionadoConProyecto;
	protected String idrelacionadoConRelacion;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String idheredaEnPersona;
	protected Double porcentajeDeDedicacion;

}
