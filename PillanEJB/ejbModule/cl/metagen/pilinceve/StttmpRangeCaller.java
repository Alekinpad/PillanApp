// Ecu5GL > no modifique este comentario <

/**
 * @(#)StttmpRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del m�todo "PilIncEve.StttmpRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class StttmpRangeCaller extends PilIncEveCallerBase
{
    
    /**
     * Construye un StttmpRangeCaller.
     */
    private String   myImplementation;
    public StttmpRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public StttmpRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el m�todo  "StttmpRange".
     */
    public StttmpRangeResult execute(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
        throws PilIncEveException,
               PilIncEveRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                StttmpRangeCallerOracle Caller = new StttmpRangeCallerOracle();
                return Caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
            }
            else
            {
              //  StttmpRangeCaller Caller = new StttmpRangeCallerDefault();
                StttmpRangeCallerOracle Caller = new StttmpRangeCallerOracle();
                return Caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
            }
        }
        catch (Exception ex)
        {
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("574003db2b8fc5cb0069c43396499d8e").}
