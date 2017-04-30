// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyDelRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.KeyDelRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyDelRangeCaller extends PilOutMsgCallerBase
{
    
    /**
     * Construye un KeyDelRangeCaller.
     */
    private String   myImplementation;
    public KeyDelRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public KeyDelRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "KeyDelRange".
     */
    public KeyDelRangeResult execute(BigDecimal codOutMsgIni, BigDecimal codOutMsgFin)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyDelRangeCallerOracle Caller = new KeyDelRangeCallerOracle();
                return Caller.execute(codOutMsgIni, codOutMsgFin);
            }
            else
            {
              //  KeyDelRangeCaller Caller = new KeyDelRangeCallerDefault();
                KeyDelRangeCallerOracle Caller = new KeyDelRangeCallerOracle();
                return Caller.execute(codOutMsgIni, codOutMsgFin);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("96bc7e07598812f3a7f9d2a99f199a47").}
