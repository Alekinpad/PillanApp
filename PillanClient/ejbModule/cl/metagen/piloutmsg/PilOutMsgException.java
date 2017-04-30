// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilOutMsgException.java  Sabado 29 de Abril de 2017 - 14:28:45
 *
 *
 * Copyright (c) CHABRETUAL LTDA (Chile) Derechos reservados.
 *
 * Este es un archivo generado.
 * NO MODIFIQUE ESTE ARCHIVO
 *
 */
package cl.metagen.piloutmsg;

/**
 * Excepci�n lanzada al fallar alguna pieza de "PilOutMsg"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildException V 1.0.1)
 * @version          1.0.1
 */
import java.util.LinkedHashMap;
import java.util.Map;
import javax.ejb.ApplicationException;

/**
 * Excepciones lanzadas cuando fallan los m�todos de acceso a los Servicios.
 */
@ApplicationException(rollback=false)
public class PilOutMsgException extends Exception
{
    private static final long serialVersionUID = 1L;
    private LinkedHashMap<String, Object> parameters = null;
    private String procedureName = null;
    
    /**
     * Construye un excepci�n nueva cuando se detecta una falla en una invocaci�n de servicio.
     */
    public PilOutMsgException()
    {
        super();
    }
    
    /**
     * Construye un excepci�n nueva cuando se detecta una falla en una invocaci�n de servicio.
     */
    public PilOutMsgException(String message)
    {
        super(message);
    }
    
    /**
     * Construye un excepci�n nueva cuando se detecta una falla en una invocaci�n de servicio.
     */
    public PilOutMsgException(Throwable cause)
    {
        super(cause);
    }
    
    /**
     * Construye un excepci�n nueva cuando se detecta una falla en una invocaci�n de servicio.
     */
    public PilOutMsgException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    /**
     * Construye un excepci�n nueva cuando se detecta una falla en una invocaci�n de servicio.
     */
    public PilOutMsgException(String message, Map<String, Object> map)
    {
        super(message);
    }
    
    /**
     * Construye un excepci�n nueva cuando se detecta una falla en una invocaci�n de servicio.
     */
    public PilOutMsgException(String procedureName, Exception ex)
    {
        this.procedureName = procedureName + ": " + ex.getMessage();
    }
    
    /**
     * Retorna el nombre del procedimiento fallido.
     */
    public String getProcedureName()
    {
        return procedureName;
    }
    
    /**
     * Retorna los par�metros de entrada del procedimiento fallido.
     */
    public Map<String, Object> getParameters()
    {
        return parameters;
    }
    
    /**
     * Agrega un par�metro a la lista de par�metros de entrada. M�ximo largo: 20
     */
    public void addParameter(String parameterName, Object parameterValue)
    {
        if (parameters == null) parameters = new LinkedHashMap<String, Object>();
        if(parameterValue == null)
        {
             parameters.put(parameterName, "<null>" );
             return;
        }
        String parameterType = parameterValue.getClass().getName();
        String value;
        if(parameterType.contains("String"))
        {
             value = parameterValue.toString();
             parameters.put(parameterName, "\"" + (value.length() > 20? value.substring(0, 16) + "..." : value) + "\"");
             return;
        }
        if(parameterType.contains("Date"))
        {
             java.text.SimpleDateFormat  simpleDateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
             java.util.Date  date = (java.util.Date)parameterValue;
             value = simpleDateFormat.format(date);
             parameters.put(parameterName, value);
             return;
        }
        parameters.put(parameterName, parameterValue);
    }
    
    /**
     * Agrega un par�metro LONG a la lista de par�metros de entrada.
     */
    public void addLongParameter(String parameterName, long parameterValue)
    {
        if (parameters == null) parameters = new LinkedHashMap<String, Object>();
        parameters.put(parameterName, new Long(parameterValue).toString());
    }
}
//{.Checksum("a284a0cc8f98b03df05f08ccfb0856b1").}
