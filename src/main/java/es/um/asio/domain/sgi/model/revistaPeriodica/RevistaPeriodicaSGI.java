package es.um.asio.domain.sgi.model.revistaPeriodica;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RevistaPeriodicaSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RevistaPeriodicaSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3310556734072613763L;

	public static final String TABLE = "RevistaPeriodica_sgi";

	protected String id;
	protected String issn;
	protected String eissn;
	protected String ideditor;
	protected String oclcnum;
	protected String idorganizacionCorrespondiente;

}
