// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetLockCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del método "PilIncEve.KeyGetLock"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyGetLockCaller extends PilIncEveCallerBase
{
    
    /**
     * Construye un KeyGetLockCaller.
     */
    private String   myImplementation;
    public KeyGetLockCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public KeyGetLockCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "KeyGetLock".
     */
    public KeyGetLockResult execute(BigDecimal codIncEve)
        throws PilIncEveException,
               PilIncEveRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyGetLockCallerOracle Caller = new KeyGetLockCallerOracle();
                return Caller.execute(codIncEve);
            }
            else
            {
              //  KeyGetLockCaller Caller = new KeyGetLockCallerDefault();
                KeyGetLockCallerOracle Caller = new KeyGetLockCallerOracle();
                return Caller.execute(codIncEve);
            }
        }
        catch (Exception ex)
        {
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("2a3fbe0b607af9b572b16c4be9cd0f0b").}
