/*
 * Ejercicio04 -
 * Programa que lee un número  y muestras su cifras por separado;
 */
package com.cice.secuencial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args) {
        int numero=0;
        boolean bnumero=false;
         int kmxh=0;
        do {
            System.out.print("Introduce un número: ");
            try {
                numero = sc.nextInt();
                bnumero = true;
            } catch (InputMismatchException ime) {
                System.out.println("Debe introducir un número ");
                sc.next();
            }
        } while (!bnumero);
        String snumero=String.valueOf(numero);
        for (int i=0; i<snumero.length(); i++){
            System.out.println(snumero.charAt(i));
        }
    }
    
}
