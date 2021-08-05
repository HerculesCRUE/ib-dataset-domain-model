package es.um.asio.domain.cvn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnRootBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnRootBean extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4040440396656290333L;
	/**
	 * The cvn item bean.
	 */
	@OneToMany(cascade = CascadeType.ALL)
	public List<CvnItemBean> cvnItemBean;

}
