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
public class ProyectoCerif extends BaseIdCerif {
	
	private String titulo;
	
	private String status;
	
	private String descripcion;
	
	private String fecInicio;
	
	private String fecFin;
}
