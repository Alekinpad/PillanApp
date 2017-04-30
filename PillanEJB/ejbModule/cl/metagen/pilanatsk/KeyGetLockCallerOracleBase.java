// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyGetLockCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 *             para el método "PilAnaTsk.keyGetLock"
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
public class KeyGetLockCallerOracleBase //[001]
{
    
    /**
     * Construye un KeyGetLockCallerOracleBase.
     */
    public KeyGetLockCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el método  "KeyGetLock" implementación "Oracle".
     */
    public KeyGetLockResult execute(BigDecimal codAnaTsk)
        throws PilAnaTskException,
               PilAnaTskRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        KeyGetLockResult keyGetLockResult = new KeyGetLockResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_ANA_TSK$KEY_GET_LOCK"); //[013]
            
            /**
             * Se inicializan los parámetros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("COD_ANA_TSK", codAnaTsk); //[023]
            
            /**
             * Se preparan los campos esperados en la respuesta
             */
            Oracle.setOutputParameter("COD_STT", 0); //[024]
            Oracle.setOutputParameter("POS_X", new String("")); //[024]
            Oracle.setOutputParameter("POS_Y", new String("")); //[024]
            Oracle.setOutputParameter("POS_Z", new String("")); //[024]
            Oracle.setOutputParameter("IND_P", new String("")); //[024]
            Oracle.setOutputParameter("IND_I", new String("")); //[024]
            Oracle.setOutputParameter("IND_A", new String("")); //[024]
            Oracle.setOutputParameter("username", new String("")); //[024]
            Oracle.setOutputParameter("domain", new String("")); //[024]
            Oracle.setOutputParameter("channel", new String("")); //[024]
            Oracle.setOutputParameter("gls", new String("")); //[024]
            Oracle.setOutputParameter("lnk", new String("")); //[024]
            Oracle.setOutputParameter("transactTime", new String("")); //[024]
            Oracle.setOutputParameter("entryTime", new String("")); //[024]
            Oracle.setOutputParameter("RESULT_CODE", 0); //[024]
            Oracle.setOutputParameter("RESULT_MSG", new String("")); //[024]
            
            /**
             * Invocar el Servicio
             */
            Oracle.execute(); //[028]
            
            /**
             * Crea una estructura vacia de retorno de tipo KeyGetLockResult
             */
            keyGetLockResult = new KeyGetLockResult(); //[030]
            
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
                keyGetLockResult.setResultStatus(resultStatus); //[056]
                return keyGetLockResult; //[057]
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
                keyGetLockResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            keyGetLockResult.setCodStt(OracleConversion.fromStringTolong(Oracle.getValue("COD_STT"))); //[042]
            keyGetLockResult.setPosX(Oracle.getValue("POS_X")); //[043]
            keyGetLockResult.setPosY(Oracle.getValue("POS_Y")); //[043]
            keyGetLockResult.setPosZ(Oracle.getValue("POS_Z")); //[043]
            keyGetLockResult.setIndP(Oracle.getValue("IND_P")); //[043]
            keyGetLockResult.setIndI(Oracle.getValue("IND_I")); //[043]
            keyGetLockResult.setIndA(Oracle.getValue("IND_A")); //[043]
            keyGetLockResult.setUserName(Oracle.getValue("username")); //[043]
            keyGetLockResult.setDomain(Oracle.getValue("domain")); //[043]
            keyGetLockResult.setChannel(Oracle.getValue("channel")); //[043]
            keyGetLockResult.setGls(Oracle.getValue("gls")); //[043]
            keyGetLockResult.setLnk(Oracle.getValue("lnk")); //[043]
            stringTmp = Oracle.getValue("transactTime"); //[0431] Para corregir que el Oracle retorna un char de 4000 para los X
            if(stringTmp != null) //[0431b]
            {
                if(stringTmp.length() < 26) //[0432]
                {
                    stringTmp = (stringTmp + "                          "); //[0433]
                }
                stringTmp = stringTmp.substring(0, 26); //[0434]
            }
            keyGetLockResult.setTransactTime(stringTmp); //[043c]
            stringTmp = Oracle.getValue("entryTime"); //[0431] Para corregir que el Oracle retorna un char de 4000 para los X
            if(stringTmp != null) //[0431b]
            {
                if(stringTmp.length() < 26) //[0432]
                {
                    stringTmp = (stringTmp + "                          "); //[0433]
                }
                stringTmp = stringTmp.substring(0, 26); //[0434]
            }
            keyGetLockResult.setEntryTime(stringTmp); //[043c]
            keyGetLockResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            keyGetLockResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
        }
        catch (Exception Ex) //[044]
        {
            throw new PilAnaTskException("Error detectado en el método KeyGetLockCallerOracleBase", Ex); //[046]
        }
        return keyGetLockResult; //[047]
    }
}
//{.Checksum("05fcb6764daa6646859a9ae35c4f6d44").}
