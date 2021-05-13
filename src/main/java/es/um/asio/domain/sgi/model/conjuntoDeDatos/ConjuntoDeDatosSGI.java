package es.um.asio.domain.sgi.model.conjuntoDeDatos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ConjuntoDeDatosSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ConjuntoDeDatosSGI extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -8395878046748179894L;

	public static final String TABLE = "ConjuntoDeDatos_sgi";

	protected String idcitadoComoFuenteDeDatos;
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
