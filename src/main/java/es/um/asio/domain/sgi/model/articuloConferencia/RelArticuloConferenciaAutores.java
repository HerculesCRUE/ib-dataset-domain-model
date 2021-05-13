package es.um.asio.domain.sgi.model.articuloConferencia;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelArticuloConferenciaAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelArticuloConferenciaAutores extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2343682084224105180L;

	public static final String TABLE = "RelArticuloConferenciaAutores_sgi";

	String idArticuloConferencia;

	String idAutor;
}
