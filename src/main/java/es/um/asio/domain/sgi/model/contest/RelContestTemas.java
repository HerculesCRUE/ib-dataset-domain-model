package es.um.asio.domain.sgi.model.contest;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelContestTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelContestTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6572038323662729254L;

	public static final String TABLE = "RelContestTemas_sgi";

	private String idTema;

	private String idContest;
}
