package es.um.asio.domain.sgi.model.libro;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = LibroSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class LibroSGI extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 1353807888765467455L;

	public static final String TABLE = "Libro_sgi";

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
