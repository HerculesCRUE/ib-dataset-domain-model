package es.um.asio.domain.sgi.model.justificacion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelJustificacionAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelJustificacionAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -8992828556039129264L;

	public static final String TABLE = "RelJustificacionAutores_sgi";

	String idJustificacion;

	String idAutor;
}
