package es.um.asio.domain.patentes;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Patentes.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Patente extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7085925266775097664L;

	/**
	 * Mapping of field IDPATENTE.
	 */
	private long idPatente;

	/**
	 * Mapping of field TIPO.
	 */
	private String tipo;

	/**
	 * Mapping of field REFERENCIA.
	 */
	private String referencia;

	/**
	 * Mapping of field TITULO.
	 */
	private String titulo;

}
