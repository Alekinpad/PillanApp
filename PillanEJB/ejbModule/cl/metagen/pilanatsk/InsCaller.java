// Ecu5GL > no modifique este comentario <

/**
 * @(#)InsCaller.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Invocador del método "PilAnaTsk.Ins"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class InsCaller extends PilAnaTskCallerBase
{
    
    /**
     * Construye un InsCaller.
     */
    private String   myImplementation;
    public InsCaller(String implementation)
    {
        myImplementation = implementation;
    }
    public InsCaller()
    {
        myImplementation = "Oracle";
    }
    
    /**
     * Ejecuta el método  "Ins".
     */
    public InsResult execute(long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
        throws PilAnaTskException,
               PilAnaTskRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                InsCallerOracle Caller = new InsCallerOracle();
                return Caller.execute(codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
            }
            else
            {
              //  InsCaller Caller = new InsCallerDefault();
                InsCallerOracle Caller = new InsCallerOracle();
                return Caller.execute(codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
            }
        }
        catch (Exception ex)
        {
             throw new PilAnaTskException(ex);
        }
    }
}
//{.Checksum("a46159ec37a146a79f9bcd652187f77c").}
