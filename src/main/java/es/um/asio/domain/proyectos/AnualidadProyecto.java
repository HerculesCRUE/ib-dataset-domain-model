package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Anualidades proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AnualidadProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private long numeroAnualidad;
}
