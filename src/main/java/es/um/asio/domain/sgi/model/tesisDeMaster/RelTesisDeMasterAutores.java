package es.um.asio.domain.sgi.model.tesisDeMaster;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelTesisDeMasterAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelTesisDeMasterAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 336899259786266502L;

	public static final String TABLE = "RelTesisDeMasterAutores_sgi";

	private String idAutor;

	private String idTesisDeMaster;
}
