// Ecu5GL > no modifique este comentario <

/**
 * @(#)SttRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.SttRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class SttRangeCaller extends PilOutMsgCallerBase
{
    
    /**
     * Construye un SttRangeCaller.
     */
    private String   myImplementation;
    public SttRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public SttRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "SttRange".
     */
    public SttRangeResult execute(long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                SttRangeCallerOracle Caller = new SttRangeCallerOracle();
                return Caller.execute(codSttIni, codSttFin, rowsPerPage, isNextPage);
            }
            else
            {
              //  SttRangeCaller Caller = new SttRangeCallerDefault();
                SttRangeCallerOracle Caller = new SttRangeCallerOracle();
                return Caller.execute(codSttIni, codSttFin, rowsPerPage, isNextPage);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("15734515bef6fbfa335d16f306e35f4f").}
