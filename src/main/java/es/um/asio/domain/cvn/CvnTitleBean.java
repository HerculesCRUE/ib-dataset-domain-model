package es.um.asio.domain.cvn;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnTitleBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnTitleBean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2945066509324458846L;

	/**
	 * The identification.
	 */
	public String identification;

	/**
	 * The name.
	 */
	@Column(columnDefinition = "TEXT")
	public String name;
}
