package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Lineas de investigacion.xml"
 */

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class LineasInvestigacion extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3427656967352060812L;

	/**
	 * Mapping of field LINE_CODIGO.
	 */
	private String lineCodigo;

	/**
	 * Mapping of field LINE_DESCRIPCION.
	 */
	private String lineDescripcion;

	/**
	 * Mapping of field LINE_INICIO.
	 */
	private String lineInicio;

}
