// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyDelRangeCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del m�todo "PilAnaTsk.KeyDelRange"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class KeyDelRangeCaller extends PilAnaTskCallerBase
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
     * Ejecuta el m�todo  "KeyDelRange".
     */
    public KeyDelRangeResult execute(BigDecimal codAnaTskIni, BigDecimal codAnaTskFin)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                KeyDelRangeCallerOracle Caller = new KeyDelRangeCallerOracle();
                return Caller.execute(codAnaTskIni, codAnaTskFin);
            }
            else
            {
              //  KeyDelRangeCaller Caller = new KeyDelRangeCallerDefault();
                KeyDelRangeCallerOracle Caller = new KeyDelRangeCallerOracle();
                return Caller.execute(codAnaTskIni, codAnaTskFin);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("c4f1a4b358786251daaf2435b9254aa4").}
