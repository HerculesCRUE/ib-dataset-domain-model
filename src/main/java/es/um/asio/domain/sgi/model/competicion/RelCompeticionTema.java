package es.um.asio.domain.sgi.model.competicion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelCompeticionTema.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelCompeticionTema extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6984174451991432253L;

	public static final String TABLE = "RelCompeticionTema_sgi";

	private String idTema;

	private String idCompeticion;
}
