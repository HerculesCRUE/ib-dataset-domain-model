package es.um.asio.domain.patentes;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Inventores patentes.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class InventorPatente extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8103390647067659516L;

	/**
	 * Mapping of field IDPATENTE.
	 */
	private String idPatente;

	/**
	 * Mapping of field IDPERSONAINVENTOR.
	 */
	private String idPersonaInventor;

	/**
	 * Mapping of field INVENTORPRINCIPAL.
	 */
	private String inventorPrincipal;

	/**
	 * Mapping of field PERSONALPROPIO.
	 */
	private String personalPropio;

	/**
	 * Mapping of field NUMEROORDEN.
	 */
	private String numeroOrden;

	/**
	 * Mapping of field PARTICIPACION.
	 */
	private String participacion;

}
