// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.KeyRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyRangeCaller extends PilOutMsgCallerBase
{
    
    /**
     * Construye un KeyRangeCaller.
     */
    private String   myImplementation;
    public KeyRangeCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public KeyRangeCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "KeyRange".
     */
    public KeyRangeResult execute(BigDecimal codOutMsgIni, BigDecimal codOutMsgFin, long rowsPerPage, long isNextPage)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyRangeCallerOracle Caller = new KeyRangeCallerOracle();
                return Caller.execute(codOutMsgIni, codOutMsgFin, rowsPerPage, isNextPage);
            }
            else
            {
              //  KeyRangeCaller Caller = new KeyRangeCallerDefault();
                KeyRangeCallerOracle Caller = new KeyRangeCallerOracle();
                return Caller.execute(codOutMsgIni, codOutMsgFin, rowsPerPage, isNextPage);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("ef95b73e702f1cd41eee182bdd0b5ba2").}
