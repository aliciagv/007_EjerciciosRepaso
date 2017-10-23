/*
 * Ejercicio 02 -
 * Programa que pase una velocidad en km/h a m/s. La velocidad se lee por teclado
 */
package com.cice.secuencial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
      System.out.print("Introduce los km/h: ");
        boolean numero = false;
        int kmxh=0;
        do {
            try {
                kmxh = sc.nextInt();
                numero = true;
            } catch (InputMismatchException ime) {
                System.out.println("Debe introducir un número ");
                sc.next();
            }
        } while (!numero);
        
        System.out.println(" km/h: :" + kmxh + " son: " + ((kmxh*1000)/3600) +"m/s");
    }
    
}
