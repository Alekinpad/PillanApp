// Ecu5GL > no modifique este comentario <

/**
 * @(#)ResultStatus.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Estructura de Datos: "PilAnaTsk.ResultStatus"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildDataStructureElement V 2.0.1)
 * @version          2.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * Estructura de datos utilizada por el método "Ins".
 */
public class ResultStatus implements java.io.Serializable //[001]
{
    private static final long serialVersionUID = 1L; //[002]
    private long myResultCode = 0; //[005]
    private String myResultMsg = null; //[005]
    private Date myEjbDateTime = null; //[005]
    private long myEjbElapsedTime = 0; //[005]
    
    /**
     * Crea la representacion toMetaData() de  ResultStatus
     */
    public String toMetaData()
    {
        StringBuffer sb = null;
        try
        {
           sb = new StringBuffer();
           sb.append("NAME[ResultStatus], DATA[");
    
    /**
     * Retorna el valor de resultCode
     */
           try
             {
               sb.append("[ResultCode,[" + this.myResultCode + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[ResultCode,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de resultMsg
     */
           try
             {
               sb.append("[ResultMsg,[" + this.myResultMsg + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[ResultMsg,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de ejbDateTime
     */
           try
             {
               sb.append("[EjbDateTime,[" + this.myEjbDateTime + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[EjbDateTime,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de ejbElapsedTime
     */
           try
             {
               sb.append("[EjbElapsedTime,[" + this.myEjbElapsedTime + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[EjbElapsedTime,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
           return sb.toString(); //[014c]
        }
        catch(Exception ex)
        {
            return "ERROR[5001][" + sb.toString() + "],@["+ this.toString() + ",EXCEPTION[" + ex.getMessage() + "]";

        }
    }
    
    /**
     * Crea un ResultStatus
     */
    public ResultStatus() {} //[008]
    
    /**
     * Retorna el valor de resultCode
     */
    public long getResultCode() //[013]
    {
        return this.myResultCode; //[014]
    }
    
    /**
     * Retorna el valor de resultMsg
     */
    public String getResultMsg() //[013]
    {
        return this.myResultMsg; //[014]
    }
    
    /**
     * Retorna el valor de ejbDateTime
     */
    public Date getEjbDateTime() //[013]
    {
        return this.myEjbDateTime; //[014]
    }
    
    /**
     * Retorna el valor de ejbElapsedTime
     */
    public long getEjbElapsedTime() //[013]
    {
        return this.myEjbElapsedTime; //[014]
    }
    
    /**
     * Asigna resultCode
     */
    public void setResultCode(long resultCode) //[023]
    {
        this.myResultCode = resultCode; //[024]
    }
    
    /**
     * Asigna resultMsg
     */
    public void setResultMsg(String resultMsg) //[023]
    {
        this.myResultMsg = resultMsg; //[024]
    }
    
    /**
     * Asigna ejbDateTime
     */
    public void setEjbDateTime(Date ejbDateTime) //[023]
    {
        this.myEjbDateTime = ejbDateTime; //[024]
    }
    
    /**
     * Asigna ejbElapsedTime
     */
    public void setEjbElapsedTime(long ejbElapsedTime) //[023]
    {
        this.myEjbElapsedTime = ejbElapsedTime; //[024]
    }
}
//{.Checksum("f8c0b0241ffd147e0b2435d68d02c726").}
