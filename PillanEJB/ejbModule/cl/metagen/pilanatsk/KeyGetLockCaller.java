// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetLockCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.KeyGetLock"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyGetLockCaller extends PilAnaTskCallerBase
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
    public KeyGetLockResult execute(BigDecimal codAnaTsk)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyGetLockCallerOracle Caller = new KeyGetLockCallerOracle();
                return Caller.execute(codAnaTsk);
            }
            else
            {
              //  KeyGetLockCaller Caller = new KeyGetLockCallerDefault();
                KeyGetLockCallerOracle Caller = new KeyGetLockCallerOracle();
                return Caller.execute(codAnaTsk);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("0bbfa55c51be6c629d8805a382009506").}
