package es.um.asio.domain.cvn;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnFamilyNameBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnFamilyNameBean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5941116937196338380L;

	/**
	 * The first family name.
	 */
	@Column(columnDefinition = "TEXT")
	public String firstFamilyName;

	/**
	 * The second family name.
	 */
	@Column(columnDefinition = "TEXT")
	public String secondFamilyName;
}
