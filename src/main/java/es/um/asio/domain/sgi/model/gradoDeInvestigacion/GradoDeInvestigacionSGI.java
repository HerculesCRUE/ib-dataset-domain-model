package es.um.asio.domain.sgi.model.gradoDeInvestigacion;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = GradoDeInvestigacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class GradoDeInvestigacionSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2642970682224118278L;

	public static final String TABLE = "GradoDeInvestigacion_sgi";

	protected String id;
	protected Boolean selloDeExcelencia;
	protected String idrelacionadoConRelacion;
	protected String palabraClaveOrganizacion;
	protected String palabraClaveAgente;
	protected String idorganicacionSucesora;
	protected String idorganicacionPredecesora;
	protected String identificador;
	protected String idparticipaEnActividad;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String contieneOrganizacion;
	protected String abreviatura;
	protected String titulo;
	protected String idtieneRol;
	protected String idtieneInfrastructuraReservable;
	protected String paginaWeb;
	protected String descripcion;
	protected String idlocalizadoEn;
	protected String idtieneAcreditacion;
	protected String idproveeServicio;
	protected String tieneAreaDeConocimiento;
	protected String idtieneInformacionContactoOrganizacion;
	protected String tituloPersonal;
}
