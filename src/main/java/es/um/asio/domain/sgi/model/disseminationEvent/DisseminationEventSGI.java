package es.um.asio.domain.sgi.model.disseminationEvent;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = DisseminationEventSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DisseminationEventSGI extends OperationableDataSetDataBase {
	/**
	* 
	*/
	private static final long serialVersionUID = -6084954257453875288L;

	public static final String TABLE = "DisseminationEvent_sgi";

	protected String id;
	protected String titulo;
	protected String idparticipaOrganizacion;
	protected String idparticipaPersona;
	protected String localidad;
	protected String identificador;
	protected String descripcion;
	protected String ubicadoEn;
	protected String tieneMateria;
	protected String idseRelacionaGasto;
	protected String idseRelacionaRol;
	protected String palabraClave;
	protected String idlocalizadoEn;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String informacionDeContacto;
}
