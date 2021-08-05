package es.um.asio.domain.cvn;

import javax.persistence.MappedSuperclass;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnBean.
 */
@MappedSuperclass
@Getter
@Setter
@ToString(includeFieldNames = true)
public abstract class CvnBean extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6951648799359695524L;
	/**
	 * The code.
	 */
	public String code;
}
