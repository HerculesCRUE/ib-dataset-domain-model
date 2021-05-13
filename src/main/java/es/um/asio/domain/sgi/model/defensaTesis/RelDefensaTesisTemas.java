package es.um.asio.domain.sgi.model.defensaTesis;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelDefensaTesisTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelDefensaTesisTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3973233822480263931L;

	public static final String TABLE = "RelDefensaTesisTemas_sgi";

	private String idTema;

	private String idDefensaTesis;
}
