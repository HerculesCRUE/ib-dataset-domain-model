package es.um.asio.domain.cvn;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnDuration.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDuration extends CvnBean {

	/**
	 * The value.
	 */
	@Column(columnDefinition = "TEXT")
	public String value;

}
