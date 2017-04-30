// Ecu5GL > no modifique este comentario <

/**
 * @(#)StttmpDelRangeCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 * Implementa: estrategia de acceso "Oracle"
 *             para el m�todo "PilOutMsg.stttmpDelRange"
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
public class StttmpDelRangeCallerOracleBase //[001]
{
    
    /**
     * Construye un StttmpDelRangeCallerOracleBase.
     */
    public StttmpDelRangeCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el m�todo  "StttmpDelRange" implementaci�n "Oracle".
     */
    public StttmpDelRangeResult execute(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin)
        throws PilOutMsgException,
               PilOutMsgRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        StttmpDelRangeResult stttmpDelRangeResult = new StttmpDelRangeResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_OUT_MSG$STTTMP_DEL_RANGE"); //[013]
            
            /**
             * Se inicializan los par�metros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("ENTRYTIME_INI", entryTimeIni, 26); //[023]
            Oracle.setParameter("ENTRYTIME_FIN", entryTimeFin, 26); //[023]
            Oracle.setParameter("COD_STT_INI", codSttIni); //[023]
            Oracle.setParameter("COD_STT_FIN", codSttFin); //[023]
            
            /**
             * Se preparan los campos esperados en la respuesta
             */
            Oracle.setOutputParameter("RESULT_CODE", 0); //[024]
            Oracle.setOutputParameter("RESULT_MSG", new String("")); //[024]
            
            /**
             * Invocar el Servicio
             */
            Oracle.execute(); //[028]
            
            /**
             * Crea una estructura vacia de retorno de tipo StttmpDelRangeResult
             */
            stttmpDelRangeResult = new StttmpDelRangeResult(); //[030]
            
            /**
             * Analiza el c�digo de retorno aplicativo
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
                stttmpDelRangeResult.setResultStatus(resultStatus); //[056]
                return stttmpDelRangeResult; //[057]
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
                stttmpDelRangeResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            stttmpDelRangeResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            stttmpDelRangeResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
        }
        catch (Exception Ex) //[044]
        {
            throw new PilOutMsgException("Error detectado en el m�todo StttmpDelRangeCallerOracleBase", Ex); //[046]
        }
        return stttmpDelRangeResult; //[047]
    }
}
//{.Checksum("58f79a09e3c0c9d0d0ab98f59316206a").}
