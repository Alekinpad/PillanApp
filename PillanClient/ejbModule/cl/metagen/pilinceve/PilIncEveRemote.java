// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilIncEveRemote.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Interface para el acceso remoto de "PilIncEve"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildRemoteInterface V 2.0.1)
 * @version          2.0.1
 */
import javax.ejb.Remote;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Define los métodos invocables por clientes remotos de PilIncEve
 * 
 */
@Remote
public interface PilIncEveRemote
{
    /**
     * Ejecuta el método Ins.
     * 
     */
     public InsResult ins
            (long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
           throws PilIncEveException;
    /**
     * Ejecuta el método KeyGet.
     * 
     */
     public KeyGetResult keyGet
            (BigDecimal codIncEve)
           throws PilIncEveException;
    /**
     * Ejecuta el método KeyGetLock.
     * 
     */
     public KeyGetLockResult keyGetLock
            (BigDecimal codIncEve)
           throws PilIncEveException;
    /**
     * Ejecuta el método Upd.
     * 
     */
     public UpdResult upd
            (BigDecimal codIncEve, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
           throws PilIncEveException;
    /**
     * Ejecuta el método Del.
     * 
     */
     public DelResult del
            (BigDecimal codIncEve)
           throws PilIncEveException;
    /**
     * Ejecuta el método KeyRange.
     * 
     */
     public KeyRangeResult keyRange
            (BigDecimal codIncEveIni, BigDecimal codIncEveFin, long rowsPerPage, long isNextPage)
           throws PilIncEveException;
    /**
     * Ejecuta el método SttRange.
     * 
     */
     public SttRangeResult sttRange
            (long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilIncEveException;
    /**
     * Ejecuta el método StttmpRange.
     * 
     */
     public StttmpRangeResult stttmpRange
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilIncEveException;
    /**
     * Ejecuta el método StttmpBetween.
     * 
     */
     public StttmpBetweenResult stttmpBetween
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilIncEveException;
    /**
     * Ejecuta el método KeyDelRange.
     * 
     */
     public KeyDelRangeResult keyDelRange
            (BigDecimal codIncEveIni, BigDecimal codIncEveFin)
           throws PilIncEveException;
    /**
     * Ejecuta el método SttDelRange.
     * 
     */
     public SttDelRangeResult sttDelRange
            (long codSttIni, long codSttFin)
           throws PilIncEveException;
    /**
     * Ejecuta el método StttmpDelRange.
     * 
     */
     public StttmpDelRangeResult stttmpDelRange
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin)
           throws PilIncEveException;
}
//{.Checksum("dba8dae005573b64db8bb10f12036c34").}
