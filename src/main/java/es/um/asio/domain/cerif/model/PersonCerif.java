package es.um.asio.domain.cerif.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = PersonCerif.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PersonCerif extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6644831557539183668L;

	public static final String TABLE = "PersonCerif";

	protected String id2;
	protected String FamilyNames;
	protected String FirstNames;
	protected String OtherNames;
	protected String Gender;
	protected String ElectronicAddress;
	protected String AffiliationID;

}