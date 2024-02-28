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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero de dos cifras: ");
        int num=entrada.nextInt();
        
        if(num<10&&num>99){
            System.out.println("El numero debe ser de dos cifras");
            System.exit(0);
        }
        
        int cifra1=num/10;
        int cifra2=num%10;
        
        int invertido= cifra2*10+cifra1;
        
        System.out.println("Su numero invertido es de: "+invertido);
        
    }
    
}
