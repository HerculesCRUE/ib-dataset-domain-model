package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Solicitudes cambios grupos investigacion.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class SolicitudCambioGrupoInvestigacion extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field SOLIN_NUMERO.
     */
    private long solinNumero;
    
    /**
     * Mapping of field SOLIN_DEPT_CODIGO.
     */
    private String solinDeptCodigo;
    
    /**
     * Mapping of field SOLIN_GRIN_CODIGO.
     */
    private long solinGrinCodigo;
    
    /**
     * Mapping of field INVESTIGADOR_PRINCIPAL.
     */
    private Long investigadorPrincipal;
    
    /**
     * Mapping of field INVESTIGADOR_SOLICITUD.
     */
    private Long investigadorSolicitud;
    
    /**
     * Mapping of field SOLIN_FECHASOLICITA.
     */
    private String solinFechaSolicita;
    
    /**
     * Mapping of field SOLIN_FCAD.
     */
    private String solinFCad;
    
    /**
     * Mapping of field STATUS.
     */
    private String status;
    
    /**
     * Mapping of field SOLIN_EDP.
     */
    private Float solinEdp;
    
    /**
     * Mapping of field SOLIN_ESTADO.
     */
    private String solinEstado;
}