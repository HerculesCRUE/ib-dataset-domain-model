package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Centros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class FechasEquiposProyectos extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6704896151310024940L;

	/**
	 * Mapping of field IDPROYECTO.
	 */
	protected String idproyecto;

	/**
	 * Mapping of field NUMEROCOLABORADOR.
	 */
	protected String numerocolaborador;

	/**
	 * Mapping of field NUMERO.
	 */
	protected String numero;

	/**
	 * Mapping of field CODTIPOPARTICIPACION.
	 */
	protected String codtipoparticipacion;

	/**
	 * Mapping of field HORASDEDICADAS.
	 */
	protected String horasdedicadas;

	/**
	 * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
	 */
	protected String codtipomotivocambiofecha;

	/**
	 * Mapping of field MOTIVOCAMBIOFECHA.
	 */
	protected String motivocambiofecha;

	/**
	 * Mapping of field FECHAINICIOPERIODO.
	 */
	protected String fechainicioperiodo;

	/**
	 * Mapping of field FECHAFINPERIODO.
	 */
	protected String fechafinperiodo;

}
