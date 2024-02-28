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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1=entrada.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double num2=entrada.nextDouble();
        double distancia=0;
        if(num1>num2){
            
            distancia= num1-num2;
        }else{
            distancia= num2-num1;
        }
        System.out.println("La distancia entre ambos numeros es de: "+distancia);
        
        
    }
    
}
