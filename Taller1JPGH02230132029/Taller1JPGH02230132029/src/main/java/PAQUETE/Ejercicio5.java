
package PAQUETE;


import java.util.Scanner; 

public class Ejercicio5 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println("La temperatura en Celsius es: " + celsius + " °C");
        
        scanner.close();
    }
}
    
    

