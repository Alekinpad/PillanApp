// Ecu5GL > no modifique este comentario <

/**
 * @(#)SttRangeCallerOracleBase.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 *             para el método "PilAnaTsk.sttRange"
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
public class SttRangeCallerOracleBase //[001]
{
    
    /**
     * Construye un SttRangeCallerOracleBase.
     */
    public SttRangeCallerOracleBase() //[003]
    {
    }
    
    /**
     * Ejecuta el método  "SttRange" implementación "Oracle".
     */
    public SttRangeResult execute(long codSttIni, long codSttFin, long rowsPerPage, long isNextPage)
        throws PilAnaTskException,
               PilAnaTskRollbackException //[005]
    {
        int j; //[006a]
        int rowIdx1; //[006b]
        String stringTmp; //[007b]
        int uBound1; //[007]
        ArrayList list1; //[008]
        
        SttRangeResult sttRangeResult = new SttRangeResult(); //[009]
        
        try //[101]
        {
            OracleConnector Oracle = new OracleConnector(); //[011]
            Oracle.setDataSource("pilDataSource"); //[012]
            Oracle.setServiceName("PIL_ANA_TSK$STT_RANGE"); //[013]
            
            /**
             * Se inicializan los parámetros de entrada del procedimiento almacenado
             */
            Oracle.setParameter("COD_STT_INI", codSttIni); //[023]
            Oracle.setParameter("COD_STT_FIN", codSttFin); //[023]
            Oracle.setParameter("ROWS_PER_PAGE", rowsPerPage); //[023]
            Oracle.setParameter("IS_NEXT_PAGE", isNextPage); //[023]
            
            /**
             * Se preparan los campos esperados en la respuesta
             */
            Oracle.setOutputParameterList("PIL_ANA_TSK_STT_RANGE_CUR"); //[025]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "COD_ANA_TSK", new BigDecimal(0)); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "COD_STT", 0); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "POS_X", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "POS_Y", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "POS_Z", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "IND_P", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "IND_I", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "IND_A", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "username", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "domain", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "channel", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "gls", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "lnk", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "transactTime", new String("")); //[026]
            Oracle.setOutputParameterField("PIL_ANA_TSK_STT_RANGE_CUR", "entryTime", new String("")); //[026]
            Oracle.closeOutputParameterList("PIL_ANA_TSK_STT_RANGE_CUR"); //[027]
            Oracle.setOutputParameter("RESULT_CODE", 0); //[024]
            Oracle.setOutputParameter("RESULT_MSG", new String("")); //[024]
            
            /**
             * Invocar el Servicio
             */
            Oracle.execute(); //[028]
            
            /**
             * Crea una estructura vacia de retorno de tipo SttRangeResult
             */
            sttRangeResult = new SttRangeResult(); //[030]
            
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
                sttRangeResult.setResultStatus(resultStatus); //[056]
                return sttRangeResult; //[057]
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
                sttRangeResult.setResultStatus(resultStatus); //[2056]
            }
            
            /**
             * Extrae los valores del resultado Oracle, y puebla la estructura de retorno
             */
            
            /**
             * Procesa la lista "outDetalle1" produciendo los "sttRangeResultList"
             */
            list1 = new ArrayList(); //[031]
            uBound1 = Oracle.getNumRows("PIL_ANA_TSK_STT_RANGE_CUR"); //[032]
            for (rowIdx1 = 0; rowIdx1 < uBound1; rowIdx1++) //[033]
            {
                SttRangeOutDetalle1Result sttRangeOutDetalle1 = new SttRangeOutDetalle1Result(); //[034]
                sttRangeOutDetalle1.setCodAnaTsk(OracleConversion.fromStringToBigDecimal(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "COD_ANA_TSK", rowIdx1))); //[035]
                sttRangeOutDetalle1.setCodStt(OracleConversion.fromStringTolong(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "COD_STT", rowIdx1))); //[035]
                sttRangeOutDetalle1.setPosX(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "POS_X", rowIdx1)); //[036]
                sttRangeOutDetalle1.setPosY(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "POS_Y", rowIdx1)); //[036]
                sttRangeOutDetalle1.setPosZ(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "POS_Z", rowIdx1)); //[036]
                sttRangeOutDetalle1.setIndP(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "IND_P", rowIdx1)); //[036]
                sttRangeOutDetalle1.setIndI(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "IND_I", rowIdx1)); //[036]
                sttRangeOutDetalle1.setIndA(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "IND_A", rowIdx1)); //[036]
                sttRangeOutDetalle1.setUserName(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "username", rowIdx1)); //[036]
                sttRangeOutDetalle1.setDomain(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "domain", rowIdx1)); //[036]
                sttRangeOutDetalle1.setChannel(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "channel", rowIdx1)); //[036]
                sttRangeOutDetalle1.setGls(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "gls", rowIdx1)); //[036]
                sttRangeOutDetalle1.setLnk(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "lnk", rowIdx1)); //[036]
                sttRangeOutDetalle1.setTransactTime(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "transactTime", rowIdx1)); //[036]
                sttRangeOutDetalle1.setEntryTime(Oracle.getValue("PIL_ANA_TSK_STT_RANGE_CUR", "entryTime", rowIdx1)); //[036]
                list1.add(sttRangeOutDetalle1); //[037]
            }
            
            SttRangeOutDetalle1Result[] sttRangeOutDetalle1List = new SttRangeOutDetalle1Result[list1.size()]; //[039]
            sttRangeOutDetalle1List=(SttRangeOutDetalle1Result[]) list1.toArray(sttRangeOutDetalle1List); //[040]
            sttRangeResult.setOutDetalle1List(sttRangeOutDetalle1List); //[041]
            sttRangeResult.setResultCode(OracleConversion.fromStringTolong(Oracle.getValue("RESULT_CODE"))); //[042]
            sttRangeResult.setResultMsg(Oracle.getValue("RESULT_MSG")); //[043]
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
            throw new PilAnaTskException("Error detectado en el método SttRangeCallerOracleBase", Ex); //[046]
        }
        return sttRangeResult; //[047]
    }
}
//{.Checksum("59af4f3644a08fd3ab826dd36c29c417").}
