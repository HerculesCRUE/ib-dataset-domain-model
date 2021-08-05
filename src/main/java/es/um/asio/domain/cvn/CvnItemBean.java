package es.um.asio.domain.cvn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnItemBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnItemBean extends CvnBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -325929955337588735L;

	/**
	 * The cvn author bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnAuthorBean> cvnAuthorBean;

	/**
	 * The cvn boolean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnBoolean> cvnBoolean;

	/**
	 * The cvn code group.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnCodeGroup> cvnCodeGroup;

	/**
	 * The cvn date day month year.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnDateDayMonthYear> cvnDateDayMonthYear;

	/**
	 * The cvn date month year.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnDateMonthYear> cvnDateMonthYear;

	/**
	 * The cvn date year.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnDateYear> cvnDateYear;

	/**
	 * The cvn double.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnDouble> cvnDouble;

	/**
	 * The cvn duration.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnDuration> cvnDuration;

	/**
	 * The cvn entity bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnEntityBean> cvnEntityBean;

	/**
	 * The cvn external PK bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnExternalPKBean> cvnExternalPKBean;

	/**
	 * The cvn family name bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnFamilyNameBean> cvnFamilyNameBean;

	/**
	 * The cvn page bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnPageBean> cvnPageBean;

	/**
	 * The cvn phone bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnPhoneBean> cvnPhoneBean;

	/**
	 * The cvn photo bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnPhotoBean> cvnPhotoBean;

	/**
	 * The cvn rich text.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnRichText> cvnRichText;

	/**
	 * The cvn string.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnString> cvnString;

	/**
	 * The cvn title bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnTitleBean> cvnTitleBean;

	/**
	 * The cvn volume bean.
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	public List<CvnVolumeBean> cvnVolumeBean;
}
