package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnDouble.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDouble extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4471306709697358829L;
	/**
	 * The value.
	 */
	public Double value;
}
