package es.um.asio.domain.sgi.model.actas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Actas.xml"
 */
@Entity
@Table(name = ActasSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ActasSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3226233187446143551L;

	public static final String TABLE = "Actas_sgi";

	protected String idpublicador;

	protected String id;

	protected String iccn;

	protected String isbn;

	protected String edicion;

	protected String lugarDePublicacion;

	protected String idorganizacionCorrespondiente;

	protected String doi;

	protected Date fecha;

	protected Integer paginaInicio;

	protected Integer paginaFinal;

	protected String resumen;

	protected String idautorCorrespondiente;

	protected String titulo;

	protected String palabraClave;

	protected String idtieneLibroDePublicacion;

	protected String idtieneColeccionDePublicacion;

}
