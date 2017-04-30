// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilAnaTskWebException.java  Sabado 29 de Abril de 2017 - 14:28:25
 *
 *
 * Copyright (c) CHABRETUAL LTDA (Chile) Derechos reservados.
 *
 * Este es un archivo generado.
 * NO MODIFIQUE ESTE ARCHIVO
 *
 */
package cl.metagen.pilanatsk;

/**
 * Excepción lanzada al fallar alguna pieza de "PilAnaTsk"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildWebException V 1.0.1)
 * @version          1.0.1
 */
import javax.xml.ws.WebFault;

/**
 * Excepciones lanzadas cuando fallan los métodos de acceso a los Servicios.
 */
@WebFault(name="faultInfo")
public class PilAnaTskWebException extends Exception
{
    private static final long serialVersionUID = 1L;
    private final String faultInfo;
    
    /**
     * Construye un excepción nueva cuando se detecta una falla en una invocación de servicio.
     */
    public PilAnaTskWebException(String message, String faultInfo)
    {
        super(message);
        this.faultInfo = faultInfo;
    }
    
    /**
     * Construye un excepción nueva cuando se detecta una falla en una invocación de servicio.
     */
    public PilAnaTskWebException(String message, String faultInfo, Throwable cause)
    {
        super(message, cause);
        this.faultInfo = faultInfo;
    }
    
    /**
     * Obtiene la propiedad faultInfo.
     */
    public String getFaultInfo()
    {
        return this.faultInfo;
    }
}
//{.Checksum("1c2594796970fd86da1299e1f457d4c3").}
