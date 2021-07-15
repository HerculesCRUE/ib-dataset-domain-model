package es.um.asio.domain.cerif.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPublicationAuthorsCerif.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPublicationAuthorsCerif extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3311920887639524676L;

	public static final String TABLE = "RelPublicationAuthorsCerif";

	String id;
	String idPublication;
	String idPerson;
}
