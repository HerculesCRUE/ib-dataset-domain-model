package es.um.asio.domain.sgi.model.documentoContenedor;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelDocumentoContenedorAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelDocumentoContenedorAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -4958297248469482493L;

	public static final String TABLE = "RelDocumentoContenedorAutores_sgi";

	String idDocumentoContenedor;

	String idAutor;

}
