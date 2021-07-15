package es.um.asio.domain.recursosHumanos;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Solicitudes recursos
 * humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SolicitudRecursosHumanos extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDDOCUMENTO.
	 */
	private String idDocumento;

	/**
	 * Mapping of field IDPERSONASOLICITANTE.
	 */
	private Long idPersonaSolicitante;

	/**
	 * Mapping of field IDCONVOCATORIARECURSOHUMANO.
	 */
	private Long idConvocatoriaRecursoHumano;

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
	 * Mapping of field IDUNIDADRECURSOHUMANO.
	 */
	private Long idUnidadRecursoHumano;

	/**
	 * Mapping of field DESCRIPCIONUNIDADRECURSOHUMANO.
	 */
	private String descripcionUnidadRecursoHumano;

	/**
	 * Mapping of field IDTERCEROCONVOCANTE.
	 */
	private Long idTerceroConvocante;

	/**
	 * Mapping of field FECHACONVOCATORIA.
	 */
	private String fechaConvocatoria;

	/**
	 * Mapping of field UNIVERSIDAD.
	 */
	private String universidad;

	/**
	 * Mapping of field CODIGOPAISUNIVERSIDAD.
	 */
	private String codigoPaisUniversidad;

	/**
	 * Mapping of field ESTUDIOSRECONOCIDOS.
	 */
	private String estudiosReconocidos;

	/**
	 * Mapping of field ANIOFINESTUDIOS.
	 */
	private Long anioFinEstudios;

	/**
	 * Mapping of field CODIGOTITULACION.
	 */
	private Long codigoTitulacion;

	/**
	 * Mapping of field IDPERSONADIRECTOR.
	 */
	private Long idPersonaDirector;

	/**
	 * Mapping of field TITULO.
	 */
	private String titulo;

	/**
	 * Mapping of field OBJETIVOS.
	 */
	@Column(columnDefinition = "TEXT")
	private String objetivos;

	/**
	 * Mapping of field METODOLOGIA.
	 */
	@Column(columnDefinition = "TEXT")
	private String metodologia;

	/**
	 * Mapping of field CRONOGRAMA.
	 */
	@Column(columnDefinition = "TEXT")
	private String cronograma;
}
