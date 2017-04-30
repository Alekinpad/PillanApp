// Ecu5GL > no modifique este comentario <

/**
 * @(#)UpdCaller.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Invocador del método "PilOutMsg.Upd"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildMethodCaller V 1.0.1)
 * @version          1.0.1
 */
import java.math.BigDecimal;
import java.util.Date;
public class UpdCaller extends PilOutMsgCallerBase
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
    public UpdResult execute(BigDecimal codOutMsg, long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
        throws PilOutMsgException,
               PilOutMsgRollbackException
    {
        try
        {
            if  (myImplementation.equals("Oracle"))
            {
                UpdCallerOracle Caller = new UpdCallerOracle();
                return Caller.execute(codOutMsg, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
            }
            else
            {
              //  UpdCaller Caller = new UpdCallerDefault();
                UpdCallerOracle Caller = new UpdCallerOracle();
                return Caller.execute(codOutMsg, codStt, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
            }
        }
        catch (Exception ex)
        {
             throw new PilOutMsgException(ex);
        }
    }
}
//{.Checksum("c47669370808f1c1d879ec71004c7478").}
