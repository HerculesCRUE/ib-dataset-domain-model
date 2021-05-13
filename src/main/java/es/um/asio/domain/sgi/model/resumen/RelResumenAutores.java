package es.um.asio.domain.sgi.model.resumen;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelResumenAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelResumenAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2161956076159176817L;

	public static final String TABLE = "RelResumenAutores_sgi";

	private String idAutor;

	private String idResumen;
}
