// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilAnaTskRemote.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Interface para el acceso remoto de "PilAnaTsk"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildRemoteInterface V 2.0.1)
 * @version          2.0.1
 */
import javax.ejb.Remote;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Define los métodos invocables por clientes remotos de PilAnaTsk
 * 
 */
@Remote
public interface PilAnaTskRemote
{
    /**
     * Ejecuta el método Ins.
     * 
     */
     public InsResult ins
            (long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
           throws PilAnaTskException;
    /**
     * Ejecuta el método KeyGet.
     * 
     */
     public KeyGetResult keyGet
            (BigDecimal codAnaTsk)
           throws PilAnaTskException;
    /**
     * Ejecuta el método KeyGetLock.
     * 
     */
     public KeyGetLockResult keyGetLock
            (BigDecimal codAnaTsk)
           throws PilAnaTskException;
    /**
     * Ejecuta el método Upd.
     * 
     */
     public UpdResult upd
            (BigDecimal codAnaTsk, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
           throws PilAnaTskException;
    /**
     * Ejecuta el método Del.
     * 
     */
     public DelResult del
            (BigDecimal codAnaTsk)
           throws PilAnaTskException;
    /**
     * Ejecuta el método KeyRange.
     * 
     */
     public KeyRangeResult keyRange
            (BigDecimal codAnaTskIni, BigDecimal codAnaTskFin, long rowsPerPage, long isNextPage)
           throws PilAnaTskException;
    /**
     * Ejecuta el método SttRange.
     * 
     */
     public SttRangeResult sttRange
            (long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilAnaTskException;
    /**
     * Ejecuta el método StttmpRange.
     * 
     */
     public StttmpRangeResult stttmpRange
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilAnaTskException;
    /**
     * Ejecuta el método StttmpBetween.
     * 
     */
     public StttmpBetweenResult stttmpBetween
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
           throws PilAnaTskException;
    /**
     * Ejecuta el método KeyDelRange.
     * 
     */
     public KeyDelRangeResult keyDelRange
            (BigDecimal codAnaTskIni, BigDecimal codAnaTskFin)
           throws PilAnaTskException;
    /**
     * Ejecuta el método SttDelRange.
     * 
     */
     public SttDelRangeResult sttDelRange
            (long codSttIni, long codSttFin)
           throws PilAnaTskException;
    /**
     * Ejecuta el método StttmpDelRange.
     * 
     */
     public StttmpDelRangeResult stttmpDelRange
            (String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin)
           throws PilAnaTskException;
}
//{.Checksum("7043d0c8d2e7f83eabcc1ed5309d33bc").}
