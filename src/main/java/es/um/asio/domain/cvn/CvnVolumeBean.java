package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnVolumeBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnVolumeBean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6934869699372097991L;

	/**
	 * The number.
	 */
	public String number;

	/**
	 * The volume.
	 */
	public String volume;
}
