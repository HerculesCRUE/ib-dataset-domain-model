package es.um.asio.domain.sgi.model.patente;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPatenteAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPatenteAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 8075962165352338801L;

	public static final String TABLE = "RelPatenteAutores_sgi";

	private String idPatente;

	private String idAutor;
}
