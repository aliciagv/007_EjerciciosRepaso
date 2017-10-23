/*
 * Ejercicio 03 - 
 * Programa que calcula el área de un triángulo a partir de la longitud de sus lados
 * Cálculo del aria de un triangulo dados su tres lados
 * Raiz cuadrad [p (p-a)(p -b) (p-c)
 * p = (a+ b + c)/2
 *
 */
package com.cice.secuencial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static double a,b,c;
    private final static String ordinal1= "primer";
    private final static String ordinal2= "segundo";
    private final static String ordinal3= "tercer";
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double area;
        double perimetro;
        int opcion=0;
        boolean numero=false;
        do {
            System.out.println("EJERCICIO 03- ÁREA DE UN TRIÁNGULO");
           
           
            
            a=solicitarDatos(ordinal1);
            b=solicitarDatos(ordinal2);
            c=solicitarDatos(ordinal3);
            perimetro=(a+b+c)/2;
            area=Math.sqrt(perimetro*(perimetro-a)*(perimetro-b)*(perimetro-c));
            System.out.println("El perímetro es: " + perimetro +" y el área es: " + area);
            System.out.println("Si quiere salir pulse  0");
            if (sc.next().equalsIgnoreCase("0")){
             opcion=0;
                System.out.println("Adios");
            } else {opcion=1;}
            
        } while (opcion!=0);
       
        
        
        
        }

   
    
    private static double solicitarDatos(String ordinal){
        boolean numero=false;
        double lado=0;
          do {
            System.out.print("Introduce el "+ ordinal + " lado del triángulo");
            try {
            lado=sc.nextDouble();
            numero=true;
            } catch(InputMismatchException ime){
                System.out.println("Debe introducir un número;");
                sc.next();
            }
            } while (!numero);

          return lado;
    } 
    
}
