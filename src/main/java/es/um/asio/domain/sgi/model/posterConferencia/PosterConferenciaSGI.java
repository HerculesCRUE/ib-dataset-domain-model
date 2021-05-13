package es.um.asio.domain.sgi.model.posterConferencia;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = PosterConferenciaSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PosterConferenciaSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6708309763761215367L;

	public static final String TABLE = "PosterConferencia_sgi";

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
