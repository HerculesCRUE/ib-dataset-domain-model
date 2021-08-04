package es.um.asio.domain.importetlresult;

import java.util.Date;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ImportEtlResult.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImportEtlResult extends DataSetDataBase {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8675168439808472063L;

	/**
	 * Date of import
	 */
	private Date dateTime;

	/**
	 * Status import
	 */
	private String status;

	/**
	 * final message of import
	 */
	private String message;

	/**
	 * endpoint of import
	 */
	private String endpoint;

}
