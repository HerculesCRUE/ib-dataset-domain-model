package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Autores congresos.xml"
 */
@Getter
@Setter
@ToString
public class AutorCongreso extends DataSetDataBase {  
    
    /**
     * Mapping of field CONG_NUMERO.
     */
    private long congNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
}
