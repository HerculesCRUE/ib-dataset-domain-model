package es.um.asio.domain.sgi.model.tesisDeGrado;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelTesisDeGradoAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelTesisDeGradoAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8527259764969812746L;

	public static final String TABLE = "RelTesisDeGradoAutores_sgi";

	private String idAutor;

	private String idTesisDeGrado;
}
