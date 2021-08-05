package es.um.asio.domain.paginas;

/**
 * Class that represents the mapping of the file "Tesis.xml"
 */

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Tesis extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -4293974005054771763L;

	/**
	 * Mapping of field CODIGO_TESIS.
	 */
	private String codigoTesis;

	/**
	 * Mapping of field TITULO_TESIS.
	 */
	private String tituloTesis;

	/**
	 * Mapping of field FECHA_LECTURA.
	 */
	private String fechaLectura;

}
