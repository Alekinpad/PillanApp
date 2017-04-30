// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.KeyRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyRangeCaller extends PilAnaTskCallerBase
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
    public KeyRangeResult execute(BigDecimal codAnaTskIni, BigDecimal codAnaTskFin, long rowsPerPage, long isNextPage)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyRangeCallerOracle Caller = new KeyRangeCallerOracle();
                return Caller.execute(codAnaTskIni, codAnaTskFin, rowsPerPage, isNextPage);
            }
            else
            {
              //  KeyRangeCaller Caller = new KeyRangeCallerDefault();
                KeyRangeCallerOracle Caller = new KeyRangeCallerOracle();
                return Caller.execute(codAnaTskIni, codAnaTskFin, rowsPerPage, isNextPage);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("e44cf9a6c8ecb395395c4a120c22fd01").}
