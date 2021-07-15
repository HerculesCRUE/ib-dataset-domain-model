package es.um.asio.domain.recursosHumanos;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Subprogramas recursos
 * humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SubprogramaRecursosHumanos extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDCONVOCATORIARECURSOHUMANO.
	 */
	private long idConvocatoriaRecursoHumano;

	/**
	 * Mapping of field IDSUBPROGRAMA.
	 */
	private String idSubprograma;

	/**
	 * Mapping of field DESCRIPCION.
	 */
	private String descripcion;

	/**
	 * Mapping of field RESUMEN.
	 */
	@Column(columnDefinition = "TEXT")
	private String resumen;

	/**
	 * Mapping of field FECHARESOLUCION.
	 */
	private String fechaResolucion;

	/**
	 * Mapping of field FECHAALEGACION.
	 */
	private String fechaAlegacion;
}
