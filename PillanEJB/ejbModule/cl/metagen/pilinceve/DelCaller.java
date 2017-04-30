// Ecu5GL > no modifique este comentario <

/**
 * @(#)DelCaller.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 * Invocador del método "PilIncEve.Del"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class DelCaller extends PilIncEveCallerBase
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
    public DelResult execute(BigDecimal codIncEve)
        throws PilIncEveException,
               PilIncEveRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                DelCallerOracle Caller = new DelCallerOracle();
                return Caller.execute(codIncEve);
            }
            else
            {
              //  DelCaller Caller = new DelCallerDefault();
                DelCallerOracle Caller = new DelCallerOracle();
                return Caller.execute(codIncEve);
            }
        }
        catch (Exception ex)
        {
             throw new PilIncEveException(ex);
        }
    }
}
//{.Checksum("06f6494bf8ae0dd1fac9118fa1141929").}
