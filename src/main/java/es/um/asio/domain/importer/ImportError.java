package es.um.asio.domain.importer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
public class ImportError {
	private String jobExecutionId;
	private String description;	
}
