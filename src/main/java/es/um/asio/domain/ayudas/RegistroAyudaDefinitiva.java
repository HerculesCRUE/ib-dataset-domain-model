package es.um.asio.domain.ayudas;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Registros ayudas
 * definitivas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RegistroAyudaDefinitiva extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDDOCUMENTO.
	 */
	private String idDocumento;

	/**
	 * Mapping of field IDDOCUMENTOSOLICITUD.
	 */
	private String idDocumentoSolicitud;

	/**
	 * Mapping of field IDCONVOCATORIAAYUDA.
	 */
	private Long idConvocatoriaAyuda;

	/**
	 * Mapping of field DESCRIPCIONCONVOCATORIA.
	 */
	private String descripcionConvocatoria;

	/**
	 * Mapping of field REFERENCIACONVOCATORIA.
	 */
	private String referenciaConvocatoria;

	/**
	 * Mapping of field IDSUBPROGRAMA.
	 */
	private Long idSubprograma;

	/**
	 * Mapping of field DESCRIPCIONSUBPROGRAMA.
	 */
	private String descripcionSubprograma;

	/**
	 * Mapping of field IDUNIDADAYUDA.
	 */
	private Long idUnidadAyuda;

	/**
	 * Mapping of field DESCRIPCIONUNIDADAYUDA.
	 */
	@Column(columnDefinition = "TEXT")
	private String descripcionUnidadAyuda;

	/**
	 * Mapping of field IDTERCEROCONVOCANTE.
	 */
	private Long idTerceroConvocante;

	/**
	 * Mapping of field FECHACONVOCATORIA.
	 */
	private String fechaConvocatoria;

	/**
	 * Mapping of field IDPERSONASOLICITANTE.
	 */
	private Long idPersonaSolicitante;

	/**
	 * Mapping of field OBSERVACIONES.
	 */
	@Column(columnDefinition = "TEXT")
	private String observaciones;

	/**
	 * Mapping of field FECHACONCESION.
	 */
	private String fechaConcesion;

	/**
	 * Mapping of field FECHAINICIOEJECUCIONPROYECTO.
	 */
	private String fechaInicioEjecucionProyecto;

	/**
	 * Mapping of field FECHAFINEJECUCIONPROYECTO.
	 */
	private String fechaFinEjecucionProyecto;

	/**
	 * Mapping of field CODTIPOMONEDA.
	 */
	private String codTipoMoneda;

	/**
	 * Mapping of field IMPORTE.
	 */
	private Float importe;

	/**
	 * Mapping of field REFERENCIACONVOCATORIA_1.
	 */
	private String referenciaConvocatoria1;
}
