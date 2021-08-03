package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Fechas proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class FechaProyecto extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDPROYECTO.
	 */
	private Long idProyecto;

	/**
	 * Mapping of field NUMERO.
	 */
	private Long numero;

	/**
	 * Mapping of field FECHAINICIOEXPEDIENTE.
	 */
	private String fechaInicioExpediente;

	/**
	 * Mapping of field FECHAINICIOPROYECTO.
	 */
	private String fechaInicioProyecto;

	/**
	 * Mapping of field FECHAFINPROYECTO.
	 */
	private String fechaFinProyecto;

	/**
	 * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
	 */
	private String codTipoMotivoCambioFecha;

	/**
	 * Mapping of field MOTIVOCAMBIOFECHA.
	 */
	private String motivoCambioFecha;

	/**
	 * Mapping of field ESTADO.
	 */
	private String estado;
}
