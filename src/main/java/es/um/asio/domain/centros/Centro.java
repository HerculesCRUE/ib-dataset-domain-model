package es.um.asio.domain.centros;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Centros.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Centro extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CED_CODIGO.
     */
	protected String cedcodigo;

    /**
     * Mapping of field CED_NOMBRE.
     */
    private String cednombre;
    
      
}
