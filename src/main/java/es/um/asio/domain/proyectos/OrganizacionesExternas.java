package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class OrganizacionesExternas extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 6576795363971529321L;

	/**
	 * Mapping of field IDPROYECTO.
	 */
	protected String idProyecto;

	/**
	 * Mapping of field TIPO_COLABORACION.
	 */
	protected String tipoColaboracion;

	/**
	 * Mapping of field ENTIDAD.
	 */
	protected String entidad;

}
