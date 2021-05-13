package es.um.asio.domain.sgi.model.reporteEtico;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelReporteEticoAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelReporteEticoAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 231577856485107917L;

	public static final String TABLE = "RelReporteEticoAutores_sgi";

	private String idAutor;

	private String idReporteEtico;
}
