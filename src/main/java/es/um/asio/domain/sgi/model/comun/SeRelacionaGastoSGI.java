package es.um.asio.domain.sgi.model.comun;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = SeRelacionaGastoSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SeRelacionaGastoSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8333264337320420036L;

	public static final String TABLE = "SeRelacionaGasto_sgi";

	private String id;
	private String idRel;
	private String titulo;
	private String moneda;
	private String descripcion;
	private Date fecha;
	private String modalidadGasto;
	private String idtieneClassificacion;
	private BigDecimal cantidadMonetaria;

}
