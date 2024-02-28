
package PAQUETE;

import java.util.Scanner;

public class Ejercicio7 {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      System.out.print("Introduce la cantidad de minutos: ");
        int minutos = scanner.nextInt();
        
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        
        System.out.println("Equivalente a " + horas + " horas y " + minutosRestantes + " minutos.");
        
        scanner.close();  
    }}
