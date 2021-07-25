package es.um.asio.domain.cerif.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPublicationPublishersCerif.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPublicationPublishersCerif extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2251507391047390653L;

	public static final String TABLE = "RelPublicationPublishersCerif";

	String id;
	String idPublication;
	String idPerson;
}
