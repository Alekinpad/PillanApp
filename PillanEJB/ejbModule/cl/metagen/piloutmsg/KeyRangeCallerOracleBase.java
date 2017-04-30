// Ecu5GL > no modifique este comentario <

/**
 * @(#)KeyRangeCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:45
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
 *             para el método "PilOutMsg.keyRange"
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
public class KeyRangeCallerOracleBase //[001]
{
    
    /**
     * Construye un KeyRangeCallerOracleBase.
     */
    public KeyRangeCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el método  "KeyRange" implementación "Oracle".
     */
    public KeyRangeResult execute(BigDecimal codOutMsgIni, BigDecimal codOutMsgFin, long rowsPerPage, long isNextPage)
        throws PilOutMsgException,
               PilOutMsgRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        KeyRangeResult keyRangeResult = new KeyRangeResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_OUT_MSG$KEY_RANGE"); //[013]
            
            /**
             * Se inicializan los parámetros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("COD_OUT_MSG_INI", codOutMsgIni); //[023]
            Oracle.setParameter("COD_OUT_MSG_FIN", codOutMsgFin); //[023]
            Oracle.setParameter("ROWS_PER_PAGE", rowsPerPage); //[023]
            Oracle.setParameter("IS_NEXT_PAGE", isNextPage); //[023]
            
            /**
             * Se preparan los campos esperados en la respuesta
             */
            Oracle.setOutputParameterList("PIL_OUT_MSG_KEY_RANGE_CUR"); //[025]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "COD_OUT_MSG", new BigDecimal(0)); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "COD_STT", 0); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "POS_X", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "POS_Y", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "POS_Z", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "IND_P", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "IND_I", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "IND_A", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "username", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "domain", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "channel", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "gls", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "lnk", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "transactTime", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_OUT_MSG_KEY_RANGE_CUR", "entryTime", new String("")); //[026]
            Oracle.closeOutputParameterList("PIL_OUT_MSG_KEY_RANGE_CUR"); //[027]
            Oracle.setOutputParameter("RESULT_CODE", 0); //[024]
            Oracle.setOutputParameter("RESULT_MSG", new String("")); //[024]
            
            /**
             * Invocar el Servicio
             */
            Oracle.execute(); //[028]
            
            /**
             * Crea una estructura vacia de retorno de tipo KeyRangeResult
             */
            keyRangeResult = new KeyRangeResult(); //[030]
            
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
                keyRangeResult.setResultStatus(resultStatus); //[056]
                return keyRangeResult; //[057]
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
                keyRangeResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            
            /**
             * Procesa la lista "outDetalle1" produciendo los "keyRangeResultList"
             */
            list1 = new ArrayList(); //[031]
            uBound1 = Oracle.getNumRows("PIL_OUT_MSG_KEY_RANGE_CUR"); //[032]
            for (rowIdx1 = 0; rowIdx1 < uBound1; rowIdx1++) //[033]
            {
                KeyRangeOutDetalle1Result keyRangeOutDetalle1 = new KeyRangeOutDetalle1Result(); //[034]
                keyRangeOutDetalle1.setCodOutMsg(OracleConversion.fromStringToBigDecimal(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "COD_OUT_MSG", rowIdx1))); //[035]
                keyRangeOutDetalle1.setCodStt(OracleConversion.fromStringTolong(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "COD_STT", rowIdx1))); //[035]
                keyRangeOutDetalle1.setPosX(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "POS_X", rowIdx1)); //[036]
                keyRangeOutDetalle1.setPosY(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "POS_Y", rowIdx1)); //[036]
                keyRangeOutDetalle1.setPosZ(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "POS_Z", rowIdx1)); //[036]
                keyRangeOutDetalle1.setIndP(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "IND_P", rowIdx1)); //[036]
                keyRangeOutDetalle1.setIndI(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "IND_I", rowIdx1)); //[036]
                keyRangeOutDetalle1.setIndA(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "IND_A", rowIdx1)); //[036]
                keyRangeOutDetalle1.setUserName(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "username", rowIdx1)); //[036]
                keyRangeOutDetalle1.setDomain(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "domain", rowIdx1)); //[036]
                keyRangeOutDetalle1.setChannel(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "channel", rowIdx1)); //[036]
                keyRangeOutDetalle1.setGls(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "gls", rowIdx1)); //[036]
                keyRangeOutDetalle1.setLnk(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "lnk", rowIdx1)); //[036]
                keyRangeOutDetalle1.setTransactTime(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "transactTime", rowIdx1)); //[036]
                keyRangeOutDetalle1.setEntryTime(Oracle.getValue("PIL_OUT_MSG_KEY_RANGE_CUR", "entryTime", rowIdx1)); //[036]
                list1.add(keyRangeOutDetalle1); //[037]
            }
            
            KeyRangeOutDetalle1Result[] keyRangeOutDetalle1List = new KeyRangeOutDetalle1Result[list1.size()]; //[039]
            keyRangeOutDetalle1List=(KeyRangeOutDetalle1Result[]) list1.toArray(keyRangeOutDetalle1List); //[040]
            keyRangeResult.setOutDetalle1List(keyRangeOutDetalle1List); //[041]
            keyRangeResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            keyRangeResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
            //fijar los valores para la paginación automática
            if(uBound1 > 0) //[04021a]
            {
                //
                //Todas las veces, incluida la primera, se obtienen los próximos
                //   límites inferiores, para los fines que se estime convenientes
                //   Puede servir para paginar en ciertos casos
                keyRangeResult.setCodOutMsgIni(keyRangeOutDetalle1List[uBound1 - 1].getCodOutMsg()); //[0401]
            }
        }
        catch (Exception Ex) //[044]
        {
            throw new PilOutMsgException("Error detectado en el método KeyRangeCallerOracleBase", Ex); //[046]
        }
        return keyRangeResult; //[047]
    }
}
//{.Checksum("af78212be9f3b2265d30da9999c46c57").}
