package es.um.asio.domain.centros;

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
public class Centro extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1365773078684611015L;

	/**
	 * Mapping of field CED_CODIGO.
	 */
	protected String cedCodigo;

	/**
	 * Mapping of field CED_NOMBRE.
	 */
	private String cedNombre;

	/**
	 * Mapping of field COD_ORGANIZACION.
	 */
	private String codOrganizacion;

	/**
	 * Mapping of field DESCRI_ORGANIZACION.
	 */
	private String descriOrganizacion;

}
