// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyDelRangeCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:36
 *
 *
 * Copyright (c) CHABRETUAL LTDA (Chile) Derechos reservados.
 *
 * Este es un archivo generado.
 * NO MODIFIQUE ESTE ARCHIVO
 *
 */
package cl.metagen.pilinceve;

/**
 * Implementa: estrategia de acceso "Oracle"
 *             para el m�todo "PilIncEve.keyDelRange"
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
public class KeyDelRangeCallerOracleBase //[001]
{
    
    /**
     * Construye un KeyDelRangeCallerOracleBase.
     */
    public KeyDelRangeCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el m�todo  "KeyDelRange" implementaci�n "Oracle".
     */
    public KeyDelRangeResult execute(BigDecimal codIncEveIni, BigDecimal codIncEveFin)
        throws PilIncEveException,
               PilIncEveRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        KeyDelRangeResult keyDelRangeResult = new KeyDelRangeResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_INC_EVE$KEY_DEL_RANGE"); //[013]
            
            /**
             * Se inicializan los par�metros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("COD_INC_EVE_INI", codIncEveIni); //[023]
            Oracle.setParameter("COD_INC_EVE_FIN", codIncEveFin); //[023]
            
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
             * Crea una estructura vacia de retorno de tipo KeyDelRangeResult
             */
            keyDelRangeResult = new KeyDelRangeResult(); //[030]
            
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
                keyDelRangeResult.setResultStatus(resultStatus); //[056]
                return keyDelRangeResult; //[057]
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
                keyDelRangeResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            keyDelRangeResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            keyDelRangeResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
        }
        catch (Exception Ex) //[044]
        {
            throw new PilIncEveException("Error detectado en el m�todo KeyDelRangeCallerOracleBase", Ex); //[046]
        }
        return keyDelRangeResult; //[047]
    }
}
//{.Checksum("39184cff965f69090ef5c01aa4270bd1").}
