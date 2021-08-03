package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Areas UNESCO proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AreasUNESCOProyecto extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -7121299764364635193L;

	/**
	 * Mapping of field IDPROYECTO.
	 */
	private long idProyecto;

	/**
	 * Mapping of field NUMERO.
	 */
	private long numero;

	/**
	 * Mapping of field UNAR_CODIGO.
	 */
	private long unarCodigo;

	/**
	 * Mapping of field UNCA_CODIGO.
	 */
	private long uncaCodigo;

	/**
	 * Mapping of field UNES_CODIGO.
	 */
	private long unesCodigo;

}
