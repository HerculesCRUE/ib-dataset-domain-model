package es.um.asio.domain.sgi.model.roundTable;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelRoundTableTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelRoundTableTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4663625279548213338L;

	public static final String TABLE = "RelRoundTableTemas_sgi";

	private String idTema;

	private String idRoundTable;
}
