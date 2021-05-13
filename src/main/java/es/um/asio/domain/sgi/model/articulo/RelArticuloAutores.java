package es.um.asio.domain.sgi.model.articulo;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelArticuloAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelArticuloAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2267755385144204701L;

	public static final String TABLE = "RelArticuloAutores_sgi";

	String idArticulo;

	String idAutor;
}
