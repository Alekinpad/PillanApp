// Ecu5GL > no modifique este comentario <

/**
 * @(#)OracleConversion.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Rutinas de conversión común para el acceso "Oracle"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildOracleConversion V 2.0.3)
 * @version          2.0.3
 * 
 * Esqueleto utilizado "genericConversion.skl"
 * 
 */
import java.math.BigDecimal;
import java.util.Date;
import java.util.Calendar;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Rutinas de conversión para la implementación "Oracle"
 */
class OracleConversion
{
    
    /**
     * Tabla de caracteres de signo
     */
    public static final String cobolSignTable     = "}ABCDEFGHI";
    public static final String cobolSignTableName = "Signos Cobol ANSI";
    
    /**
     * Utilitario para generar una repetición de caracteres
     */
    static String repeat(String c, int n) //[1]
    {
       if (n <= 0) return ""; //[2]
       StringBuffer s = new StringBuffer(n); //[3]
       for (int i = 0; i < n; i++) s.append(c); //[4]
       return s.toString(); //[5]
    }
    
    /**
     * Utilitario para generar un número negativo para el COBOL AIX
     */
    static void negate(StringBuffer v) //[6]
                throws Exception
    {
      int    pos  = v.length() - 1; //[7]
      if(pos < 0) //[8]
      {
         return; //[9]
      }
      String digit = v.substring(pos); //[10]
    
      //Signos Cobol ANSI
    
      if(digit.compareTo("0") == 0) {v.replace(pos, pos + 1, "}"); return;} //[11]
      if(digit.compareTo("1") == 0) {v.replace(pos, pos + 1, "A"); return;} //[11]
      if(digit.compareTo("2") == 0) {v.replace(pos, pos + 1, "B"); return;} //[11]
      if(digit.compareTo("3") == 0) {v.replace(pos, pos + 1, "C"); return;} //[11]
      if(digit.compareTo("4") == 0) {v.replace(pos, pos + 1, "D"); return;} //[11]
      if(digit.compareTo("5") == 0) {v.replace(pos, pos + 1, "E"); return;} //[11]
      if(digit.compareTo("6") == 0) {v.replace(pos, pos + 1, "F"); return;} //[11]
      if(digit.compareTo("7") == 0) {v.replace(pos, pos + 1, "G"); return;} //[11]
      if(digit.compareTo("8") == 0) {v.replace(pos, pos + 1, "H"); return;} //[11]
      if(digit.compareTo("9") == 0) {v.replace(pos, pos + 1, "I"); return;} //[11]
    
      throw new Exception("el dígito \"" + digit + "\" es inválido"); //[90]
    }
    
    /**
     * Utilitario para finalizar el procesamiento de un número
     */
    static String postProcessSIGNED(StringBuffer convertedValue, int width, boolean isNegative) //[91]
                  throws Exception
    {
      String returnedValue; //[92]
      if (isNegative) //[93]
      {
          negate(convertedValue); //[94]
      }
      returnedValue = convertedValue.toString(); //[95]
      if(returnedValue.length() == width) //[96]
      {
         return returnedValue; //[97]
      }
      throw new Exception("el valor " + returnedValue + " debe tener \"" + width + "\" caracteres"); //[98]
    }
    
    /**
     * Utilitario para obtener verificar si un carácter de signo es válido
     */
    static void testSign(String digit) //[21]
                throws Exception
    {
    
      //Signos Cobol ANSI
    
      if(digit.compareTo("}") == 0) return; //[22]
      if(digit.compareTo("A") == 0) return; //[22]
      if(digit.compareTo("B") == 0) return; //[22]
      if(digit.compareTo("C") == 0) return; //[22]
      if(digit.compareTo("D") == 0) return; //[22]
      if(digit.compareTo("E") == 0) return; //[22]
      if(digit.compareTo("F") == 0) return; //[22]
      if(digit.compareTo("G") == 0) return; //[22]
      if(digit.compareTo("H") == 0) return; //[22]
      if(digit.compareTo("I") == 0) return; //[22]
    
      if(digit.compareTo("0") == 0) return; //[32]
      if(digit.compareTo("1") == 0) return; //[33]
      if(digit.compareTo("2") == 0) return; //[34]
      if(digit.compareTo("3") == 0) return; //[35]
      if(digit.compareTo("4") == 0) return; //[36]
      if(digit.compareTo("5") == 0) return; //[37]
      if(digit.compareTo("6") == 0) return; //[37]
      if(digit.compareTo("7") == 0) return; //[39]
      if(digit.compareTo("8") == 0) return; //[40]
      if(digit.compareTo("9") == 0) return; //[41]
    
      throw new Exception("el carácter de signo \"" + digit + "\" es inválido"); //[52]
    }
    
    /**
     * Utilitario para convertir un número con signo implícito en otro con signo "leading"
     */
    static void fixSign(StringBuffer v, int width) //[53]
                throws Exception
    {
      if(width != v.length()) //[54]
      {
         throw new Exception("el valor debe ser de longitud \"" + width + "\""); //[55]
      }
      int    pos  = v.length() - 1; //[56]
      boolean isNegative = false; //[57]
      if(pos < 0) //[58]
      {
         return; //[59]
      }
      String digit = v.substring(pos); //[60]
    
      //Signos Cobol ANSI
    
      if(digit.compareTo("}") == 0) {v.replace(pos, pos + 1, "0"); isNegative = true;} //[61]
      if(digit.compareTo("A") == 0) {v.replace(pos, pos + 1, "1"); isNegative = true;} //[61]
      if(digit.compareTo("B") == 0) {v.replace(pos, pos + 1, "2"); isNegative = true;} //[61]
      if(digit.compareTo("C") == 0) {v.replace(pos, pos + 1, "3"); isNegative = true;} //[61]
      if(digit.compareTo("D") == 0) {v.replace(pos, pos + 1, "4"); isNegative = true;} //[61]
      if(digit.compareTo("E") == 0) {v.replace(pos, pos + 1, "5"); isNegative = true;} //[61]
      if(digit.compareTo("F") == 0) {v.replace(pos, pos + 1, "6"); isNegative = true;} //[61]
      if(digit.compareTo("G") == 0) {v.replace(pos, pos + 1, "7"); isNegative = true;} //[61]
      if(digit.compareTo("H") == 0) {v.replace(pos, pos + 1, "8"); isNegative = true;} //[61]
      if(digit.compareTo("I") == 0) {v.replace(pos, pos + 1, "9"); isNegative = true;} //[61]
    
      if(isNegative) //[81]
      {
          v.insert(0, "-"); //[82]
      }
      testSign(digit); //[83]
      return; //[84]
    }
    
    /**
     * Utilitario para generar una potencia de 10 (10**n)
     */
    static int powerOf10(int n) //[85]
    {
       if (n < 1) return 1; //[86]
       int p = 10; //[87]
       for (int i = 1; i < n; i++) p *= 10; //[88]
       return p; //[89]
    }
    
    /**
     * Rutinas de conversión de tipo String a tipo Java
     */
    
    /**
     * Convierte String a Date usando el formato  "yyyyMMdd"
     *
     * @param strDate   fecha en formato externo (Ej: "19000101")
     *
     */
    static Date fromStringToDate(String strDate)
                throws IllegalArgumentException, NullPointerException, ParseException, Exception
    {
        return fromStringToDate("F", 8, 0, "yyyyMMdd", strDate);
    }
    
    /**
     * Convierte String a Date usando un formato como parámetro
     *
     * @param strFmt    formato externo (Ej: "yyyyMMdd")
     * @param strDate   fecha en formato externo (Ej: "20070926")
     *
     */
    static Date fromStringToDate(String cobolType, int width, int scale, String strFormat, String _strDate)
                throws IllegalArgumentException, NullPointerException, ParseException, Exception
    {
        try
        {
           if (_strDate == null)
           {
               throw new Exception("Fecha nula");
           }
           String strDate = _strDate.trim();
           if (strDate.length() == 0)
           {
               throw new Exception("Fecha nula");
           }
           if (strDate.length() > 8)
           {
               strDate = strDate.substring(0,8);
           }
           SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
           Date date = sdf.parse(strDate);
           return  date;
        }
        catch (IllegalArgumentException Ex){
           throw new IllegalArgumentException("Formato de fecha inválido [" + strFormat + "]");
        }
        catch (Exception Ex)
        {
           Calendar myCalendar = Calendar.getInstance();
           myCalendar.set(10, 01 - 1, 01);
           return myCalendar.getTime();
        }
    }
    
    /**
     * Convierte String [-]9999999 a BigDecimal
     *
     * @param strDecimal   número en formato externo
     *
     */
    static BigDecimal fromStringToBigDecimal(String strDecimal)
    {
        try
        {
            String stub[] = strDecimal.split(",");
            StringBuffer buf = null;
            if(stub.length == 1) return new BigDecimal(stub[0]);
            buf = new StringBuffer();
            for(int i = 0; i < stub.length;i++){
               buf.append(stub[i]);
            }
            return new BigDecimal(buf.toString());
        }
        catch (Exception Ex)
        {
            return new BigDecimal(0);
        }
    }
    
    /**
     * Convierte String [-]9999999 a long
     *
     * @param strLong   número en formato externo
     *
     */
    static long fromStringTolong(String strLong)
    {
        try
        {
           return Long.parseLong(strLong);
        }
        catch (Exception Ex)
        {
            return 0;
        }
    }
    
    /**
     * Convierte String [-]9999999 a Long
     *
     * @param strLong   número en formato externo
     *
     */
    static Long fromStringToLong(String strLong)
    {
        if(strLong == null)
        {
           return null;
        }
        try
        {
           return new Long(Long.parseLong(strLong));
        }
        catch (Exception Ex)
        {
            return new Long(0);
        }
    }
    
    /**
     * Rutinas de conversión de tipo Java a String
     */
    
    /**
     * Convierte Date a Fecha con formato fijo "yyyyMMdd"
     *
     * @param date     fecha a convertir a String
     *
     */
    static String fromDateToString(Date date)
    {
        try
        {
            SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.format(date);
        }
        catch (Exception Ex)
        {
            return "19000101";
        }
    }
    
    /**
     * Convierte Date a String con formato "yyyyMMdd"
     *
     * @param cobolType    tipo interno o picture Cobol
     * @param width        número de caracteres a entregar
     * @param scale    no se utiliza
     * @param date         fecha a convertir a String
     *
     */
    static String fromDateToString(String cobolType, int width, int scale, Date date)
    {
        try
        {
            SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.format(date);
        }
        catch (Exception Ex)
        {
            return "19000101";
        }
    }
    
    /**
     * Convierte Date a String con formato dado
     *
     * @param cobolType    tipo interno o picture Cobol
     * @param width        número de caracteres a entregar
     * @param scale    no se utiliza
     * @param format       el formato Java de fecha
     * @param date         fecha a convertir a String
     *
     */
    static String fromDateToString(String cobolType, int width, int scale, String format, Date date)
    {
        try
        {
            SimpleDateFormat  simpleDateFormat = new SimpleDateFormat(format);
            return simpleDateFormat.format(date);
        }
        catch (Exception Ex)
        {
            return "19000101";
        }
    }
    
    /**
     * Convierte BigDecimal a String [-]9999999
     *
     * @param bigDecimal   número a convertir a String
     *
     */
    static String fromBigDecimalToString(BigDecimal bigDecimal)
    {
        try
        {
           return bigDecimal.toString();
        }
        catch (Exception Ex)
        {
            return "0";
        }
    }
    
    /**
     * Convierte Long [-]9999999 a String
     *
     * @param number   valor Long a convertir
     *
     */
    static String fromLongToString(Long number)
    {
        if(number == null)
        {
           return null;
        }
        try
        {
           return number.toString();
        }
        catch (Exception Ex)
        {
            return "0";
        }
    }
    
    /**
     * Convierte long [-]9999999 a String
     *
     * @param number valor long a convertir
     *
     */
    static String fromlongToString(long number)
    {
        try
        {
           String converted = number + ""; // para forzar la conversión
           return converted;
        }
        catch (Exception Ex)
        {
            return "0";
        }
    }
    
    /**
     * Convierte BigDecimal a int
     *
     * @param number valor BigDecimal a convertir
     *
     */
    static int fromBigDecimalToint(BigDecimal number)
    {
        try
        {
           return number.intValue();
        }
        catch (Exception Ex)
        {
            return 0;
        }
    }
    
    /**
     * Convierte BigDecimal a long
     *
     * @param number valor BigDecimal a convertir
     *
     */
    static long fromBigDecimalTolong(BigDecimal number)
    {
        try
        {
           return number.longValue();
        }
        catch (Exception Ex)
        {
            return 0;
        }
    }
    
    /**
     * Convierte long a int
     *
     * @param number     valor a convertir
     *
     */
    static int fromLongToInt(long number)
    {
        try
        {
           return (int)number;
        }
        catch (Exception Ex)
        {
            return 0;
        }
    }
    
    /**
     * Convierte long a long, esta función existe por simetría.
     * Se trata de una función refleja
     *
     * @param number     valor a convertir
     *
     */
    static long fromlongTolong(long number)
    {
       return number;
    }
    
    /**
     * Convierte Long a Long, esta función existe por simetría.
     * Se trata de una función refleja
     *
     * @param number en valor a convertir
     *
     */
    static Long fromLongToLong(Long number)
    {
       return number;
    }
    
    /**
     * Convierte Long a long
     *
     * @param number en formato long
     *
     */
    static long fromLongTolong(Long number)
    {
        try
        {
           return number.longValue();
        }
        catch (Exception Ex)
        {
            return 0;
        }
    }
    
    /**
     * Funciones de conversión para datos COBOL
     * 
     *   conversiones "from" -tipo de origen- "to" -tipo de destino-
     * 
     *  Tipos involucrados:
     * 
     *  tipos Java 
     * 
     *       BigDecimal
     *       Date
     *       long
     *       Long
     *       String
     * 
     *  tipos pesudo COBOL
     *       SIGNED: todos los tipos numéricos con o sin signo, con cualquier scale
     *       TEXT:   todos los tipos no numéricos
     * 
     */
    
    /**
     * Convierte String a SIGNED
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromStringToSIGNED(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                      throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      boolean isNegative = false;
      BigDecimal absoluteValue;
      StringBuffer convertedValue;
      try
      {
          if(data == null || data.trim().length() == 0)
          {
              absoluteValue = new BigDecimal(0);
          }
          else
          {
              absoluteValue = new BigDecimal(data);
          }
          if (absoluteValue.signum() < 0)
          {
              isNegative = true;
              absoluteValue = absoluteValue.abs();
          }
          if (strFormat.length() > 0)
          {
              format = strFormat;
          }
          else
          {
              format = repeat("0", width);
          }
          df.applyPattern(format);
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(df.format(absoluteValue));
          return  postProcessSIGNED(convertedValue, width, isNegative);
      }
      catch(Exception Ex)
      {
          throw new Exception("fromStringToSIGNED: error al convertir número."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + format + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte Long a SIGNED
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromLongToSIGNED(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, Long data)
                      throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      boolean isNegative = false;
      long absoluteValue;
      StringBuffer convertedValue;
      try
      {
          if (data==null)
          {
              absoluteValue = 0;
          }
          else
          {
              absoluteValue = data.longValue();
          }
          if (absoluteValue < 0)
          {
              isNegative = true;
              absoluteValue = -absoluteValue;
          }
          if (strFormat.length() > 0)
          {
              format = strFormat;
          }
          else
          {
              format = repeat("0", width);
          }
          df.applyPattern(format);
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(df.format(absoluteValue));
          return  postProcessSIGNED(convertedValue, width, isNegative);
      }
      catch(Exception Ex)
      {
          throw new Exception("fromLongToSIGNED: error al convertir número."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + format + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte long a SIGNED
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromlongToSIGNED(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, long data)
                      throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      boolean isNegative = false;
      long absoluteValue;
      StringBuffer convertedValue;
      try
      {
          absoluteValue = data;
          if (absoluteValue < 0)
          {
              isNegative = true;
              absoluteValue = -absoluteValue;
          }
          if (strFormat.length() > 0)
          {
              format = strFormat;
          }
          else
          {
              format = repeat("0", width);
          }
          df.applyPattern(format);
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(df.format(absoluteValue));
          return  postProcessSIGNED(convertedValue, width, isNegative);
      }
      catch(Exception Ex)
      {
          throw new Exception("fromlongToSIGNED: error al convertir número."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + format + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte BigDecimal a SIGNED
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromBigDecimalToSIGNED(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, BigDecimal data)
                      throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      boolean isNegative = false;
      BigDecimal absoluteValue;
      StringBuffer convertedValue;
      try
      {
          if(data == null)
          {
              absoluteValue = new BigDecimal(0);
          }
          else
          {
              absoluteValue = data;
          }
          if (absoluteValue.signum() < 0)
          {
              isNegative = true;
              absoluteValue = absoluteValue.abs();
          }
          if (strFormat.length() > 0)
          {
              format = strFormat;
          }
          else
          {
              format = repeat("0", width);
          }
          df.applyPattern(format);
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(df.format(absoluteValue));
          return  postProcessSIGNED(convertedValue, width, isNegative);
      }
      catch(Exception Ex)
      {
          throw new Exception("fromBigDecimalToSIGNED: error al convertir número."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + format + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte SIGNED a String
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static String fromSIGNEDtoString(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      StringBuffer convertedValue;
      try
      {
          format = strFormat;
          if (strFormat.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(data);
          fixSign(convertedValue, width);
          return  df.parse(convertedValue.toString()).toString();
      }
      catch(Exception Ex)
      {
          throw new Exception("fromSIGNEDtoString: error al convertir a texto."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte SIGNED a Long
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static Long fromSIGNEDtoLong(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      StringBuffer convertedValue;
      try
      {
          format = strFormat;
          if (strFormat.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(data);
          fixSign(convertedValue, width);
          return  new Long(df.parse(convertedValue.toString()).longValue());
      }
      catch(Exception Ex)
      {
          throw new Exception("fromSIGNEDtoLong: error al convertir a número."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                      + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte SIGNED a long
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static long fromSIGNEDtolong(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      StringBuffer convertedValue;
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(data);
          fixSign(convertedValue, width);
          return  df.parse(convertedValue.toString()).longValue();
      }
      catch(Exception Ex)
      {
          throw new Exception("fromSIGNEDtolong: error al convertir a número."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte SIGNED a BigDecimal
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static BigDecimal fromSIGNEDtoBigDecimal(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      StringBuffer convertedValue;
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          convertedValue = new StringBuffer(data);
          fixSign(convertedValue, width);
          return  new BigDecimal(df.parse(convertedValue.toString()).toString());
      }
      catch(Exception Ex)
      {
          throw new Exception("fromSIGNEDtoBigDecimal: error al convertir a número."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte SIGNED a Date
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale   no se utiliza en fechas, debe ser cero
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static Date fromSIGNEDtoDate(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                      throws Exception
    {
      String format = "";
      SimpleDateFormat sdf;
      try
      {
          if ((data == null) || (data.trim().length() == 0))
          {
             data = "00010101";
          }
          if (strFormat.length() == 0)
          {
              sdf = new SimpleDateFormat("yyyyMMdd");
          }
          else
          {
              sdf = new SimpleDateFormat(strFormat);
          }
         Date date = sdf.parse(data);
         return  date;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromSIGNEDtoDate: error al convertir a fecha."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte long a TEXT
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromlongToTEXT(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, long data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          String converted = df.format(data);
          if(converted.length() > width)
          {
              throw new Exception("el valor convertido no cabe en el largo \"" + width + "\"");
          }
          return converted;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromlongToTEXT: error al convertir a texto."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte Long a TEXT
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromLongToTEXT(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, Long data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      if (data == null)
      {
          return "";
      }
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          String converted = df.format(data);
          if(converted.length() > width)
          {
              throw new Exception("el valor convertido no cabe en el largo \"" + width + "\"");
          }
          return converted;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromLongToTEXT: error al convertir a texto."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte TEXT a Long
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static Long fromTEXTtoLong(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      if (data == null || data.length() == 0)
      {
          return null;
      }
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          return  new Long(df.parse(data).longValue());
      }
      catch(Exception Ex)
      {
          throw new Exception("fromTEXTtoLong: error al convertir a número."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte String a String, pero generando la salida como si fuese un cobolType, editado
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static String fromStringToString(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                throws Exception
    {
      if (data == null || data.length() == 0)
      {
          return null;
      }
      if (cobolType != "9")
      {
          return data;
      }
      long longData = fromStringTolong(data);
      String stringResult = fromlongToTEXT(varName, varLabel, cobolType, width, scale, strFormat, longData);
      return stringResult;
    }
    
    /**
     * Convierte TEXT a long
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static long fromTEXTtolong(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      if (data.trim().length() == 0)
      {
          return 0;
      }
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          return  df.parse(data).longValue();
      }
      catch(Exception Ex)
      {
          throw new Exception("fromTEXTtolong: error al convertir a número."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte BigDecimal a TEXT
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromBigDecimalToTEXT(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, BigDecimal data)
                  throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      if (data == null)
      {
          return "";
      }
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          df.setMultiplier(powerOf10(scale));
          String converted = df.format(data);
          if(converted.length() > width)
          {
              throw new Exception("el valor convertido no cabe en el largo \"" + width + "\"");
          }
          return converted;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromBigDecimalToTEXT: error al convertir a texto."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte TEXT a BigDecimal
     *
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale       cantidad de decimales implícitos
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     *
     */
    static BigDecimal fromTEXTtoBigDecimal(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                      throws Exception
    {
      String format = "";
      DecimalFormat df = new DecimalFormat();
      if (data.trim().length() == 0)
      {
          return new BigDecimal(0);
      }
      try
      {
          format = strFormat;
          if (format.length() > 0)
          {
              df.applyPattern(format);
          }
          if (scale == 0)
          {
              return  new BigDecimal(df.parse(data).longValue());
          }
          df.setMultiplier(powerOf10(scale));
          return  new BigDecimal(df.parse(data).toString());
      }
      catch(Exception Ex)
      {
          throw new Exception("fromTEXTtoBigDecimal: error al convertir a número."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "," + scale + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte TEXT a Date
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale   no se utiliza en fechas, debe ser cero
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     * @param nullString    el valor que representa la fecha nula
     *
     */
    static Date fromTEXTtoDate(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data, String nullString)
                      throws Exception
    {
      SimpleDateFormat sdf;
      String format;
      try
      {
          if ((data == null) || (data.trim().length() == 0))
          {
              return null;
          }
          if(nullString.compareTo(data) == 0)
          {
              return null;
          }
          format = strFormat;
          if (format.length() == 0)
          {
              format = "yyyyMMdd";
          }
          //se genera la fecha nula para el mapping de entrada
          String nullDateString = new String(format);
          nullDateString = nullDateString.replaceFirst("dd", "01");
          nullDateString = nullDateString.replaceFirst("MM", "01");
          nullDateString = nullDateString.replaceFirst("yyyy", "1901");
          if(nullDateString.compareTo(data) == 0)
          {
            return null;
          }
          sdf = new SimpleDateFormat(format);
          Date date = sdf.parse(data);
          return  date;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromTEXTtoDate: error al convertir a fecha."
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de origen = " + cobolType + "(" + width + "), Formato = \"" + strFormat + "\""
                    + "\nVariable de destino: " + varName + " -- \"" + varLabel + "\". "
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte TEXT a Date
     *
     * @param varName     nombre de la variable de destino
     * @param varLabel    descripción de la variable de destino
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale   no se utiliza en fechas, debe ser cero
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static Date fromTEXTtoDate(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, String data)
                      throws Exception
    {
       return fromTEXTtoDate(varName, varLabel, cobolType, width, scale, strFormat, data, "");
    }
    
    /**
     * Convierte Date a TEXT
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale   no se utiliza en fechas, debe ser cero
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     * @param nullString  el valor que representa la fecha nula
     *
     */
    static String fromDateToTEXT(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, Date data, String nullString)
                      throws Exception
    {
      SimpleDateFormat sdf;
      String format;
      try
      {
          format = strFormat;
          format = strFormat;
          if (format.length() == 0)
          {
              format = "yyyyMMdd";
          }
          if(data == null)
          {
              if(nullString.trim().length() != 0)
              {
                  return new String(nullString);
              }
              //se genera la fecha nula para el mapping de salida
              String nullDateString = new String(format);
              nullDateString = nullDateString.replaceFirst("dd", "01");
              nullDateString = nullDateString.replaceFirst("MM", "01");
              nullDateString = nullDateString.replaceFirst("yyyy", "1901");
              return nullDateString;
          }
          sdf = new SimpleDateFormat(format);
          String converted = sdf.format(data);
          if(converted.length() > width)
          {
              throw new Exception("el valor convertido no cabe en el largo \"" + width + "\"");
          }
          return converted;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromDateToTEXT: error al convertir a texto."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "), Formato = \"" + strFormat + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
    
    /**
     * Convierte Date a TEXT
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale   no se utiliza en fechas, debe ser cero
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromDateToTEXT(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, Date data)
                      throws Exception
    {
      return fromDateToTEXT(varName, varLabel, cobolType, width, scale, strFormat, data, "");
    }
    
    /**
     * Convierte Date a SIGNED
     *
     * @param varName     nombre de la variable a convertir
     * @param varLabel    descripción de la variable a convertir
     * @param cobolType   tipo interno o picture Cobol
     * @param width       ancho en caracteres
     * @param scale   no se utiliza en fechas, debe ser cero
     * @param strFormat   plantilla de edición (formato Java)
     * @param data        el valor a convertir
     *
     */
    static String fromDateToSIGNED(String varName, String varLabel, String cobolType, int width, int scale, String strFormat, Date data)
                      throws Exception
    {
      SimpleDateFormat sdf;
      String   format;
      try
      {
          if (strFormat.length() == 0)
          {
              sdf = new SimpleDateFormat("yyyyMMdd");
          }
          else
          {
              sdf = new SimpleDateFormat(strFormat);
          }
    
          String converted = sdf.format(data);
          if(converted.length() != width)
          {
              throw new Exception("el valor convertido no corresponde al largo \"" + width + "\"");
          }
          return converted;
      }
      catch(Exception Ex)
      {
          throw new Exception("fromDateToTEXT: error al convertir a texto."
                    + "\nVariable de origen " + varName + " -- \"" + varLabel + "\". "
                    + "\nValor a convertir \"" + data + "\"."
                    + "\nTipo de destino = " + cobolType + "(" + width + "), Formato = \"" + strFormat + "\""
                    + "\nMotivo: " + Ex.getMessage());
      }
    }
}
//{.Checksum("ef94f696e72a2ce18b3a36497f39ffc9").}
