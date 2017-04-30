// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilAnaTskWeb.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Implementa el WebService para accesar los métodos provistos por "PilAnaTsk"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildWeb V 1.0.0)
 * @version          1.0.0
 */
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.naming.InitialContext;

/**
 * Esta clase implementa el WebService "PilAnaTsk".
 */
@WebService
public class PilAnaTskWeb
{
    @EJB
    private PilAnaTskRemote ejbRef;
    
    /**
     * Ejecuta el método ins.
     *
     * @param codStt                 
     * @param posX                   
     * @param posY                   
     * @param posZ                   
     * @param indP                   
     * @param indI                   
     * @param indA                   
     * @param userName               
     * @param domain                 
     * @param channel                
     * @param gls                    
     * @param lnk                    
     * @param transactTime           
     * @param entryTime              
     *
     * @return InsResult
     *
     */
     @WebMethod(operationName="ins")
     public  InsResult ins
         (@WebParam(name="codStt") long codStt, @WebParam(name="posX") String posX, @WebParam(name="posY") String posY, @WebParam(name="posZ") String posZ, @WebParam(name="indP") String indP, @WebParam(name="indI") String indI, @WebParam(name="indA") String indA, @WebParam(name="userName") String userName, @WebParam(name="domain") String domain, @WebParam(name="channel") String channel, @WebParam(name="gls") String gls, @WebParam(name="lnk") String lnk, @WebParam(name="transactTime") String transactTime, @WebParam(name="entryTime") String entryTime)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         InsResult insResult;
         ResultStatus resultStatus;
         try
         {
             insResult = getEJB().ins(codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
         }
         catch (Exception ex)
         {
             insResult = new InsResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             insResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = insResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return insResult;
     }
    /**
     * Ejecuta el método keyGet.
     *
     * @param codAnaTsk              
     *
     * @return KeyGetResult
     *
     */
     @WebMethod(operationName="keyGet")
     public  KeyGetResult keyGet
         (@WebParam(name="codAnaTsk") BigDecimal codAnaTsk)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         KeyGetResult keyGetResult;
         ResultStatus resultStatus;
         try
         {
             keyGetResult = getEJB().keyGet(codAnaTsk);
         }
         catch (Exception ex)
         {
             keyGetResult = new KeyGetResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             keyGetResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = keyGetResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return keyGetResult;
     }
    /**
     * Ejecuta el método keyGetLock.
     *
     * @param codAnaTsk              
     *
     * @return KeyGetLockResult
     *
     */
     @WebMethod(operationName="keyGetLock")
     public  KeyGetLockResult keyGetLock
         (@WebParam(name="codAnaTsk") BigDecimal codAnaTsk)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         KeyGetLockResult keyGetLockResult;
         ResultStatus resultStatus;
         try
         {
             keyGetLockResult = getEJB().keyGetLock(codAnaTsk);
         }
         catch (Exception ex)
         {
             keyGetLockResult = new KeyGetLockResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             keyGetLockResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = keyGetLockResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return keyGetLockResult;
     }
    /**
     * Ejecuta el método upd.
     *
     * @param codAnaTsk              
     * @param codStt                 
     * @param posX                   
     * @param posY                   
     * @param posZ                   
     * @param indP                   
     * @param indI                   
     * @param indA                   
     * @param userName               
     * @param domain                 
     * @param channel                
     * @param gls                    
     * @param lnk                    
     * @param transactTime           
     * @param entryTime              
     *
     * @return UpdResult
     *
     */
     @WebMethod(operationName="upd")
     public  UpdResult upd
         (@WebParam(name="codAnaTsk") BigDecimal codAnaTsk, @WebParam(name="codStt") long codStt, @WebParam(name="posX") String posX, @WebParam(name="posY") String posY, @WebParam(name="posZ") String posZ, @WebParam(name="indP") String indP, @WebParam(name="indI") String indI, @WebParam(name="indA") String indA, @WebParam(name="userName") String userName, @WebParam(name="domain") String domain, @WebParam(name="channel") String channel, @WebParam(name="gls") String gls, @WebParam(name="lnk") String lnk, @WebParam(name="transactTime") String transactTime, @WebParam(name="entryTime") String entryTime)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         UpdResult updResult;
         ResultStatus resultStatus;
         try
         {
             updResult = getEJB().upd(codAnaTsk, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
         }
         catch (Exception ex)
         {
             updResult = new UpdResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             updResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = updResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return updResult;
     }
    /**
     * Ejecuta el método del.
     *
     * @param codAnaTsk              
     *
     * @return DelResult
     *
     */
     @WebMethod(operationName="del")
     public  DelResult del
         (@WebParam(name="codAnaTsk") BigDecimal codAnaTsk)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         DelResult delResult;
         ResultStatus resultStatus;
         try
         {
             delResult = getEJB().del(codAnaTsk);
         }
         catch (Exception ex)
         {
             delResult = new DelResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             delResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = delResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return delResult;
     }
    /**
     * Ejecuta el método keyRange.
     *
     * @param codAnaTskIni           
     * @param codAnaTskFin           
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return KeyRangeResult
     *
     */
     @WebMethod(operationName="keyRange")
     public  KeyRangeResult keyRange
         (@WebParam(name="codAnaTskIni") BigDecimal codAnaTskIni, @WebParam(name="codAnaTskFin") BigDecimal codAnaTskFin, @WebParam(name="rowsPerPage") long rowsPerPage, @WebParam(name="isNextPage") long isNextPage)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         KeyRangeResult keyRangeResult;
         ResultStatus resultStatus;
         try
         {
             keyRangeResult = getEJB().keyRange(codAnaTskIni, codAnaTskFin, rowsPerPage, isNextPage);
         }
         catch (Exception ex)
         {
             keyRangeResult = new KeyRangeResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             keyRangeResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = keyRangeResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return keyRangeResult;
     }
    /**
     * Ejecuta el método sttRange.
     *
     * @param codSttIni              
     * @param codSttFin              
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return SttRangeResult
     *
     */
     @WebMethod(operationName="sttRange")
     public  SttRangeResult sttRange
         (@WebParam(name="codSttIni") long codSttIni, @WebParam(name="codSttFin") long codSttFin, @WebParam(name="rowsPerPage") long rowsPerPage, @WebParam(name="isNextPage") long isNextPage)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         SttRangeResult sttRangeResult;
         ResultStatus resultStatus;
         try
         {
             sttRangeResult = getEJB().sttRange(codSttIni, codSttFin, rowsPerPage, isNextPage);
         }
         catch (Exception ex)
         {
             sttRangeResult = new SttRangeResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             sttRangeResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = sttRangeResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return sttRangeResult;
     }
    /**
     * Ejecuta el método stttmpRange.
     *
     * @param entryTimeIni           
     * @param entryTimeFin           
     * @param codSttIni              
     * @param codSttFin              
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return StttmpRangeResult
     *
     */
     @WebMethod(operationName="stttmpRange")
     public  StttmpRangeResult stttmpRange
         (@WebParam(name="entryTimeIni") String entryTimeIni, @WebParam(name="entryTimeFin") String entryTimeFin, @WebParam(name="codSttIni") long codSttIni, @WebParam(name="codSttFin") long codSttFin, @WebParam(name="rowsPerPage") long rowsPerPage, @WebParam(name="isNextPage") long isNextPage)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         StttmpRangeResult stttmpRangeResult;
         ResultStatus resultStatus;
         try
         {
             stttmpRangeResult = getEJB().stttmpRange(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
         }
         catch (Exception ex)
         {
             stttmpRangeResult = new StttmpRangeResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             stttmpRangeResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = stttmpRangeResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return stttmpRangeResult;
     }
    /**
     * Ejecuta el método stttmpBetween.
     *
     * @param entryTimeIni           
     * @param entryTimeFin           
     * @param codSttIni              
     * @param codSttFin              
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return StttmpBetweenResult
     *
     */
     @WebMethod(operationName="stttmpBetween")
     public  StttmpBetweenResult stttmpBetween
         (@WebParam(name="entryTimeIni") String entryTimeIni, @WebParam(name="entryTimeFin") String entryTimeFin, @WebParam(name="codSttIni") long codSttIni, @WebParam(name="codSttFin") long codSttFin, @WebParam(name="rowsPerPage") long rowsPerPage, @WebParam(name="isNextPage") long isNextPage)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         StttmpBetweenResult stttmpBetweenResult;
         ResultStatus resultStatus;
         try
         {
             stttmpBetweenResult = getEJB().stttmpBetween(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
         }
         catch (Exception ex)
         {
             stttmpBetweenResult = new StttmpBetweenResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             stttmpBetweenResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = stttmpBetweenResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return stttmpBetweenResult;
     }
    /**
     * Ejecuta el método keyDelRange.
     *
     * @param codAnaTskIni           
     * @param codAnaTskFin           
     *
     * @return KeyDelRangeResult
     *
     */
     @WebMethod(operationName="keyDelRange")
     public  KeyDelRangeResult keyDelRange
         (@WebParam(name="codAnaTskIni") BigDecimal codAnaTskIni, @WebParam(name="codAnaTskFin") BigDecimal codAnaTskFin)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         KeyDelRangeResult keyDelRangeResult;
         ResultStatus resultStatus;
         try
         {
             keyDelRangeResult = getEJB().keyDelRange(codAnaTskIni, codAnaTskFin);
         }
         catch (Exception ex)
         {
             keyDelRangeResult = new KeyDelRangeResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             keyDelRangeResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = keyDelRangeResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return keyDelRangeResult;
     }
    /**
     * Ejecuta el método sttDelRange.
     *
     * @param codSttIni              
     * @param codSttFin              
     *
     * @return SttDelRangeResult
     *
     */
     @WebMethod(operationName="sttDelRange")
     public  SttDelRangeResult sttDelRange
         (@WebParam(name="codSttIni") long codSttIni, @WebParam(name="codSttFin") long codSttFin)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         SttDelRangeResult sttDelRangeResult;
         ResultStatus resultStatus;
         try
         {
             sttDelRangeResult = getEJB().sttDelRange(codSttIni, codSttFin);
         }
         catch (Exception ex)
         {
             sttDelRangeResult = new SttDelRangeResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             sttDelRangeResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = sttDelRangeResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return sttDelRangeResult;
     }
    /**
     * Ejecuta el método stttmpDelRange.
     *
     * @param entryTimeIni           
     * @param entryTimeFin           
     * @param codSttIni              
     * @param codSttFin              
     *
     * @return StttmpDelRangeResult
     *
     */
     @WebMethod(operationName="stttmpDelRange")
     public  StttmpDelRangeResult stttmpDelRange
         (@WebParam(name="entryTimeIni") String entryTimeIni, @WebParam(name="entryTimeFin") String entryTimeFin, @WebParam(name="codSttIni") long codSttIni, @WebParam(name="codSttFin") long codSttFin)
         throws PilAnaTskWebException
     {
         Date ejbDateTime = new Date();
         long timerStart = System.nanoTime();
         long timerEnd;
         long ejbElapsedTime;
         StttmpDelRangeResult stttmpDelRangeResult;
         ResultStatus resultStatus;
         try
         {
             stttmpDelRangeResult = getEJB().stttmpDelRange(entryTimeIni, entryTimeFin, codSttIni, codSttFin);
         }
         catch (Exception ex)
         {
             stttmpDelRangeResult = new StttmpDelRangeResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             stttmpDelRangeResult.setResultStatus(resultStatus);
         }
         timerEnd = System.nanoTime();
         ejbElapsedTime = (timerEnd - timerStart);
         resultStatus = stttmpDelRangeResult.getResultStatus();
         resultStatus.setEjbElapsedTime((ejbElapsedTime + 500000L) / 1000000L);
         resultStatus.setEjbDateTime(ejbDateTime);
         return stttmpDelRangeResult;
     }
    
    /**
     * Obtiene el Stateless Enterprise Session Bean
     */
    private PilAnaTskRemote getEJB() throws java.lang.Exception
    {
        if (ejbRef == null)
        {
             InitialContext context = new InitialContext();
             ejbRef = (PilAnaTskRemote)context.lookup("ejb/cl/metagen/pilanatsk/PilAnaTsk");//java:comp/env/ejbRef
        }
        return ejbRef;
    }
}
//{.Checksum("6c87c6676c503280970c29a3a89aa25e").}
