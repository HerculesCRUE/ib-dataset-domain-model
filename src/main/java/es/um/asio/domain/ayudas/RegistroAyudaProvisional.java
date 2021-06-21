package es.um.asio.domain.ayudas;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Registro ayudas
 * provisionales.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RegistroAyudaProvisional extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDDOCUMENTO.
	 */
	private String idDocumento;

	/**
	 * Mapping of field IDDOCUMENTOSOLICITUD.
	 */
	private String idDocumentoSolicitud;

	/**
	 * Mapping of field APROBACIONSOLICITUDAYUDA.
	 */
	private String aprobacionSolicitudAyuda;

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
	private String observaciones;

	/**
	 * Mapping of field IDGRUPOGASTO.
	 */
	private String idGrupoGasto;

	/**
	 * Mapping of field CODTIPOMONEDA.
	 */
	private String codTipoMoneda;

	/**
	 * Mapping of field IMPORTE.
	 */
	private Float importe;

	/**
	 * Mapping of field REFERENCIACONVOCANTE.
	 */
	private String referenciaConvocante;
}
