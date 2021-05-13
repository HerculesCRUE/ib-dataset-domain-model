package es.um.asio.domain.sgi.model.conferencia;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ConferenciaSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ConferenciaSGI extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6257718297700149231L;

	public static final String TABLE = "Conferencia_sgi";

	protected String id;
	protected String titulo;
	protected String identificador;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String tieneMateria;
	protected String descripcion;
	protected String idlocalizadoEn;
	protected String ubicadoEn;
	protected String idparticipaOrganizacion;
	protected String idparticipaPersona;
	protected String localidad;
	protected String idseRelacionaGasto;
	protected String idseRelacionaRol;
	protected String informacionDeContacto;
	protected String palabraClave;
	protected String abreviatura;
}
