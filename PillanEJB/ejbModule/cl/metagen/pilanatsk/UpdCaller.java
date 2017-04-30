// Ecu5GL > no modifique este comentario <

/**
 * @(#)UpdCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.Upd"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class UpdCaller extends PilAnaTskCallerBase
{
    
    /**
     * Construye un UpdCaller.
     */
    private String   myImplementation;
    public UpdCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public UpdCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "Upd".
     */
    public UpdResult execute(BigDecimal codAnaTsk, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                UpdCallerOracle Caller = new UpdCallerOracle();
                return Caller.execute(codAnaTsk, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
            }
            else
            {
              //  UpdCaller Caller = new UpdCallerDefault();
                UpdCallerOracle Caller = new UpdCallerOracle();
                return Caller.execute(codAnaTsk, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("8c37c58876cfcad5c9a385a3aad3e858").}
