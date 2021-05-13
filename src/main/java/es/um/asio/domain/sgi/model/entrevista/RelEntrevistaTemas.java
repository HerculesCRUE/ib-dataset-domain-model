package es.um.asio.domain.sgi.model.entrevista;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelEntrevistaTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelEntrevistaTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1035528172018758823L;

	public static final String TABLE = "RelEntrevistaTemas_sgi";

	private String idTema;

	private String idEntrevista;
}
