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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double num=entrada.nextDouble();
        
        double raiz2=Math.pow(num, 2);
        double raiz3=Math.pow(num, 3);
        
        System.out.println("La raiz cuadrada es: "+raiz2);
        System.out.println("La raiz cubica es: "+raiz3);
    }
}
