package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegistroRecursosHumanosConcedido extends DataSetDataBase {  
    private String idDocumento;
    private Long idConvocatoriaRecursoHumano;
    private String descripcionConvocatoria;
    private String referenciaConvocatoria;
    private Long idSubprograma;
    private String descripcionSubprograma;
    private Long idUnidadRecursoHumano;
    private String descripcionUnidadRecursoHumano;
    private Long idTerceroConvocante;
    private String fechaConvocatoria;
    private String fechaResolucion;
    private String fechaPublicacion;
}
