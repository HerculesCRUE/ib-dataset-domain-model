package es.um.asio.domain.paginas;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Alegaciones.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Alegacion extends OperationableDataSetDataBase {

	/**
	 * Mapping of field NUMERO.
	 */
	private long numero;

	/**
	 * Mapping of field COD_TIPO.
	 */
	private long codTipo;

	/**
	 * Mapping of field TITULO.
	 */
	private String titulo;

	/**
	 * Mapping of field IDPERSONA.
	 */
	private long idPersona;

	/**
	 * Mapping of field MOTIVO.
	 */
	@Column(columnDefinition = "TEXT")
	private String motivo;

	/**
	 * Mapping of field TEXTO.
	 */
	@Column(columnDefinition = "TEXT")
	private String texto;

	/**
	 * Mapping of field RESUELVE_TEXTO.
	 */
	@Column(columnDefinition = "TEXT")
	private String resuelveText;

	/**
	 * Mapping of field FECHA.
	 */
	private String fecha;

	/**
	 * Mapping of field ESTADO.
	 */
	private String estado;
}
