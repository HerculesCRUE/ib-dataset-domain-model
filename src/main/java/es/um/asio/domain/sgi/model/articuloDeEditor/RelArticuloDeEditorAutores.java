package es.um.asio.domain.sgi.model.articuloDeEditor;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelArticuloDeEditorAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelArticuloDeEditorAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -1533766307808719778L;

	public static final String TABLE = "RelArticuloDeEditorAutores_sgi";

	String idArticuloDeEditor;

	String idAutor;
}
