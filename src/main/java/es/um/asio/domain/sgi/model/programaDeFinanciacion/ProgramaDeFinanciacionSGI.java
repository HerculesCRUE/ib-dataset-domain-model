package es.um.asio.domain.sgi.model.programaDeFinanciacion;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ProgramaDeFinanciacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProgramaDeFinanciacionSGI extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -4736391094977201252L;

	public static final String TABLE = "ProgramaDeFinanciacion_sgi";

	protected String id;
	protected String titulo;
	protected String identificador;
	protected String descripcion;
	protected String idcontieneProgramaDeFinanciacion;
	protected String idrelacionadoConDossier;
	protected String idpromocionadoPorOrganizacionFinanciera;
	protected Date intervaloDeTiempo;
	protected String idtieneProgramaDeClasificacion;
	protected String idtieneParteDeProgramaDeFinanciacion;
	protected String idpromovidoPorFuenteDeFinanciacion;

}
