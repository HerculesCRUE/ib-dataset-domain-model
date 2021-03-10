package es.um.asio.domain.sgi.model.comun;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = LocalizadoEnSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class LocalizadoEnSGI extends OperationableDataSetDataBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 831134066685663725L;

	public static final String TABLE = "LocalizadoEn_sgi";

	protected String id;
	protected String idRel;
	protected String geonamesID;
	protected String codigoPais;
	protected String nombre;
	protected String popularidad;
	protected String idclaseCaracteristica;
	protected String idcodigoCaracteristica;
	protected String idparentAMD1;
	protected String idparentAMD2;
	protected String idparentAMD3;
	protected String idparentAMD4;
}
