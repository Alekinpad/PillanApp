// Ecu5GL > no modifique este comentario <

/**
 * @(#)DelCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.Del"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class DelCaller extends PilAnaTskCallerBase
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
    public DelResult execute(BigDecimal codAnaTsk)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                DelCallerOracle Caller = new DelCallerOracle();
                return Caller.execute(codAnaTsk);
            }
            else
            {
              //  DelCaller Caller = new DelCallerDefault();
                DelCallerOracle Caller = new DelCallerOracle();
                return Caller.execute(codAnaTsk);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("287160f7b7603c395c92017fae0f4c5e").}
