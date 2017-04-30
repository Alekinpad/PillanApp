// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyRangeResult.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Estructura de Datos: "PilOutMsg.KeyRangeResult"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildDataStructureElement V 2.0.1)
 * @version          2.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * Estructura de datos utilizada por el método "KeyRange".
 */
public class KeyRangeResult implements java.io.Serializable //[001]
{
    private static final long serialVersionUID = 1L; //[002]
    private ResultStatus myResultStatus = new ResultStatus(); //[003]
    private KeyRangeOutDetalle1Result[] myOutDetalle1List; //[006]
    private BigDecimal myCodOutMsgIni = null; //[005]
    private long myResultCode = 0; //[005]
    private String myResultMsg = null; //[005]
    
    /**
     * Crea la representacion toMetaData() de  KeyRangeResult
     */
    public String toMetaData()
    {
        StringBuffer sb = null;
        try
        {
           sb = new StringBuffer();
           sb.append("NAME[KeyRangeResult], DATA[");
    
    /**
     * Retorna outDetalle1
     */
    try
    {
        for(KeyRangeOutDetalle1Result outDetalle1 : this.myOutDetalle1List) //[016a]
        {
           sb.append("[KeyRangeOutDetalle1Result], [" + outDetalle1.toMetaData() + "]"); //[016b]
        }
    }
    catch(Exception e)
    {
        sb.append("[KeyRangeOutDetalle1Result,@" + this.myOutDetalle1List + ",ERROR:[" + e.getMessage() + "]]"); //[016c]
    }
           
    
    /**
     * Retorna el valor de codOutMsgIni
     */
           try
             {
               sb.append("[CodOutMsgIni,[" + this.myCodOutMsgIni + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[CodOutMsgIni,ERROR:[" + e.getMessage() + "]]"); //[014b]
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
     * Crea un KeyRangeResult
     */
    public KeyRangeResult() {} //[008]
    
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
    public KeyRangeOutDetalle1Result[] getOutDetalle1List() //[015]
    {
        return this.myOutDetalle1List; //[016]
    }
    
    /**
     * Retorna el valor de codOutMsgIni
     */
    public BigDecimal getCodOutMsgIni() //[013]
    {
        return this.myCodOutMsgIni; //[014]
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
    public void setOutDetalle1List(KeyRangeOutDetalle1Result[] outDetalle1List) //[025]
    {
        this.myOutDetalle1List = outDetalle1List; //[026]
    }
    
    /**
     * Asigna codOutMsgIni
     */
    public void setCodOutMsgIni(BigDecimal codOutMsgIni) //[023]
    {
        this.myCodOutMsgIni = codOutMsgIni; //[024]
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
//{.Checksum("6a3d8326403f7cb099853d5f8795c39b").}
