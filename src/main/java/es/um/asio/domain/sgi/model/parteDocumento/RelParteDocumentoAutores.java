package es.um.asio.domain.sgi.model.parteDocumento;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelParteDocumentoAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelParteDocumentoAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 6092761688937194974L;

	public static final String TABLE = "RelParteDocumentoAutores_sgi";

	private String idParteDocumento;

	private String idAutor;

}
