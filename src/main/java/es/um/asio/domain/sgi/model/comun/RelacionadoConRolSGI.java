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
@Table(name = RelacionadoConRolSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelacionadoConRolSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6379076357433547264L;

	public static final String TABLE = "RelacionadoConRol_sgi";

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
