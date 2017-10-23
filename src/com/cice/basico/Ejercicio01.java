/*
 * Programa una aplicación que realice lo siguiente
 * Declara tres variables, un entero, un decimal y un caracter y asiganes un valor correcto
 * Pinta por consola el valor de cada variable concatenando con el nombre de  cada una
 * Pinta por consola los cálculos del (entero + eldecimal) y (decimal - entero)
 */
package com.cice.basico;

/**
 *
 * @author Alicia
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int entero=23;
       float decimal=1.15f;
       String cadena="Esta es una cadena";
        System.out.println("El valor del entero es: "+ entero);
        System.out.println("El valor del decimal es: "+ decimal);
        System.out.println("La cadena de caracteres es: "+ cadena);
        System.out.println("La suma del entero y el decimal es: "+ (entero+decimal));
        System.out.println("La resta del decimal menos el entero es: "+ (decimal -entero));
    }
    
}
