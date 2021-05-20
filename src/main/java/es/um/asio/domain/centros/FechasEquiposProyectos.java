package es.um.asio.domain.centros;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

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
public class FechasEquiposProyectos extends OperationableDataSetDataBase {  

    

    /**
     * Mapping of field IDPROYECTO.
     */
    protected int idproyecto;

    /**
     * Mapping of field NUMEROCOLABORADOR.
     */
    protected short numerocolaborador;

    /**
     * Mapping of field NUMERO.
     */
    protected short numero;
    
    /**
     * Mapping of field CODTIPOPARTICIPACION.
     */
    protected String codtipoparticipacion;

    /**
     * Mapping of field HORASDEDICADAS.
     */
    protected String horasdedicadas;

    /**
     * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
     */
    protected Object codtipomotivocambiofecha;

    /**
     * Mapping of field MOTIVOCAMBIOFECHA.
     */
    protected Object motivocambiofecha;

    /**
     * Mapping of field FECHAINICIOPERIODO.
     */
    protected String fechainicioperiodo;

    /**
     * Mapping of field FECHAFINPERIODO.
     */
    protected String fechafinperiodo;
    
      
}
