package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Proyecto extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8659773813811519054L;

	/**
	 * Mapping of field IDPROYECTO.
	 */
	private Long idProyecto;

	/**
	 * Mapping of field NOMBRE.
	 */
	private String nombre;

	/**
	 * Mapping of field PROYECTOFINALISTA.
	 */
	private String proyectoFinalista;

	/**
	 * Mapping of field LIMITATIVO.
	 */
	private String limitativo;

	/**
	 * Mapping of field TIPOFINANCIACION.
	 */
	private String tipofinanciacion;

	/**
	 * Mapping of field AMBITO_GEOGRAFICO.
	 */
	private String ambitoGeografico;

}
