// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.KeyGet"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyGetCaller extends PilAnaTskCallerBase
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
    public KeyGetResult execute(BigDecimal codAnaTsk)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyGetCallerOracle Caller = new KeyGetCallerOracle();
                return Caller.execute(codAnaTsk);
            }
            else
            {
              //  KeyGetCaller Caller = new KeyGetCallerDefault();
                KeyGetCallerOracle Caller = new KeyGetCallerOracle();
                return Caller.execute(codAnaTsk);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("21eac2d7ebbf2a1829d6da8f32680439").}
