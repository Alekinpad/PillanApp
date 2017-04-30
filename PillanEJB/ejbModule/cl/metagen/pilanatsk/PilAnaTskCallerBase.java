// Ecu5GL > no modifique este comentario <

/**
 * @(#)PilAnaTskCallerBase.java  Sabado 29 de Abril de 2017 - 14:28:25
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
 * Implementa partes compartidas del llamado a los métodos del servicio "PilAnaTsk"
 * 
 * @author           Ecu5GL.GenCode 3.20C18H (buildCallerBase V 1.0.1)
 * @version          1.0.1
 */

/**
 * Implementa los métodos comunes para todos los caller
 */
abstract class PilAnaTskCallerBase
{
    
    /**
     * aqui van los metodos comunes para los caller.
     */
        
        /**
         * Métodos comunes para los caller.
         */
        
        /**
         * Traza editada del stack.
         */
        protected static String stackTrace(Exception Ex, int j)
        {
             return Ex.getStackTrace()[j].toString().replaceFirst("\\(", "\n(") + "\n";
        }
}
//{.Checksum("aa3da5e927f82b62e89048d355fb76b7").}
