package es.um.asio.domain.importer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import es.um.asio.domain.DataSetDataBase;
import es.um.asio.domain.util.JpaConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "importer_schedule")
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImporterSchedule  extends DataSetDataBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1087578045087353173L;
	
	/**
     * The id.
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ENTITY_ID")
    @EqualsAndHashCode.Include
    private String entityId;

    /**
     * The version of DataSetData.
     */
    private long version;
	
	/**
	 * Cron expression
	 */
	private String cron;
		
	/**
	 * Import type
	 */
	private String type;
	
	/**
	 * User that creates the schedule
	 */
	private String user;
	
	private String params;
	
	/**
	 * Created date
	 */
	@Column(name = "created_date")
	private Date createdDate;
	
	/**
	 * Deleted date
	 */
	@Column(name = "deleted_date")
	private Date deletedDate;

}
