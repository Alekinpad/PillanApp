// Ecu5GL > no modifique este comentario <

/**
 * @(#)InsResult.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Estructura de Datos: "PilOutMsg.InsResult"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildDataStructureElement V 2.0.1)
 * @version          2.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * Estructura de datos utilizada por el m�todo "Ins".
 */
public class InsResult implements java.io.Serializable //[001]
{
    private static final long serialVersionUID = 1L; //[002]
    private ResultStatus myResultStatus = new ResultStatus(); //[003]
    private BigDecimal myCodOutMsg = null; //[005]
    private long myResultCode = 0; //[005]
    private String myResultMsg = null; //[005]
    
    /**
     * Crea la representacion toMetaData() de  InsResult
     */
    public String toMetaData()
    {
        StringBuffer sb = null;
        try
        {
           sb = new StringBuffer();
           sb.append("NAME[InsResult], DATA[");
    
    /**
     * Retorna el valor de codOutMsg
     */
           try
             {
               sb.append("[CodOutMsg,[" + this.myCodOutMsg + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[CodOutMsg,ERROR:[" + e.getMessage() + "]]"); //[014b]
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
     * Crea un InsResult
     */
    public InsResult() {} //[008]
    
    /**
     * Retorna el valor de resultStatus
     */
    public ResultStatus getResultStatus() //[009]
    {
        return this.myResultStatus; //[010]
    }
    
    /**
     * Retorna el valor de codOutMsg
     */
    public BigDecimal getCodOutMsg() //[013]
    {
        return this.myCodOutMsg; //[014]
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
     * Asigna codOutMsg
     */
    public void setCodOutMsg(BigDecimal codOutMsg) //[023]
    {
        this.myCodOutMsg = codOutMsg; //[024]
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
//{.Checksum("668ddd3e758b83aab393fcdf86c5effc").}