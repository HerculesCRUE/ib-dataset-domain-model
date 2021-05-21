package es.um.asio.domain.personas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Personas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Persona extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field NOMBRE.
     */
    private String nombre;
    
    /**
     * Mapping of field PERS_CENT_CODIGO.
     */
    private String persCentCodigo;
    
    /**
     * Mapping of field CED_NOMBRE.
     */
    private String cedNombre;
    
    /**
     * Mapping of field PERS_DEPT_CODIGO.
     */
    private String persDeptCodigo;
    
    /**
     * Mapping of field DEP_NOMBRE.
     */
    private String depNombre;  
    
    /**
     * Mapping of field SEXO.
     */
    private String sexo;   
}
