/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;

import java.util.Scanner;

/**
 *
 * @author jproj
 */
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner  (System.in);
        
        double numero1;
        double numero2;
        
        System.out.println("Escribe 2 números para obtener resultados de la suma,resta,multiplicacion y"
                + " división de los mismos");
        System.out.println("Digita el valor del primer número");
        numero1 = scanner.nextDouble();
        
        System.out.print("Digita el valor del segundo número");
        numero2 = scanner.nextDouble();
        
        System.out.println("La suma de estos números es " + (numero1 + numero2));
        System.out.println("La resta de estos números es " + (numero1 - numero2));
        System.out.println("La multiplicación de estos números es " + (numero1 * numero2));
        System.out.println("La división de estos números es " + (numero1 / numero2));
                
                
                
        
    }
    
}
