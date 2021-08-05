package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnPageBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnPageBean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3535790703610666419L;

	/**
	 * The final page.
	 */
	public String finalPage;

	/**
	 * The initial page.
	 */
	public String initialPage;
}
