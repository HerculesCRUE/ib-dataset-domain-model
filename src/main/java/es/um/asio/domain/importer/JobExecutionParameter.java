package es.um.asio.domain.importer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BATCH_JOB_EXECUTION_PARAMS")
@Getter
@Setter
@NoArgsConstructor
public class JobExecutionParameter {
	
	@Id
	@Column(name = "JOB_EXECUTION_ID")
	private Long jobExecutionId;
	
	@Column(name = "KEY_NAME")
	private String key;
	
	@Column(name = "STRING_VAL")
	private String value;
}
