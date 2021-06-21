package es.um.asio.domain.cvn;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnAuthorBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnAuthorBean extends CvnBean {

	/**
	 * The cvn family name bean.
	 */
	@OneToOne(cascade = CascadeType.ALL)
	public CvnFamilyNameBean cvnFamilyNameBean;

	/**
	 * The given name.
	 */
	@Column(columnDefinition = "TEXT")
	public String givenName;

	/**
	 * The signature.
	 */
	@Column(columnDefinition = "TEXT")
	public String signature;

	/**
	 * The signature order.
	 */
	public Integer signatureOrder;
}
