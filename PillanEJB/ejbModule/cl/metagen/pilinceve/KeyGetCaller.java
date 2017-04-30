// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del método "PilIncEve.KeyGet"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyGetCaller extends PilIncEveCallerBase
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
    public KeyGetResult execute(BigDecimal codIncEve)
        throws PilIncEveException,
               PilIncEveRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyGetCallerOracle Caller = new KeyGetCallerOracle();
                return Caller.execute(codIncEve);
            }
            else
            {
              //  KeyGetCaller Caller = new KeyGetCallerDefault();
                KeyGetCallerOracle Caller = new KeyGetCallerOracle();
                return Caller.execute(codIncEve);
            }
        }
        catch (Exception ex)
        {
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("6fe91ba0b99ab76fdaa392cf17cfbcd3").}
