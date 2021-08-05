package es.um.asio.domain.cvn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnString.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnString extends CvnBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3747946033927827038L;
	/**
	 * The value.
	 */
	@Column(columnDefinition = "TEXT")
	public String value;

}
