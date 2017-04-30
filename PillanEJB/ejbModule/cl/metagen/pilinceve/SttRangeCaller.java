// Ecu5GL > no modifique este comentario <

/**
 * @(#)SttRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del m�todo "PilIncEve.SttRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class SttRangeCaller extends PilIncEveCallerBase
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
     * Ejecuta el m�todo  "SttRange".
     */
    public SttRangeResult execute(long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
        throws PilIncEveException,
               PilIncEveRollbackException
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
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("bcf19dd040a4ccf7c2614f2aa7fbcdef").}
