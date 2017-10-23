package com.cice.basico;

/*
 * Ejercicio04- Crea un programa que realice lo siguiente:
 * Declara 4  variealbes de tipo entero y asignarles un vlaor. Inmediatamente después haz
 * las operaciones necesaria para que B tome el valor de C, C el vlaor de A, A tome el valor de D y
 * D tome el vlaor de B
 */

/**
 *
 * @author Alicia
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A= 4;
        int B= 24;
        int C= 3;
        int D=25;
        int BAUX=B;
        
        B=C;
        C=A;
        A=D;
        D=BAUX;
        System.out.println("A es 25 :" + A);
        System.out.println("B es 3: " + B);
        System.out.println("C es 4: "+ C);
        System.out.println("D es 24: "+D);
    }
    
}
