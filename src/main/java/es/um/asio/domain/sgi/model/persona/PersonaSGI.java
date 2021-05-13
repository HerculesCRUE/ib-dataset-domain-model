package es.um.asio.domain.sgi.model.persona;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = PersonaSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PersonaSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3604962207049786000L;

	public static final String TABLE = "Persona_sgi";

	protected String idseRelacionaConRelacion;
	protected String id;
	protected String nombre;
	protected String imagen;
	protected String identificador;
	protected String genero;
	protected String idgastoPersona;
	protected String descripcion;
	protected String apodo;
	protected String apellido;
	protected String titulo;
	protected String idtieneRol;
	protected String idtienePlaza;
	protected String tieneInformacionDeContacto;
	protected String idtieneCV;
	protected String idtieneContratoDeTrabajo;
	protected String tieneAreaConocimiento;
	protected String idtieneAcreditacion;
	protected String taxID;
	protected String idseleccionadoParaSerAcreditado;
	protected String paginaWeb;
	protected String idparticipaEnActividad;
	protected String palabraClave;
	protected String nombreDePila;
	protected String lineaDeInvestigacion;
	protected String fechaNacimiento;
	protected String buzonPersonal;
	protected String seRelacionaConGradoOtorgado;
	protected String idelegibleParaAcreditacion;
	protected String idsupervisorDe;
	protected String idDeInvestigacion;
	protected String eraCommonsId;
	protected String orcid;
	protected String scopusid;
	protected String segundoApellido;
}
