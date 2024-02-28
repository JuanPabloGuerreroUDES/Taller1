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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
    double altura;
    double hipotenusa;

    
    System.out.print("Ingresa el valor de la base del rectángulo: ");
      base = scanner.nextDouble();
    System.out.print("Ingresa el valor de la altura del rectángulo: ");
      altura = scanner.nextDouble();

      hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

    System.out.println("El área de este rectángulo es " +hipotenusa);
        
    }
    
}
