package es.um.asio.domain.sgi.model.posterConferencia;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPosterConferenciaAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPosterConferenciaAutores extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4907284873727336612L;

	public static final String TABLE = "RelPosterConferenciaAutores_sgi";

	private String idPosterConferencia;

	private String idAutor;
}
