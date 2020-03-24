package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DiplomaEstudiosAvanzadosExterno extends DataSetDataBase {  
    private long tinaCodigo;
    private long idPersona;
    private String tinaTitulo;
    private String tinaFecha;
    private String tinaUnivNombre;
    private Long tinaUniCodigo;
}
