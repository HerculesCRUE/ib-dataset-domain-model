package es.um.asio.domain.cvn;

import java.util.Date;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnDateYear.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDateYear extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3554973967218970443L;
	/**
	 * The value.
	 */
	public Date value;
}
