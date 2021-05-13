package es.um.asio.domain.sgi.model.libroEditado;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = LibroEditadoSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class LibroEditadoSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4537284265424574971L;

	public static final String TABLE = "LibroEditado_sgi";

	protected String idestaCompuestoPorPublicacionAcademica;
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
