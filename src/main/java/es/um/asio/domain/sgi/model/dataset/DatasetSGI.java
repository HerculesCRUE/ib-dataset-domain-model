package es.um.asio.domain.sgi.model.dataset;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = DatasetSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DatasetSGI extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -8279650922414838217L;

	public static final String TABLE = "Dataset_sgi";

	protected String idcitadoComoFuenteDeDatos;
	protected String id;
	protected String tieneAreaConocimiento;
	protected String idautorCorrespondido;
	protected String idproducidoPorProyecto;
	protected String iccn;
	protected String isbn;
	protected String idpublicador;
	protected String edicion;
	protected String sitioDePublicacion;
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
