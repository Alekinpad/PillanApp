// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del método "PilIncEve.KeyRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyRangeCaller extends PilIncEveCallerBase
{
    
    /**
     * Construye un KeyRangeCaller.
     */
    private String   myImplementation;
    public KeyRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public KeyRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "KeyRange".
     */
    public KeyRangeResult execute(BigDecimal codIncEveIni, BigDecimal codIncEveFin, long rowsPerPage, long isNextPage)
        throws PilIncEveException,
               PilIncEveRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyRangeCallerOracle Caller = new KeyRangeCallerOracle();
                return Caller.execute(codIncEveIni, codIncEveFin, rowsPerPage, isNextPage);
            }
            else
            {
              //  KeyRangeCaller Caller = new KeyRangeCallerDefault();
                KeyRangeCallerOracle Caller = new KeyRangeCallerOracle();
                return Caller.execute(codIncEveIni, codIncEveFin, rowsPerPage, isNextPage);
            }
        }
        catch (Exception ex)
        {
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("1d141d671cc242e2626f7fc6aa6d259f").}
