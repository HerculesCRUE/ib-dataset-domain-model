package es.um.asio.domain.paginas;

import javax.persistence.Column;
import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Articulos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Articulo extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2029648218020259580L;

	/**
	 * Mapping of field CODIGO.
	 */
	private long codigo;

	/**
	 * Mapping of field TITULO.
	 */
	private String titulo;

	/**
	 * Mapping of field ANO.
	 */
	private Long ano;

	/**
	 * Mapping of field PAIS_CODIGO.
	 */
	private Long paisCodigo;

	/**
	 * Mapping of field REIS_ISSN.
	 */
	private String reisIssn;

	/**
	 * Mapping of field CATALOGO.
	 */
	private String catalago;

	/**
	 * Mapping of field AREA.
	 */
	private Long area;

	/**
	 * Mapping of field NOMBRE_REVISTA.
	 */
	@Column(columnDefinition = "TEXT")
	private String nombreRevista;

	/**
	 * Mapping of field CUARTIL_REVISTA.
	 */
	private Long cuartilRevista;

	/**
	 * Mapping of field URL_REVISTA.
	 */
	@Column(columnDefinition = "TEXT")
	private String urlRevista;

	/**
	 * Mapping of field VOLUMEN.
	 */
	private String volumen;

	/**
	 * Mapping of field NUMERO.
	 */
	private Long numero;

	/**
	 * Mapping of field PAGDESDE.
	 */
	private Long pagDesde;

	/**
	 * Mapping of field PAGHASTA.
	 */
	private Long pagHasta;

	/**
	 * Mapping of field NUMPAG.
	 */
	private Long numPag;

	/**
	 * Mapping of field COAUT_EXT.
	 */
	private String coautExt;

	/**
	 * Mapping of field ARTI_DOI.
	 */
	private String artiDoi;

	/**
	 * Mapping of field DESCRI_CATALOGO.
	 */
	private String descriCatalogo;

	/**
	 * Mapping of field DESCRI_AREA.
	 */
	private String descriArea;

	/**
	 * Mapping of field IMPACTO_REVISTA.
	 */
	private String impactoRevista;

	/**
	 * Mapping of field REIS_NUMERO.
	 */
	private String reisNumero;

}
