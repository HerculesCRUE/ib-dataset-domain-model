package es.um.asio.domain.ayudas;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Subprogramas ayudas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SubprogramaAyuda extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDCONVOCATORIAAYUDA.
	 */
	private long idConvocatoriaAyuda;

	/**
	 * Mapping of field IDSUBPROGRAMA.
	 */
	private long idSubprograma;

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
