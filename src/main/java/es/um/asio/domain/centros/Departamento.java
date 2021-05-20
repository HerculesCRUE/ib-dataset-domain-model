package es.um.asio.domain.centros;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Departamentos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Departamento extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field DEP_CODIGO.
     */
	protected String depcodigo;

    /**
     * Mapping of field DEP_NOMBRE.
     */
    private String depnombre;
    
    /**
     * Mapping of field DEP_CED_CODIGO.
     */
    private String depcedcodigo;
    
      
}
