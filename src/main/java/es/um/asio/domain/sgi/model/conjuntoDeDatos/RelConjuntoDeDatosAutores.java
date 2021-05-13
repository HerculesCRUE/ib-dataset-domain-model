package es.um.asio.domain.sgi.model.conjuntoDeDatos;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelConjuntoDeDatosAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelConjuntoDeDatosAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7382131083530117826L;
	public static final String TABLE = "RelConjuntoDeDatosAutores_sgi";

	String idConjuntoDeDatos;

	String idAutor;
}
