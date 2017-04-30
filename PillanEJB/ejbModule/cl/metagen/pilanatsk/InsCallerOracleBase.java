// Ecu5GL > no modifique este comentario <

/**
 * @(#)InsCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Implementa: estrategia de acceso "Oracle"
 *             para el método "PilAnaTsk.ins"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (implementOracle V 1.0.1)
 * @version          1.0.1
 * 
 * Esqueleto utilizado "genericSqlConnector.skl"
 * 
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import cl.chabretual.ecu5gl.connector.oracle.OracleConnector;
public class InsCallerOracleBase //[001]
{
    
    /**
     * Construye un InsCallerOracleBase.
     */
    public InsCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el método  "Ins" implementación "Oracle".
     */
    public InsResult execute(long codStt, String posX, String posY, String posZ, String indP, String indI, String indA, String userName, String domain, String channel, String gls, String lnk, String transactTime, String entryTime)
        throws PilAnaTskException,
               PilAnaTskRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        InsResult insResult = new InsResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_ANA_TSK$INS"); //[013]
            
            /**
             * Se inicializan los parámetros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("COD_STT", codStt); //[023]
            Oracle.setParameter("POS_X", posX, 256); //[023]
            Oracle.setParameter("POS_Y", posY, 256); //[023]
            Oracle.setParameter("POS_Z", posZ, 256); //[023]
            Oracle.setParameter("IND_P", indP, 256); //[023]
            Oracle.setParameter("IND_I", indI, 256); //[023]
            Oracle.setParameter("IND_A", indA, 256); //[023]
            Oracle.setParameter("username", userName, 256); //[023]
            Oracle.setParameter("domain", domain, 256); //[023]
            Oracle.setParameter("channel", channel, 256); //[023]
            Oracle.setParameter("gls", gls, 256); //[023]
            Oracle.setParameter("lnk", lnk, 256); //[023]
            Oracle.setParameter("transactTime", transactTime, 26); //[023]
            Oracle.setParameter("entryTime", entryTime, 26); //[023]
            
            /**
             * Se preparan los campos esperados en la respuesta
             */
            Oracle.setOutputParameter("COD_ANA_TSK", new BigDecimal(0)); //[024]
            Oracle.setOutputParameter("RESULT_CODE", 0); //[024]
            Oracle.setOutputParameter("RESULT_MSG", new String("")); //[024]
            
            /**
             * Invocar el Servicio
             */
            Oracle.execute(); //[028]
            
            /**
             * Crea una estructura vacia de retorno de tipo InsResult
             */
            insResult = new InsResult(); //[030]
            
            /**
             * Analiza el código de retorno aplicativo
             */
            long onErrorResultCode = OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE")); //[048]
            String onErrorResultMsg = Oracle.getValue("RESULT_MSG"); //[049]
            if(onErrorResultCode < 0) //[050c] PositiveErrorValues="false", NegativeErrorValues="true"
            {
                if(onErrorResultCode > 0) //[050]
                {
                    onErrorResultCode = -onErrorResultCode; //[051] 
                }
                ResultStatus resultStatus = new ResultStatus(); //[053]
                resultStatus.setResultCode(onErrorResultCode); //[054]
                resultStatus.setResultMsg(onErrorResultMsg); //[055]
                insResult.setResultStatus(resultStatus); //[056]
                return insResult; //[057]
            }
            
            /**
             * De lo contrario, coloca un resultCode y mensajes positivo en el resutlStatus
             */
            else
            {
                if(onErrorResultCode < 0) //[2050]
                {
                    onErrorResultCode = -onErrorResultCode; //[2051] 
                }
                ResultStatus resultStatus = new ResultStatus(); //[2053]
                resultStatus.setResultCode(onErrorResultCode); //[2054]
                resultStatus.setResultMsg(onErrorResultMsg); //[2055]
                insResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            insResult.setCodAnaTsk(OracleConversion.fromStringToBigDecimal(Oracle.getValue("COD_ANA_TSK"))); //[042]
            insResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            insResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
        }
        catch (Exception Ex) //[044]
        {
            throw new PilAnaTskException("Error detectado en el método InsCallerOracleBase", Ex); //[046]
        }
        return insResult; //[047]
    }
}
//{.Checksum("057c6cf75d00bc1b6ebe6012b5cd54c9").}
