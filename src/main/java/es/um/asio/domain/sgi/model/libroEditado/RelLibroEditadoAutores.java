package es.um.asio.domain.sgi.model.libroEditado;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelLibroEditadoAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelLibroEditadoAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 8871388616392125300L;

	public static final String TABLE = "RelLibroEditadoAutores_sgi";

	private String idLibroEditado;

	private String idAutor;
}
