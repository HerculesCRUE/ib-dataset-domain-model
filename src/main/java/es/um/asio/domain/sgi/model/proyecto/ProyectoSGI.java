package es.um.asio.domain.sgi.model.proyecto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ProyectoSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProyectoSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 658590235940781466L;

	public static final String TABLE = "Proyecto_sgi";

	protected String id;

	protected String titulo;
	protected String idproduceObjetoInvestigacion;
	protected String modalidad;
	protected String identificador;
	protected String idgastoProyecto;
	protected String descripcion;
	protected String idcontieneProyecto;
	protected String abreviatura;
	protected String idtieneContratoProyecto;
	protected String idtieneCategorizacionProyecto;
	protected String tieneAreaConocimiento;
	protected String idrelacionadoConDossier;
	protected String idrelacionadoConReporteEtico;
	protected String idrelacionadoConJustificacion;
	protected String idrelacionadoConRol;
	protected String idparticipaEnActividad;
	protected String palabraClave;
	protected Boolean necesitaValidacionEtica;
	protected String idlocalizadoEn;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String idfinanciadoPor;
	protected Date fechaDeJustificacionPrevista;
	protected String estadoDelProyecto;
	protected String idtieneClasificacionRRHH;
	protected String idapoyadoPorFinanciacion;
	protected String idrelacionConAuditoria;
}
