// Ecu5GL > no modifique este comentario <

/**
 * @(#)StttmpBetweenCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:36
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
 *             para el método "PilIncEve.stttmpBetween"
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
public class StttmpBetweenCallerOracleBase //[001]
{
    
    /**
     * Construye un StttmpBetweenCallerOracleBase.
     */
    public StttmpBetweenCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el método  "StttmpBetween" implementación "Oracle".
     */
    public StttmpBetweenResult execute(String entryTimeIni, String entryTimeFin, long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
        throws PilIncEveException,
               PilIncEveRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        StttmpBetweenResult stttmpBetweenResult = new StttmpBetweenResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_INC_EVE$STTTMP_BETWEEN"); //[013]
            
            /**
             * Se inicializan los parámetros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("ENTRYTIME_INI", entryTimeIni, 26); //[023]
            Oracle.setParameter("ENTRYTIME_FIN", entryTimeFin, 26); //[023]
            Oracle.setParameter("COD_STT_INI", codSttIni); //[023]
            Oracle.setParameter("COD_STT_FIN", codSttFin); //[023]
            Oracle.setParameter("ROWS_PER_PAGE", rowsPerPage); //[023]
            Oracle.setParameter("IS_NEXT_PAGE", isNextPage); //[023]
            
            /**
             * Se preparan los campos esperados en la respuesta
             */
            Oracle.setOutputParameterList("PIL_INC_EVE_STTTMP_BETWEEN_CUR"); //[025]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "COD_INC_EVE", new BigDecimal(0)); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "COD_STT", 0); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "POS_X", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "POS_Y", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "POS_Z", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "IND_P", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "IND_I", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "IND_A", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "username", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "domain", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "channel", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "gls", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "lnk", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "transactTime", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "entryTime", new String("")); //[026]
            Oracle.closeOutputParameterList("PIL_INC_EVE_STTTMP_BETWEEN_CUR"); //[027]
            Oracle.setOutputParameter("RESULT_CODE", 0); //[024]
            Oracle.setOutputParameter("RESULT_MSG", new String("")); //[024]
            
            /**
             * Invocar el Servicio
             */
            Oracle.execute(); //[028]
            
            /**
             * Crea una estructura vacia de retorno de tipo StttmpBetweenResult
             */
            stttmpBetweenResult = new StttmpBetweenResult(); //[030]
            
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
                stttmpBetweenResult.setResultStatus(resultStatus); //[056]
                return stttmpBetweenResult; //[057]
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
                stttmpBetweenResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            
            /**
             * Procesa la lista "outDetalle1" produciendo los "stttmpBetweenResultList"
             */
            list1 = new ArrayList(); //[031]
            uBound1 = Oracle.getNumRows("PIL_INC_EVE_STTTMP_BETWEEN_CUR"); //[032]
            for (rowIdx1 = 0; rowIdx1 < uBound1; rowIdx1++) //[033]
            {
                StttmpBetweenOutDetalle1Result stttmpBetweenOutDetalle1 = new StttmpBetweenOutDetalle1Result(); //[034]
                stttmpBetweenOutDetalle1.setCodIncEve(OracleConversion.fromStringToBigDecimal(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "COD_INC_EVE", rowIdx1))); //[035]
                stttmpBetweenOutDetalle1.setCodStt(OracleConversion.fromStringTolong(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "COD_STT", rowIdx1))); //[035]
                stttmpBetweenOutDetalle1.setPosX(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "POS_X", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setPosY(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "POS_Y", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setPosZ(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "POS_Z", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setIndP(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "IND_P", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setIndI(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "IND_I", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setIndA(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "IND_A", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setUserName(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "username", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setDomain(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "domain", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setChannel(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "channel", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setGls(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "gls", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setLnk(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "lnk", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setTransactTime(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "transactTime", rowIdx1)); //[036]
                stttmpBetweenOutDetalle1.setEntryTime(Oracle.getValue("PIL_INC_EVE_STTTMP_BETWEEN_CUR", "entryTime", rowIdx1)); //[036]
                list1.add(stttmpBetweenOutDetalle1); //[037]
            }
            
            StttmpBetweenOutDetalle1Result[] stttmpBetweenOutDetalle1List = new StttmpBetweenOutDetalle1Result[list1.size()]; //[039]
            stttmpBetweenOutDetalle1List=(StttmpBetweenOutDetalle1Result[]) list1.toArray(stttmpBetweenOutDetalle1List); //[040]
            stttmpBetweenResult.setOutDetalle1List(stttmpBetweenOutDetalle1List); //[041]
            stttmpBetweenResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            stttmpBetweenResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
            //fijar los valores para la paginación automática
            if(uBound1 > 0) //[04021a]
            {
                //
                //Todas las veces, incluida la primera, se obtienen los próximos
                //   límites inferiores, para los fines que se estime convenientes
                //   Puede servir para paginar en ciertos casos
            }
        }
        catch (Exception Ex) //[044]
        {
            throw new PilIncEveException("Error detectado en el método StttmpBetweenCallerOracleBase", Ex); //[046]
        }
        return stttmpBetweenResult; //[047]
    }
}
//{.Checksum("ebaba49a278f17486b6486320454466d").}
