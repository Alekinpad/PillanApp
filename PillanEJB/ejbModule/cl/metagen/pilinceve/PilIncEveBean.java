// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilIncEveBean.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Clase de implementación para la session bean "PilIncEve"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildBean V 2.0.1)
 * @version          2.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Resource;
import javax.ejb.CreateException;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.naming.InitialContext;

/**
 * Implementa Stateless Enterprise Session Bean: PilIncEve
 */
@Stateless(name="PilIncEve", mappedName="ejb/cl/metagen/pilinceve/PilIncEve")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PilIncEveBean implements PilIncEveRemote, PilIncEveLocal
{
    
    /**
     * Ejecuta el método Ins.
     * 
     * @param InsContext             Contexto del cliente
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
    @Override
     public InsResult ins(long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         InsResult methodResult;
         try
         {
             InsCaller caller = new InsCaller();
             methodResult = caller.execute(codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyGet.
     * 
     * @param KeyGetContext          Contexto del cliente
     * @param codIncEve              
     *
     * @return KeyGetResult
     *
     */
    @Override
     public KeyGetResult keyGet(BigDecimal codIncEve)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         KeyGetResult methodResult;
         try
         {
             KeyGetCaller caller = new KeyGetCaller();
             methodResult = caller.execute(codIncEve);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyGetLock.
     * 
     * @param KeyGetLockContext      Contexto del cliente
     * @param codIncEve              
     *
     * @return KeyGetLockResult
     *
     */
    @Override
     public KeyGetLockResult keyGetLock(BigDecimal codIncEve)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         KeyGetLockResult methodResult;
         try
         {
             KeyGetLockCaller caller = new KeyGetLockCaller();
             methodResult = caller.execute(codIncEve);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método Upd.
     * 
     * @param UpdContext             Contexto del cliente
     * @param codIncEve              
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
    @Override
     public UpdResult upd(BigDecimal codIncEve, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         UpdResult methodResult;
         try
         {
             UpdCaller caller = new UpdCaller();
             methodResult = caller.execute(codIncEve, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método Del.
     * 
     * @param DelContext             Contexto del cliente
     * @param codIncEve              
     *
     * @return DelResult
     *
     */
    @Override
     public DelResult del(BigDecimal codIncEve)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         DelResult methodResult;
         try
         {
             DelCaller caller = new DelCaller();
             methodResult = caller.execute(codIncEve);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyRange.
     * 
     * @param KeyRangeContext        Contexto del cliente
     * @param codIncEveIni           
     * @param codIncEveFin           
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return KeyRangeResult
     *
     */
    @Override
     public KeyRangeResult keyRange(BigDecimal codIncEveIni, BigDecimal codIncEveFin, long rowsPerPage, long isNextPage)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         KeyRangeResult methodResult;
         try
         {
             KeyRangeCaller caller = new KeyRangeCaller();
             methodResult = caller.execute(codIncEveIni, codIncEveFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método SttRange.
     * 
     * @param SttRangeContext        Contexto del cliente
     * @param codSttIni              
     * @param codSttFin              
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return SttRangeResult
     *
     */
    @Override
     public SttRangeResult sttRange(long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         SttRangeResult methodResult;
         try
         {
             SttRangeCaller caller = new SttRangeCaller();
             methodResult = caller.execute(codSttIni, codSttFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método StttmpRange.
     * 
     * @param StttmpRangeContext     Contexto del cliente
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
    @Override
     public StttmpRangeResult stttmpRange(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         StttmpRangeResult methodResult;
         try
         {
             StttmpRangeCaller caller = new StttmpRangeCaller();
             methodResult = caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método StttmpBetween.
     * 
     * @param StttmpBetweenContext   Contexto del cliente
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
    @Override
     public StttmpBetweenResult stttmpBetween(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         StttmpBetweenResult methodResult;
         try
         {
             StttmpBetweenCaller caller = new StttmpBetweenCaller();
             methodResult = caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyDelRange.
     * 
     * @param KeyDelRangeContext     Contexto del cliente
     * @param codIncEveIni           
     * @param codIncEveFin           
     *
     * @return KeyDelRangeResult
     *
     */
    @Override
     public KeyDelRangeResult keyDelRange(BigDecimal codIncEveIni, BigDecimal codIncEveFin)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         KeyDelRangeResult methodResult;
         try
         {
             KeyDelRangeCaller caller = new KeyDelRangeCaller();
             methodResult = caller.execute(codIncEveIni, codIncEveFin);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método SttDelRange.
     * 
     * @param SttDelRangeContext     Contexto del cliente
     * @param codSttIni              
     * @param codSttFin              
     *
     * @return SttDelRangeResult
     *
     */
    @Override
     public SttDelRangeResult sttDelRange(long codSttIni, long codSttFin)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         SttDelRangeResult methodResult;
         try
         {
             SttDelRangeCaller caller = new SttDelRangeCaller();
             methodResult = caller.execute(codSttIni, codSttFin);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método StttmpDelRange.
     * 
     * @param StttmpDelRangeContext   Contexto del cliente
     * @param entryTimeIni           
     * @param entryTimeFin           
     * @param codSttIni              
     * @param codSttFin              
     *
     * @return StttmpDelRangeResult
     *
     */
    @Override
     public StttmpDelRangeResult stttmpDelRange(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin)
         throws PilIncEveException,
                PilIncEveRollbackException
    {
         StttmpDelRangeResult methodResult;
         try
         {
             StttmpDelRangeCaller caller = new StttmpDelRangeCaller();
             methodResult = caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilIncEveRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilIncEveException ex)
         {
             throw ex;
         }
     }
    
}
//{.Checksum("d1d57cbbc27c40a88e06b0b753ab1c28").}
