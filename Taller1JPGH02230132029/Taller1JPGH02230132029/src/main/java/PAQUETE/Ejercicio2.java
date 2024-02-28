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
public class Ejercicio2 {
    public static void main (String[] Args){
        
         
    Scanner scanner = new Scanner(System.in);
    
    double base;
    double altura;
    double area;
    double perimetro;

    
    System.out.print("Escribe el valor de la base del rectangulo : ");
      base = scanner.nextDouble();
    System.out.print("Dame el valor de la altura del rectangulo : ");
      altura = scanner.nextDouble();

    area = base * altura;
    perimetro = 2 * (base + altura);

    System.out.println("El área de este rectángulo es " +area);
    System.out.println("El perímetro de este rectángulo es " + perimetro);
        
    }
}
