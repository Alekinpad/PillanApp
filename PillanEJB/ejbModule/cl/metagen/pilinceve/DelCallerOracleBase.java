// Ecu5GL > no modifique este comentario <

/**
 * @(#)DelCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 *             para el m�todo "PilIncEve.del"
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
public class DelCallerOracleBase //[001]
{
    
    /**
     * Construye un DelCallerOracleBase.
     */
    public DelCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el m�todo  "Del" implementaci�n "Oracle".
     */
    public DelResult execute(BigDecimal codIncEve)
        throws PilIncEveException,
               PilIncEveRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        DelResult delResult = new DelResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_INC_EVE$DEL"); //[013]
            
            /**
             * Se inicializan los par�metros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("COD_INC_EVE", codIncEve); //[023]
            
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
             * Crea una estructura vacia de retorno de tipo DelResult
             */
            delResult = new DelResult(); //[030]
            
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
                delResult.setResultStatus(resultStatus); //[056]
                return delResult; //[057]
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
                delResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            delResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            delResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
        }
        catch (Exception Ex) //[044]
        {
            throw new PilIncEveException("Error detectado en el m�todo DelCallerOracleBase", Ex); //[046]
        }
        return delResult; //[047]
    }
}
//{.Checksum("169b8d4dc4bfbbc15f27392b9909507f").}
