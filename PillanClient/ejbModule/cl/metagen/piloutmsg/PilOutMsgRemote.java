// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilOutMsgRemote.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Interface para el acceso remoto de "PilOutMsg"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildRemoteInterface V 2.0.1)
 * @version          2.0.1
 */
import javax.ejb.Remote;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Define los métodos invocables por clientes remotos de PilOutMsg
 * 
 */
@Remote
public interface PilOutMsgRemote
{
    /**
     * Ejecuta el método Ins.
     * 
     */
     public InsResult ins
            (long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
           throws PilOutMsgException;
    /**
     * Ejecuta el método KeyGet.
     * 
     */
     public KeyGetResult keyGet
            (BigDecimal codOutMsg)
           throws PilOutMsgException;
    /**
     * Ejecuta el método KeyGetLock.
     * 
     */
     public KeyGetLockResult keyGetLock
            (BigDecimal codOutMsg)
           throws PilOutMsgException;
    /**
     * Ejecuta el método Upd.
     * 
     */
     public UpdResult upd
            (BigDecimal codOutMsg, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
           throws PilOutMsgException;
    /**
     * Ejecuta el método Del.
     * 
     */
     public DelResult del
            (BigDecimal codOutMsg)
           throws PilOutMsgException;
    /**
     * Ejecuta el método KeyRange.
     * 
     */
     public KeyRangeResult keyRange
            (BigDecimal codOutMsgIni, BigDecimal codOutMsgFin, long rowsPerPage, long isNextPage)
           throws PilOutMsgException;
    /**
     * Ejecuta el método SttRange.
     * 
     */
     public SttRangeResult sttRange
            (long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilOutMsgException;
    /**
     * Ejecuta el método StttmpRange.
     * 
     */
     public StttmpRangeResult stttmpRange
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilOutMsgException;
    /**
     * Ejecuta el método StttmpBetween.
     * 
     */
     public StttmpBetweenResult stttmpBetween
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilOutMsgException;
    /**
     * Ejecuta el método KeyDelRange.
     * 
     */
     public KeyDelRangeResult keyDelRange
            (BigDecimal codOutMsgIni, BigDecimal codOutMsgFin)
           throws PilOutMsgException;
    /**
     * Ejecuta el método SttDelRange.
     * 
     */
     public SttDelRangeResult sttDelRange
            (long codSttIni, long codSttFin)
           throws PilOutMsgException;
    /**
     * Ejecuta el método StttmpDelRange.
     * 
     */
     public StttmpDelRangeResult stttmpDelRange
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin)
           throws PilOutMsgException;
}
//{.Checksum("20d9249a918dbfce12d563e46436da25").}
