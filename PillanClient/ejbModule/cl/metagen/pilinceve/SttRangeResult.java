// Ecu5GL > no modifique este comentario <

/**
 * @(#)SttRangeResult.java  Sabado 29 de Abril de 2017 - 14:28:36
 *
 *
 * Copyright (c) CHABRETUAL LTDA (Chile) Derechos reservados.
 *
 * Este es un archivo generado.
 * NO MODIFIQUE ESTE ARCHIVO
 *
 */
package cl.metagen.pilinceve;

/**
 * Estructura de Datos: "PilIncEve.SttRangeResult"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildDataStructureElement V 2.0.1)
 * @version          2.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * Estructura de datos utilizada por el m�todo "SttRange".
 */
public class SttRangeResult implements java.io.Serializable //[001]
{
    private static final long serialVersionUID = 1L; //[002]
    private ResultStatus myResultStatus = new ResultStatus(); //[003]
    private SttRangeOutDetalle1Result[] myOutDetalle1List; //[006]
    private long myResultCode = 0; //[005]
    private String myResultMsg = null; //[005]
    
    /**
     * Crea la representacion toMetaData() de  SttRangeResult
     */
    public String toMetaData()
    {
        StringBuffer sb = null;
        try
        {
           sb = new StringBuffer();
           sb.append("NAME[SttRangeResult], DATA[");
    
    /**
     * Retorna outDetalle1
     */
    try
    {
        for(SttRangeOutDetalle1Result outDetalle1 : this.myOutDetalle1List) //[016a]
        {
           sb.append("[SttRangeOutDetalle1Result], [" + outDetalle1.toMetaData() + "]"); //[016b]
        }
    }
    catch(Exception e)
    {
        sb.append("[SttRangeOutDetalle1Result,@" + this.myOutDetalle1List + ",ERROR:[" + e.getMessage() + "]]"); //[016c]
    }
           
    
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
           
           return sb.toString(); //[014c]
        }
        catch(Exception ex)
        {
            return "ERROR[5001][" + sb.toString() + "],@["+ this.toString() + ",EXCEPTION[" + ex.getMessage() + "]";

        }
    }
    
    /**
     * Crea un SttRangeResult
     */
    public SttRangeResult() {} //[008]
    
    /**
     * Retorna el valor de resultStatus
     */
    public ResultStatus getResultStatus() //[009]
    {
        return this.myResultStatus; //[010]
    }
    
    /**
     * Retorna outDetalle1
     */
    public SttRangeOutDetalle1Result[] getOutDetalle1List() //[015]
    {
        return this.myOutDetalle1List; //[016]
    }
    
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
     * Asigna  resultStatus
     */
    public void setResultStatus(ResultStatus resultStatus) //[019]
    {
        this.myResultStatus = resultStatus; //[020]
    }
    
    /**
     * Asigna outDetalle1
     */
    public void setOutDetalle1List(SttRangeOutDetalle1Result[] outDetalle1List) //[025]
    {
        this.myOutDetalle1List = outDetalle1List; //[026]
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
}
//{.Checksum("d27df7ce9e18989b585979f5bb2db47a").}
