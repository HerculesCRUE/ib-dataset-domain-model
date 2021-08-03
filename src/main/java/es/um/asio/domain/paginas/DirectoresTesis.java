package es.um.asio.domain.paginas;

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
public class DirectoresTesis extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -99375460693333225L;

	/**
	 * Mapping of field CODIGO_TESIS.
	 */
	protected String codigoTesis;

	/**
	 * Mapping of field IDPERSONADIRECTOR.
	 */
	protected String idPersonaDirector;

}
