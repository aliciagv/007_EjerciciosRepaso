/*
 * Ejercicio 05 -
 * Programa que pida por teclado la fecha de nacimiento de una persona y 
 * calcule su número de la suerte
 * Ejemplo: 12/07/1980 -> 12 + 7 + 1980 = 1999 -> 1 + 9 + 9 + 9 =28 
 */
package com.cice.secuencial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Alicia
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce la fecha de nacimiento en este formato: dd/M/yyyy");
        String sDate= sc.next();
        Date fecha=null;       
        try {
            fecha = sdf.parse(sDate);
            String[] sarray= sDate.split("/");
            int suma=0;
            for (String s:sarray){
                suma += Integer.parseInt(s);
            }
            System.out.println("La suma es: "+ suma );
            
        } catch (ParseException ex) {
            System.out.println("El formato de la fecha es incorrecto");
        }
        
    }
    
}