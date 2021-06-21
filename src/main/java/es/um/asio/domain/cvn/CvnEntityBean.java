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
	 * The id.
	 */
	public String id;

	/**
	 * The name.
	 */
	@Column(columnDefinition = "TEXT")
	public String name;
}
