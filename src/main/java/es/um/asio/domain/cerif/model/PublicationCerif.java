package es.um.asio.domain.cerif.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = PublicationCerif.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PublicationCerif extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4166483189662871436L;

	public static final String TABLE = "PublicationCerif";

	protected String id2;

	protected Date publicationDate;

	protected Long number;

	protected String volume;

	protected String issue;

	protected String edition;

	protected String startPage;

	protected String endPage;
}
