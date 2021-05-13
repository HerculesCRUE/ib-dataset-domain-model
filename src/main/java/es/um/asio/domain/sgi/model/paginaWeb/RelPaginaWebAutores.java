package es.um.asio.domain.sgi.model.paginaWeb;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPaginaWebAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPaginaWebAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 3280971218084368463L;

	public static final String TABLE = "RelPaginaWebAutores_sgi";

	private String idPaginaWeb;

	private String idAutor;

}
