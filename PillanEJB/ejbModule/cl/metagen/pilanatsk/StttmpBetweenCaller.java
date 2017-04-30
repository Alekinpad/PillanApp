// Ecu5GL > no modifique este comentario <

/**
 * @(#)StttmpBetweenCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.StttmpBetween"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class StttmpBetweenCaller extends PilAnaTskCallerBase
{
    
    /**
     * Construye un StttmpBetweenCaller.
     */
    private String   myImplementation;
    public StttmpBetweenCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public StttmpBetweenCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "StttmpBetween".
     */
    public StttmpBetweenResult execute(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                StttmpBetweenCallerOracle Caller = new StttmpBetweenCallerOracle();
                return Caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
            }
            else
            {
              //  StttmpBetweenCaller Caller = new StttmpBetweenCallerDefault();
                StttmpBetweenCallerOracle Caller = new StttmpBetweenCallerOracle();
                return Caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin, rowsPerPage, isNextPage);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("b45bb3b5bebf4da7f39867d98c53c93f").}
