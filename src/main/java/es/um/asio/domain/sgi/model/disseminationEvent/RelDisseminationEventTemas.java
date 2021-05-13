package es.um.asio.domain.sgi.model.disseminationEvent;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelDisseminationEventTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelDisseminationEventTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4193442652177444486L;

	public static final String TABLE = "RelDisseminationEventTemas_sgi";

	private String idTema;

	private String idDisseminationEvent;
}
