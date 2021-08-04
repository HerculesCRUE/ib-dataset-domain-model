package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Equipos proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class EquipoProyecto extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4032051803004992134L;

	/**
	 * Mapping of field IDPROYECTO.
	 */
	private String idProyecto;

	/**
	 * Mapping of field NUMEROCOLABORADOR.
	 */
	private String numeroColaborador;

	/**
	 * Mapping of field IDPERSONA.
	 */
	private String idPersona;

	/**
	 * Mapping of field CODTITULACION.
	 */
	private String codTitulacion;

	/**
	 * Mapping of field FECHAINICIO.
	 */
	private String fechaInicio;

	/**
	 * Mapping of field FECHAFIN.
	 */
	private String fechaFin;
}
