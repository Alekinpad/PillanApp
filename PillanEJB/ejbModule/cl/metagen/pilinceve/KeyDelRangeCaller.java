// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyDelRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del método "PilIncEve.KeyDelRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyDelRangeCaller extends PilIncEveCallerBase
{
    
    /**
     * Construye un KeyDelRangeCaller.
     */
    private String   myImplementation;
    public KeyDelRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public KeyDelRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "KeyDelRange".
     */
    public KeyDelRangeResult execute(BigDecimal codIncEveIni, BigDecimal codIncEveFin)
        throws PilIncEveException,
               PilIncEveRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyDelRangeCallerOracle Caller = new KeyDelRangeCallerOracle();
                return Caller.execute(codIncEveIni, codIncEveFin);
            }
            else
            {
              //  KeyDelRangeCaller Caller = new KeyDelRangeCallerDefault();
                KeyDelRangeCallerOracle Caller = new KeyDelRangeCallerOracle();
                return Caller.execute(codIncEveIni, codIncEveFin);
            }
        }
        catch (Exception ex)
        {
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("829a5c7e40f001ca1063faddd89eaab8").}
