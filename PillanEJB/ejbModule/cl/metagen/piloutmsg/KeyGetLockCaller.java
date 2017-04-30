// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetLockCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.KeyGetLock"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyGetLockCaller extends PilOutMsgCallerBase
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
    public KeyGetLockResult execute(BigDecimal codOutMsg)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyGetLockCallerOracle Caller = new KeyGetLockCallerOracle();
                return Caller.execute(codOutMsg);
            }
            else
            {
              //  KeyGetLockCaller Caller = new KeyGetLockCallerDefault();
                KeyGetLockCallerOracle Caller = new KeyGetLockCallerOracle();
                return Caller.execute(codOutMsg);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("134382b087b8ad2501be8d862e93be49").}
