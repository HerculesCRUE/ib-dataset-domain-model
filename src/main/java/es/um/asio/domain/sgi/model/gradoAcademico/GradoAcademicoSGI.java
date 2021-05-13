package es.um.asio.domain.sgi.model.gradoAcademico;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = GradoAcademicoSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class GradoAcademicoSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4704685860339262260L;

	public static final String TABLE = "GradoAcademico_sgi";

	protected String id;
	protected String titulo;
	protected String abreviatura;
}
