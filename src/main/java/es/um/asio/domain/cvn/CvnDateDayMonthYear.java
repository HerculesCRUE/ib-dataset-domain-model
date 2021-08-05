package es.um.asio.domain.cvn;

import java.util.Date;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnDateDayMonthYear.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDateDayMonthYear extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5393189509667830102L;
	/**
	 * The value.
	 */
	public Date value;
}
