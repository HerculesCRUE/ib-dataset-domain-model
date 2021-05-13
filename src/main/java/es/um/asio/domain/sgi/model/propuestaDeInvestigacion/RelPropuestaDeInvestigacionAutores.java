package es.um.asio.domain.sgi.model.propuestaDeInvestigacion;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPropuestaDeInvestigacionAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPropuestaDeInvestigacionAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6769159345910865481L;

	public static final String TABLE = "RelPropuestaDeInvestigacionAutores_sgi";

	private String idPropuestaDeInvestigacion;

	private String idAutor;

}
