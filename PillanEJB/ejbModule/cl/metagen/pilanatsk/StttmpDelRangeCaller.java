// Ecu5GL > no modifique este comentario <

/**
 * @(#)StttmpDelRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.StttmpDelRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class StttmpDelRangeCaller extends PilAnaTskCallerBase
{
    
    /**
     * Construye un StttmpDelRangeCaller.
     */
    private String   myImplementation;
    public StttmpDelRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public StttmpDelRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "StttmpDelRange".
     */
    public StttmpDelRangeResult execute(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                StttmpDelRangeCallerOracle Caller = new StttmpDelRangeCallerOracle();
                return Caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin);
            }
            else
            {
              //  StttmpDelRangeCaller Caller = new StttmpDelRangeCallerDefault();
                StttmpDelRangeCallerOracle Caller = new StttmpDelRangeCallerOracle();
                return Caller.execute(entryTimeIni, entryTimeFin, codSttIni, codSttFin);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("127841500bf1b4df7da9cd88e96211b3").}
