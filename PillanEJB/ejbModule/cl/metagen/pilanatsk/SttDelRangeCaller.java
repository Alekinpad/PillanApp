// Ecu5GL > no modifique este comentario <

/**
 * @(#)SttDelRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.SttDelRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class SttDelRangeCaller extends PilAnaTskCallerBase
{
    
    /**
     * Construye un SttDelRangeCaller.
     */
    private String   myImplementation;
    public SttDelRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public SttDelRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "SttDelRange".
     */
    public SttDelRangeResult execute(long codSttIni, long codSttFin)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                SttDelRangeCallerOracle Caller = new SttDelRangeCallerOracle();
                return Caller.execute(codSttIni, codSttFin);
            }
            else
            {
              //  SttDelRangeCaller Caller = new SttDelRangeCallerDefault();
                SttDelRangeCallerOracle Caller = new SttDelRangeCallerOracle();
                return Caller.execute(codSttIni, codSttFin);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("a5a6651fda116e563c5e001feb7edd13").}
