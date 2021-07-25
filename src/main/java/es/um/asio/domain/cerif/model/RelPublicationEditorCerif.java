package es.um.asio.domain.cerif.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = RelPublicationEditorCerif.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RelPublicationEditorCerif extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5767206104723814864L;

	public static final String TABLE = "RelPublicationEditorCerif";

	String id;
	String idPublication;
	String idPerson;

}
