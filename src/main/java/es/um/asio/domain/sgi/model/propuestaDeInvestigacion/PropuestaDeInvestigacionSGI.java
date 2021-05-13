package es.um.asio.domain.sgi.model.propuestaDeInvestigacion;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = PropuestaDeInvestigacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PropuestaDeInvestigacionSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7291467136258107277L;

	public static final String TABLE = "PropuestaDeInvestigacion_sgi";

	protected String idseRelacionConJustificacion;
	protected String idseRelacionConContratoProyecto;
	protected String idseRelacionConProyecto;
	protected String idseRelacionConPropuestaDeInvestigacion;
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
	protected String idorganizacionCorrespondiente;
	protected String ideditorOrganizacion;
	protected String iddistribuidorOrganizacion;
	protected Date fechaInicio;
	protected Date fechaFin;
}
