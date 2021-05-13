package es.um.asio.domain.sgi.model.reporte;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelReporteAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelReporteAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6732638099228422076L;

	public static final String TABLE = "RelReporteAutores_sgi";

	private String idAutor;

	private String idReporte;
}
