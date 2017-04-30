// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.KeyGet"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyGetCaller extends PilOutMsgCallerBase
{
    
    /**
     * Construye un KeyGetCaller.
     */
    private String   myImplementation;
    public KeyGetCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public KeyGetCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "KeyGet".
     */
    public KeyGetResult execute(BigDecimal codOutMsg)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyGetCallerOracle Caller = new KeyGetCallerOracle();
                return Caller.execute(codOutMsg);
            }
            else
            {
              //  KeyGetCaller Caller = new KeyGetCallerDefault();
                KeyGetCallerOracle Caller = new KeyGetCallerOracle();
                return Caller.execute(codOutMsg);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("6ef0b6d538fb87c8ac0b9edf041e8955").}
