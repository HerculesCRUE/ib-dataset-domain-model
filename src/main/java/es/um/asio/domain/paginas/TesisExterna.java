package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tesis externas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TesisExterna extends OperationableDataSetDataBase {

	/**
	 * Mapping of field TESI_CODIGO.
	 */
	private String tesiCodigo;

	/**
	 * Mapping of field TESI_DNIAUTOR.
	 */
	private String tesiDniAutor;

	/**
	 * Mapping of field TESI_TITULOTESIS.
	 */
	private String tesiTituloTesis;

	/**
	 * Mapping of field TESI_PREMIO.
	 */
	private String tesiPremio;

	/**
	 * Mapping of field TESI_MENCIONEURO.
	 */
	private String tesiMencioEuro;

	/**
	 * Mapping of field TESI_FECHALECTURA.
	 */
	private String tesiFechaLectura;

	/**
	 * Mapping of field TESI_UNIV_NOMBRE.
	 */
	private String tesiUnivNombre;

	/**
	 * Mapping of field TESI_AREA_CODIGOTOB.
	 */
	private Long tesiAreaCodigoTob;

	/**
	 * Mapping of field TESI_AREA_CODIGOTOP.
	 */
	private Long tesiAreaCodigoTop;

	/**
	 * Mapping of field TESI_ESTU_ESTUDIOENT.
	 */
	private Long tesiEstuEstudioEnt;

	/**
	 * Mapping of field TESI_ESTU_ESTUDIOSAL.
	 */
	private Long tesiEstuEstudioSal;

	/**
	 * Mapping of field TESI_UNAR_CODIGO.
	 */
	private Long tesiUnarCodigo;

	/**
	 * Mapping of field TESI_UNCA_CODIGO.
	 */
	private Long tesiUncaCodigo;

	/**
	 * Mapping of field TESI_UNES_CODIGO.
	 */
	private Long tesiUnesCodigo;

	/**
	 * Mapping of field TESI_UNAR_CODIGO2.
	 */
	private Long tesiUnarCodigo2;

	/**
	 * Mapping of field TESI_UNCA_CODIGO2.
	 */
	private Long tesiUncaCodigo2;

	/**
	 * Mapping of field TESI_UNES_CODIGO2.
	 */
	private Long tesiUnesCodigo2;
}