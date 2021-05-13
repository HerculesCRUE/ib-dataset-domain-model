package es.um.asio.domain.sgi.model.tesisDeDoctorado;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelTesisDeDoctoradoAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelTesisDeDoctoradoAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2893074521356316938L;

	public static final String TABLE = "RelTesisDeDoctoradoAutores_sgi";

	private String idAutor;

	private String idTesisDeDoctorado;
}
