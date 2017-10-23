/*
 * Ejercicio 05- Crea un programa que realice lo siguiente:
 * Declara una variable de tipo enetro y asignale un valor. A contiuación muestra un mensaje por consola indicando si el valor de 
 * la varialbe es par o impar, positivo o negativo, múltipo de 5, multiplo de 10 y si es mayor o mnor que 100
 */
package com.cice.basico;

/**
 *
 * @author Alicia
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 85;
        System.out.println("El número es: "+ A);
        System.out.println((A % 2 == 0)  ? "El número es par" : "El número es impar");
        System.out.println((A >= 0)  ? "El número es positivo" : "El número es negativo");
        System.out.println((A % 5 == 0) ? "El número es múltipo de 5" : "El número no es múltiplo de 5");
        System.out.println((A % 10 == 0) ? "El número es múltipo de 10" : "El número no es múltiplo de 10");
        System.out.println((A > 100) ? "El número es mayor que 100" : "El número es menor que 100");
    }

}
