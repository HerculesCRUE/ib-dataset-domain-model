package es.um.asio.domain.sgi.model.resumenDeEvaluacion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelResumenDeEvaluacionAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelResumenDeEvaluacionAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7480722690272453429L;

	public static final String TABLE = "RelResumenDeEvaluacionAutores_sgi";

	private String idAutor;

	private String idResumenDeEvaluacion;
}
