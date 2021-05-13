package es.um.asio.domain.sgi.model.dossier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = DossierSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DossierSGI extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = 7128170655480786363L;

	public static final String TABLE = "Dossier_sgi";

	protected String id;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String idseRelacionaConContratoProyecto;
	protected String idseRelacionaConReporte;
	protected String idseRelacionaConProyecto;
	protected String descripcion;
	protected String identificador;
	protected String titulo;
	protected String oclcnum;
	protected String idorganizacionCorrespondiente;
}
