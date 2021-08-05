package es.um.asio.domain.cvn;

import java.util.Date;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnDateMonthYear.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDateMonthYear extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 598792067455260702L;
	/**
	 * The value.
	 */
	public Date value;
}
