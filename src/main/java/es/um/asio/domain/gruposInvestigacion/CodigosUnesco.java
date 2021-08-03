package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Codigos UNESCO.xml"
 */

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CodigosUnesco extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 979678170896658724L;

	/**
	 * Mapping of field UNES_UNAR_CODIGO.
	 */
	private String unesUnarCodigo;

	/**
	 * Mapping of field UNES_UNCA_CODIGO.
	 */
	private String unesUncaCodigo;

	/**
	 * Mapping of field UNES_CODIGO.
	 */
	private String unesCodigo;

	/**
	 * Mapping of field UNES_NOMBRE.
	 */
	private String unesNombre;

}
