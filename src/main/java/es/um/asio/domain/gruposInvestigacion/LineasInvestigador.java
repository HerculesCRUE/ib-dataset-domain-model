package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Lineas investigador.xml"
 */

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class LineasInvestigador extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5673485213479335117L;

	/**
	 * Mapping of field IDGRUPOINVESTIGACION.
	 */
	private String idGrupoInvestigacion;

	/**
	 * Mapping of field IDPERSONAINVESTIGADOR.
	 */
	private String idPersonaInvestigador;

	/**
	 * Mapping of field FECHAINCORPORACIONGRUPO.
	 */
	private String fechaIncorporacionGrupo;

	/**
	 * Mapping of field LINE_CODIGO.
	 */
	private String lineCodigo;

	/**
	 * Mapping of field FECHAINICIOTRABAJOLINEA.
	 */
	private String fechaInicioTrabajoLinea;

	/**
	 * Mapping of field FECHAFINTRABAJOLINEA.
	 */
	private String fechaFinTrabajoLinea;

}
