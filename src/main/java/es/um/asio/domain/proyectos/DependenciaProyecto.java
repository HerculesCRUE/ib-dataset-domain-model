package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DependenciaProyecto extends DataSetDataBase {  
    private String idDependencia;
    private String descripcion;
}
