package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class InventorPatente.
 */
@Getter
@Setter
@ToString
public class InventorPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field INVT_PATE_NUMERO.
     */
    private long invtPateNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field INVT_ORDEN.
     */
    private long invtOrden;
}