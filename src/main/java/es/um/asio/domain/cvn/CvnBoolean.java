package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnBoolean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnBoolean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6524173161797102610L;
	/**
	 * The value.
	 */
	public Boolean value;
}
