package es.um.asio.domain.cerif;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProductoCreadorCerif extends BaseCerif {
	
	private String idProducto;
	
	private String idPersona;

}
