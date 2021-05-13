package es.um.asio.domain.sgi.model.seccionLibro;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = SeccionLibroSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SeccionLibroSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5402527705716255827L;

	public static final String TABLE = "SeccionLibro_sgi";

	protected String paginaInicioSeccion;
	protected String paginaFinalSeccion;
	protected String edicion;
	protected String id;
	protected String idorganizacionCorrespondiente;
	protected String lugarDePublicacion;
	protected String ideditor;
	protected String doi;
	protected Date fecha;
	protected Integer paginaInicio;
	protected Integer paginaFinal;
	protected String resumen;
	protected String idautorCorrespondido;
	protected String titulo;
	protected String palabraClave;
	protected String idtieneLibroDePublicacion;
	protected String idtieneColeccionDePublicacion;
}
