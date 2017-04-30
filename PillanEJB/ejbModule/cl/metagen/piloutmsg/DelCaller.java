// Ecu5GL > no modifique este comentario <

/**
 * @(#)DelCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.Del"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class DelCaller extends PilOutMsgCallerBase
{
    
    /**
     * Construye un DelCaller.
     */
    private String   myImplementation;
    public DelCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public DelCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "Del".
     */
    public DelResult execute(BigDecimal codOutMsg)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                DelCallerOracle Caller = new DelCallerOracle();
                return Caller.execute(codOutMsg);
            }
            else
            {
              //  DelCaller Caller = new DelCallerDefault();
                DelCallerOracle Caller = new DelCallerOracle();
                return Caller.execute(codOutMsg);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("29bf746615df88b06d0ab8a1fbc79736").}
