package es.um.asio.domain.importer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BATCH_JOB_EXECUTION")
@Getter
@Setter
@NoArgsConstructor
public class JobExecution {

	@Id
	@Column(name = "JOB_EXECUTION_ID")
	private Long id;
	
	@Column(name = "START_TIME")
	private Date startTime;
	
	@Column(name = "END_TIME")
	private Date endTime;
	
	@Column(name = "STATUS")
	private String status;
}
