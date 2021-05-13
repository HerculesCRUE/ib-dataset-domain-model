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
@Table(name = ApoyadoPorFinanciacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ApoyadoPorFinanciacionSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -224283512965832686L;

	public static final String TABLE = "ApoyadoPorFinanciacion_sgi";

	protected String id;
	protected String identificador;
	protected String idcontieneMontoFinanciacion;
	protected String idapoyaContratoTrabajo;
	protected String idapoyaContratoProyecto;
	protected String idtieneContrato;
	protected String tieneAreaConocimiento;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String idfinanciadoPor;
	protected Boolean financiacionPublica;
}
