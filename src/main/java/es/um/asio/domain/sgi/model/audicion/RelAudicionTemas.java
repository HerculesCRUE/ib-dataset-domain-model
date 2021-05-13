package es.um.asio.domain.sgi.model.audicion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelAudicionTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelAudicionTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6098397331693971270L;

	public static final String TABLE = "RelAudicionTemas_sgi";

	private String idTema;

	private String idAudicion;
}
