package es.um.asio.domain.sgi.model.libro;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelLibroAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelLibroAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -4710846515993334683L;

	public static final String TABLE = "RelLibroAutores_sgi";

	String idLibro;
	String idAutor;

}
