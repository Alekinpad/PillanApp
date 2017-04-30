// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilAnaTskBean.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Clase de implementación para la session bean "PilAnaTsk"
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
 * Implementa Stateless Enterprise Session Bean: PilAnaTsk
 */
@Stateless(name="PilAnaTsk", mappedName="ejb/cl/metagen/pilanatsk/PilAnaTsk")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PilAnaTskBean implements PilAnaTskRemote, PilAnaTskLocal
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
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         InsResult methodResult;
         try
         {
             InsCaller caller = new InsCaller();
             methodResult = caller.execute(codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyGet.
     * 
     * @param KeyGetContext          Contexto del cliente
     * @param codAnaTsk              
     *
     * @return KeyGetResult
     *
     */
    @Override
     public KeyGetResult keyGet(BigDecimal codAnaTsk)
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         KeyGetResult methodResult;
         try
         {
             KeyGetCaller caller = new KeyGetCaller();
             methodResult = caller.execute(codAnaTsk);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyGetLock.
     * 
     * @param KeyGetLockContext      Contexto del cliente
     * @param codAnaTsk              
     *
     * @return KeyGetLockResult
     *
     */
    @Override
     public KeyGetLockResult keyGetLock(BigDecimal codAnaTsk)
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         KeyGetLockResult methodResult;
         try
         {
             KeyGetLockCaller caller = new KeyGetLockCaller();
             methodResult = caller.execute(codAnaTsk);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método Upd.
     * 
     * @param UpdContext             Contexto del cliente
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
    @Override
     public UpdResult upd(BigDecimal codAnaTsk, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         UpdResult methodResult;
         try
         {
             UpdCaller caller = new UpdCaller();
             methodResult = caller.execute(codAnaTsk, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método Del.
     * 
     * @param DelContext             Contexto del cliente
     * @param codAnaTsk              
     *
     * @return DelResult
     *
     */
    @Override
     public DelResult del(BigDecimal codAnaTsk)
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         DelResult methodResult;
         try
         {
             DelCaller caller = new DelCaller();
             methodResult = caller.execute(codAnaTsk);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyRange.
     * 
     * @param KeyRangeContext        Contexto del cliente
     * @param codAnaTskIni           
     * @param codAnaTskFin           
     * @param rowsPerPage            Filas por Página
     * @param isNextPage             Paginación: 2da página en adelante.
     *
     * @return KeyRangeResult
     *
     */
    @Override
     public KeyRangeResult keyRange(BigDecimal codAnaTskIni, BigDecimal codAnaTskFin, long rowsPerPage, long isNextPage)
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         KeyRangeResult methodResult;
         try
         {
             KeyRangeCaller caller = new KeyRangeCaller();
             methodResult = caller.execute(codAnaTskIni, codAnaTskFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
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
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         SttRangeResult methodResult;
         try
         {
             SttRangeCaller caller = new SttRangeCaller();
             methodResult = caller.execute(codSttIni, codSttFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
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
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         StttmpRangeResult methodResult;
         try
         {
             StttmpRangeCaller caller = new StttmpRangeCaller();
             methodResult = caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
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
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         StttmpBetweenResult methodResult;
         try
         {
             StttmpBetweenCaller caller = new StttmpBetweenCaller();
             methodResult = caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    /**
     * Ejecuta el método KeyDelRange.
     * 
     * @param KeyDelRangeContext     Contexto del cliente
     * @param codAnaTskIni           
     * @param codAnaTskFin           
     *
     * @return KeyDelRangeResult
     *
     */
    @Override
     public KeyDelRangeResult keyDelRange(BigDecimal codAnaTskIni, BigDecimal codAnaTskFin)
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         KeyDelRangeResult methodResult;
         try
         {
             KeyDelRangeCaller caller = new KeyDelRangeCaller();
             methodResult = caller.execute(codAnaTskIni, codAnaTskFin);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
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
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         SttDelRangeResult methodResult;
         try
         {
             SttDelRangeCaller caller = new SttDelRangeCaller();
             methodResult = caller.execute(codSttIni, codSttFin);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
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
         throws PilAnaTskException,
                PilAnaTskRollbackException
    {
         StttmpDelRangeResult methodResult;
         try
         {
             StttmpDelRangeCaller caller = new StttmpDelRangeCaller();
             methodResult = caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin);
    
             if(methodResult.getResultStatus().getResultCode() < 0 )
             {
                 throw new PilAnaTskRollbackException(methodResult.getResultStatus().getResultMsg());
             }
             return methodResult;
         }
         catch (PilAnaTskException ex)
         {
             throw ex;
         }
     }
    
}
//{.Checksum("431742791d22933812c0547934f4f8fb").}
