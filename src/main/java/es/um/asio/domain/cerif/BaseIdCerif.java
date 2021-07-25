package es.um.asio.domain.cerif;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public abstract class BaseIdCerif extends BaseCerif {

	private String id;
	
	private String shortId;
}
