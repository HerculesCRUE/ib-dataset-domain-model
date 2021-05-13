package es.um.asio.domain.sgi.model.actas;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelActasAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelActasAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 8707144924251879225L;

	public static final String TABLE = "RelActasAutores_sgi";

	String idActas;

	String idAutor;

}
