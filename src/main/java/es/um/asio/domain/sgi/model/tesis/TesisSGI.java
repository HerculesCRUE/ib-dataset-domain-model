package es.um.asio.domain.sgi.model.tesis;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = TesisSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TesisSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6417311009901328015L;

	public static final String TABLE = "Tesis_sgi";

	protected String id;
	protected String idtieneLibroDePublicacion;
	protected String idtieneColeccionDePublicacion;
	protected String titulo;
	protected String palabraClave;
	protected Integer paginaInicio;
	protected Integer paginaFinal;
	protected Date fecha;
	protected String idautorCorrespondiente;
	protected String resumen;
	protected String doi;
	protected String lugarDePublicacion;
	protected String abreviatura;
	protected String idorganizacionCorrespondiente;
}
