package es.um.asio.domain.sgi.model.estancia;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelEstanciaTemas.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelEstanciaTemas extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8013678204895012032L;

	public static final String TABLE = "RelEstanciaTemas_sgi";

	private String idTema;

	private String idEstancia;
}
