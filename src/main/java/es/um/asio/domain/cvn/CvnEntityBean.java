package es.um.asio.domain.cvn;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnEntityBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnEntityBean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3827270218505460998L;

	/**
	 * The id.
	 */
	public String id;

	/**
	 * The name.
	 */
	@Column(columnDefinition = "TEXT")
	public String name;
}
