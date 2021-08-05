package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos eventos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TiposEventos extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 1567207347364257739L;

	/**
	 * Mapping of field TIEV_CODIGO.
	 */
	private String tievCodigo;

	/**
	 * Mapping of field TIEV_NOMBRE.
	 */
	private String tievNombre;

}
