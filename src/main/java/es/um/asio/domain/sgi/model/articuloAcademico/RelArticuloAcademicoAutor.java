package es.um.asio.domain.sgi.model.articuloAcademico;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelArticuloAcademicoAutor.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelArticuloAcademicoAutor extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7364499130048118746L;

	public static final String TABLE = "RelArticuloAcademicoAutor_sgi";

	String idArticuloAcademico;

	String idAutor;
}
