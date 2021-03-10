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
@Table(name = SeRelacionaRolSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SeRelacionaRolSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4553409316686713048L;

	public static final String TABLE = "SeRelacionaRol_sgi";

	private String id;
	private String idRel;
	private String descripcion;
	private String dedicacion;
	private String tieneAreaConocimiento;
	private String idrelacionadoConPatentAplication;
	private String idrelacionadoConProyecto;
	private String idrelacionadoConRelacion;
	protected Date fechaInicio;
	protected Date fechaFin;
	private String idheredaEnPersona;
	private Double porcentajeDeDedicacion;

}
