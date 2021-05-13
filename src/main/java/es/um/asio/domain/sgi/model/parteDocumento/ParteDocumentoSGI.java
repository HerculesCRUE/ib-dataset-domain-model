package es.um.asio.domain.sgi.model.parteDocumento;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ParteDocumentoSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ParteDocumentoSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6242030849989753561L;

	public static final String TABLE = "ParteDocumento_sgi";

	protected String id_o;
	protected String lugarDePublicacion;
	protected String id;
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
