package es.um.asio.domain.sgi.model.seccionLibro;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelSeccionLibroAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelSeccionLibroAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1426063903857113165L;

	public static final String TABLE = "RelSeccionLibroAutores_sgi";

	private String idAutor;

	private String idSeccionLibro;
}
