package es.um.asio.domain.sgi.model.articuloDeEditor;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ArticuloDeEditorSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ArticuloDeEditorSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6030263375835192191L;

	public static final String TABLE = "ArticuloDeEditor_sgi";

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
