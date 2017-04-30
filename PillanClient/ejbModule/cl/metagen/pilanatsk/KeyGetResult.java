// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetResult.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Estructura de Datos: "PilAnaTsk.KeyGetResult"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildDataStructureElement V 2.0.1)
 * @version          2.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * Estructura de datos utilizada por el método "KeyGet".
 */
public class KeyGetResult implements java.io.Serializable //[001]
{
    private static final long serialVersionUID = 1L; //[002]
    private ResultStatus myResultStatus = new ResultStatus(); //[003]
    private long myCodStt = 0; //[005]
    private String myPosX = null; //[005]
    private String myPosY = null; //[005]
    private String myPosZ = null; //[005]
    private String myIndP = null; //[005]
    private String myIndI = null; //[005]
    private String myIndA = null; //[005]
    private String myUserName = null; //[005]
    private String myDomain = null; //[005]
    private String myChannel = null; //[005]
    private String myGls = null; //[005]
    private String myLnk = null; //[005]
    private String myTransactTime = null; //[005]
    private String myEntryTime = null; //[005]
    private long myResultCode = 0; //[005]
    private String myResultMsg = null; //[005]
    
    /**
     * Crea la representacion toMetaData() de  KeyGetResult
     */
    public String toMetaData()
    {
        StringBuffer sb = null;
        try
        {
           sb = new StringBuffer();
           sb.append("NAME[KeyGetResult], DATA[");
    
    /**
     * Retorna el valor de codStt
     */
           try
             {
               sb.append("[CodStt,[" + this.myCodStt + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[CodStt,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de posX
     */
           try
             {
               sb.append("[PosX,[" + this.myPosX + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[PosX,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de posY
     */
           try
             {
               sb.append("[PosY,[" + this.myPosY + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[PosY,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de posZ
     */
           try
             {
               sb.append("[PosZ,[" + this.myPosZ + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[PosZ,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de indP
     */
           try
             {
               sb.append("[IndP,[" + this.myIndP + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[IndP,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de indI
     */
           try
             {
               sb.append("[IndI,[" + this.myIndI + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[IndI,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de indA
     */
           try
             {
               sb.append("[IndA,[" + this.myIndA + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[IndA,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de userName
     */
           try
             {
               sb.append("[UserName,[" + this.myUserName + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[UserName,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de domain
     */
           try
             {
               sb.append("[Domain,[" + this.myDomain + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[Domain,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de channel
     */
           try
             {
               sb.append("[Channel,[" + this.myChannel + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[Channel,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de gls
     */
           try
             {
               sb.append("[Gls,[" + this.myGls + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[Gls,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de lnk
     */
           try
             {
               sb.append("[Lnk,[" + this.myLnk + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[Lnk,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de transactTime
     */
           try
             {
               sb.append("[TransactTime,[" + this.myTransactTime + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[TransactTime,ERROR:[" + e.getMessage() + "]]"); //[014b]
             }
           
    
    /**
     * Retorna el valor de entryTime
     */
           try
             {
               sb.append("[EntryTime,[" + this.myEntryTime + "]]"); //[014a]
             }
             catch(Exception e)
             {
               sb.append("[EntryTime,ERROR:[" + e.getMessage() + "]]"); //[014b]
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
     * Crea un KeyGetResult
     */
    public KeyGetResult() {} //[008]
    
    /**
     * Retorna el valor de resultStatus
     */
    public ResultStatus getResultStatus() //[009]
    {
        return this.myResultStatus; //[010]
    }
    
    /**
     * Retorna el valor de codStt
     */
    public long getCodStt() //[013]
    {
        return this.myCodStt; //[014]
    }
    
    /**
     * Retorna el valor de posX
     */
    public String getPosX() //[013]
    {
        return this.myPosX; //[014]
    }
    
    /**
     * Retorna el valor de posY
     */
    public String getPosY() //[013]
    {
        return this.myPosY; //[014]
    }
    
    /**
     * Retorna el valor de posZ
     */
    public String getPosZ() //[013]
    {
        return this.myPosZ; //[014]
    }
    
    /**
     * Retorna el valor de indP
     */
    public String getIndP() //[013]
    {
        return this.myIndP; //[014]
    }
    
    /**
     * Retorna el valor de indI
     */
    public String getIndI() //[013]
    {
        return this.myIndI; //[014]
    }
    
    /**
     * Retorna el valor de indA
     */
    public String getIndA() //[013]
    {
        return this.myIndA; //[014]
    }
    
    /**
     * Retorna el valor de userName
     */
    public String getUserName() //[013]
    {
        return this.myUserName; //[014]
    }
    
    /**
     * Retorna el valor de domain
     */
    public String getDomain() //[013]
    {
        return this.myDomain; //[014]
    }
    
    /**
     * Retorna el valor de channel
     */
    public String getChannel() //[013]
    {
        return this.myChannel; //[014]
    }
    
    /**
     * Retorna el valor de gls
     */
    public String getGls() //[013]
    {
        return this.myGls; //[014]
    }
    
    /**
     * Retorna el valor de lnk
     */
    public String getLnk() //[013]
    {
        return this.myLnk; //[014]
    }
    
    /**
     * Retorna el valor de transactTime
     */
    public String getTransactTime() //[013]
    {
        return this.myTransactTime; //[014]
    }
    
    /**
     * Retorna el valor de entryTime
     */
    public String getEntryTime() //[013]
    {
        return this.myEntryTime; //[014]
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
     * Asigna codStt
     */
    public void setCodStt(long codStt) //[023]
    {
        this.myCodStt = codStt; //[024]
    }
    
    /**
     * Asigna posX
     */
    public void setPosX(String posX) //[023]
    {
        this.myPosX = posX; //[024]
    }
    
    /**
     * Asigna posY
     */
    public void setPosY(String posY) //[023]
    {
        this.myPosY = posY; //[024]
    }
    
    /**
     * Asigna posZ
     */
    public void setPosZ(String posZ) //[023]
    {
        this.myPosZ = posZ; //[024]
    }
    
    /**
     * Asigna indP
     */
    public void setIndP(String indP) //[023]
    {
        this.myIndP = indP; //[024]
    }
    
    /**
     * Asigna indI
     */
    public void setIndI(String indI) //[023]
    {
        this.myIndI = indI; //[024]
    }
    
    /**
     * Asigna indA
     */
    public void setIndA(String indA) //[023]
    {
        this.myIndA = indA; //[024]
    }
    
    /**
     * Asigna userName
     */
    public void setUserName(String userName) //[023]
    {
        this.myUserName = userName; //[024]
    }
    
    /**
     * Asigna domain
     */
    public void setDomain(String domain) //[023]
    {
        this.myDomain = domain; //[024]
    }
    
    /**
     * Asigna channel
     */
    public void setChannel(String channel) //[023]
    {
        this.myChannel = channel; //[024]
    }
    
    /**
     * Asigna gls
     */
    public void setGls(String gls) //[023]
    {
        this.myGls = gls; //[024]
    }
    
    /**
     * Asigna lnk
     */
    public void setLnk(String lnk) //[023]
    {
        this.myLnk = lnk; //[024]
    }
    
    /**
     * Asigna transactTime
     */
    public void setTransactTime(String transactTime) //[023]
    {
        this.myTransactTime = transactTime; //[024]
    }
    
    /**
     * Asigna entryTime
     */
    public void setEntryTime(String entryTime) //[023]
    {
        this.myEntryTime = entryTime; //[024]
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
//{.Checksum("babe298a9796c91ca3dd97ed5a0863f6").}
