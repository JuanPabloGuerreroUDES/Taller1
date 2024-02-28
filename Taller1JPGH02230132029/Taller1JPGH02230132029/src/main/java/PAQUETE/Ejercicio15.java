/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese el valor de A: ");
        double A=entrada.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        double B=entrada.nextDouble();
        
        System.out.println("El valor original de A es: "+A);
        System.out.println("El valor original de B es: "+B);
        
        double aux=A;
        A=B;
        B=aux;
        
        System.out.println("El nuevo valor de A es: "+A);
        System.out.println("El nuevo valor de B es: "+B);
    }
    
}
