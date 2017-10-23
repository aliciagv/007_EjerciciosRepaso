/*
 * Ejercicio 02- Crea un programa que realice lo siguiente
 * Delcara dos variables X e Y de timpo entero, 2 variames M y N de tipo decimal. Asignarles un valor.
 * Pinta por consola todas las operaciones matemáticas que se te ocurran entre ellas
 */
package com.cice.basico;

/**
 *
 * @author Alicia
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X= 20;
        int Y=30;
        
        double M=2.34f;
        double N= 34.1F;
        
        System.out.println("La suma de los enteros es: "+ suma(X,Y));
        System.out.println("La resta de los enteros es: "+ resta(X,Y));
        System.out.println("La suma de los decimales es: "+ sumaD(M,N));
        System.out.println("La resta de los decimales es: "+ restaD(M,N));
        
        System.out.println("M *N / (X + (M*Y) = "+  ((M*N) /(X+ (M*Y))));   
        
              
    }
    
    public static int suma (int X, int Y){
        return X+Y;
    }
    public static int resta(int X, int Y){
        return X-Y;
    }
    public static double sumaD(double M, double N) {
        return M+N;
    }
    public static double restaD(double M, double N){
        return M-N;
    }
    
}
