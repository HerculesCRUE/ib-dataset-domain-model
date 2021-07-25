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
public class PublicacionCerif extends BaseIdCerif {
	
	private String tipo;
	
	private String titulo;
	
	private String paginaInicio;
	
	private String paginaFin;
	
	private String fechaPublicacion;
	
	private String DOI;
}
