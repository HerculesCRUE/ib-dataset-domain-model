package es.um.asio.domain.sgi.model.objetoDeInvestigacion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ObjetoDeInvestigacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ObjetoDeInvestigacionSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7160808938181451897L;

	public static final String TABLE = "ObjetoDeInvestigacion_sgi";

	protected String id;
	protected String tieneAreaConocimiento;
	protected String idautorCorrespondiente;
	protected String idproducidoPorProyecto;
}
