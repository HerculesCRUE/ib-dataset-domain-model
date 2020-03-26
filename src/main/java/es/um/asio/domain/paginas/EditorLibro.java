package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Editores libros.xml"
 */
@Getter
@Setter
@ToString
public class EditorLibro extends DataSetDataBase {  
    
    /**
     * Mapping of field ALIB_LIBR_ISBN.
     */
    private String alibLibrIsbn;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ALIB_ORDEN.
     */
    private long alibOrden;
}