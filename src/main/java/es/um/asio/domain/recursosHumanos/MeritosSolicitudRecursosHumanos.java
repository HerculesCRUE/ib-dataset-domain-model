package es.um.asio.domain.recursosHumanos;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Meritos solicitudes recursos
 * humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class MeritosSolicitudRecursosHumanos extends OperationableDataSetDataBase {

	/**
	 * Mapping of field IDDOCUMENTO.
	 */
	private String idDocumento;

	/**
	 * Mapping of field TITULO.
	 */
	@Column(columnDefinition = "TEXT")
	private String titulo;

	/**
	 * Mapping of field DESCRIPCION.
	 */
	private String descripcion;
}
