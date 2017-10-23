/*
 * Ejercicio01 -
 * Programa que lea una cantida de grados centígrados y la pase a grados fahrenheit
 * La fórmula correspondiente es F= 32 + (9* C /5);
 */
package com.cice.secuencial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio01 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce los grados centígrados: ");
        boolean numero = false;
        double grados=0;
        do {
            try {
                grados = sc.nextDouble();
                numero = true;
            } catch (InputMismatchException ime) {
                System.out.println("Debe introducir un número ");
                sc.next();
            }
        } while (!numero);
        System.out.println("Los grados Fahrenheit de :" + grados + " son: " + (32 + (9*grados /5)));
    }

}
