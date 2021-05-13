package es.um.asio.domain.sgi.model.actuacion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelActuacionTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelActuacionTemas extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 3446253054714133163L;

	public static final String TABLE = "RelActuacionTemas_sgi";

	private String idActuacion;

	private String idTema;
}
