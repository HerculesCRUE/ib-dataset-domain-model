package es.um.asio.domain.sgi.model.comun;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = TemaSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TemaSGI extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6867977903265548001L;

	public static final String TABLE = "Tema_sgi";

	private String id;
	private String nombre;
}
