package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Lineas UNESCO.xml"
 */

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class LineasUnesco extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 9181595871603285009L;

	/**
	 * Mapping of field LIUN_LINE_CODIGO.
	 */
	private String liunLineCodigo;

	/**
	 * Mapping of field LIUN_UNAR_CODIGO.
	 */
	private String liunUnarCodigo;

	/**
	 * Mapping of field LIUN_UNCA_CODIGO.
	 */
	private String liunUncaCodigo;

	/**
	 * Mapping of field LIUN_UNES_CODIGO.
	 */
	private String liunUnesCodigo;

}
