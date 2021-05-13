package es.um.asio.domain.sgi.model.comun;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = ElegibleParaAcreditacionSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ElegibleParaAcreditacionSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -567134235980845314L;

	public static final String TABLE = "ElegibleParaAcreditacion_sgi";

	protected String id;
	protected String titulo;
	protected String descripcion;
	protected String tituloPersonal;
	protected String tieneMateria;
	protected Date fechaPublicacion;
	protected String idautoridadGobernante;
	protected String idacreditadoPorOrganizacion;
	protected String idacreditadoPorPersona;
	protected String idemitidoPor;
}
