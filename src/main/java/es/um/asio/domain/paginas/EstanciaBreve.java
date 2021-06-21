package es.um.asio.domain.paginas;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Estancias breves.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class EstanciaBreve extends OperationableDataSetDataBase {

	/**
	 * Mapping of field ESTA_SOLB_NUMERO.
	 */
	private long estaSolbNumero;

	/**
	 * Mapping of field ESTA_NUMERO.
	 */
	private long estaNumero;

	/**
	 * Mapping of field IDPERSONABECARIO.
	 */
	private Long idPersonaBecario;

	/**
	 * Mapping of field SOLB_TITUPROYECTO.
	 */
	private String solbTituProyecto;

	/**
	 * Mapping of field ESTA_PAIS_CODIGO.
	 */
	private Long estaPaisCodigo;

	/**
	 * Mapping of field ESTA_COM_CODIGO.
	 */
	private Long estaComCodigo;

	/**
	 * Mapping of field ESTA_CIUDAD.
	 */
	private String estaCiudad;

	/**
	 * Mapping of field ESTA_CENTRO.
	 */
	private String estaCentro;

	/**
	 * Mapping of field IDPERSONARESPONSABLE.
	 */
	private Long idPersonaResponsable;

	/**
	 * Mapping of field DURACION_PREVISTA.
	 */
	private Long duracionPrevista;

	/**
	 * Mapping of field ESTA_FECHAIDAPREVIS.
	 */
	private String estaFechaIdaPrevis;

	/**
	 * Mapping of field ESTA_PRESUPVIAJE.
	 */
	private Float estaPresupViaje;

	/**
	 * Mapping of field ESTA_OBJETO_ESTANCIA.
	 */
	@Column(columnDefinition = "TEXT")
	private String estaObjetoEstancia;

	/**
	 * Mapping of field ESTA_CONCEDIDOESTANCIA.
	 */
	private Float estaConcedidoEstancia;

	/**
	 * Mapping of field ESTA_TOTCONCEDIDO.
	 */
	private Float estaTotConcedido;

	/**
	 * Mapping of field ESTA_ESTADO.
	 */
	private String estaEstado;
}