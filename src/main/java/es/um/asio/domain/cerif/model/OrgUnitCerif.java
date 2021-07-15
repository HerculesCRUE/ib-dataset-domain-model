package es.um.asio.domain.cerif.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = OrgUnitCerif.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class OrgUnitCerif extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8948847585221799633L;

	public static final String TABLE = "OrgUnitCerif";

	protected String id2;

	protected String type;

	protected String name;

	protected String electronicAddress;

}
