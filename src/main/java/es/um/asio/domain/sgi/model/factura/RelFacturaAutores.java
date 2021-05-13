package es.um.asio.domain.sgi.model.factura;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelFacturaAutores.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelFacturaAutores extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -6658180372349081719L;

	public static final String TABLE = "RelFacturaAutores_sgi";

	private String idFactura;
	private String idAutor;

}
