
package PAQUETE;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[]args){
        
       Scanner scanner=new Scanner(System.in);
       
        // Solicitar al usuario que ingrese el total de la compra
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();
        
        // Calcular el descuento (15% del total de la compra)
        double descuento = totalCompra * 0.15;
        
        // Calcular el total a pagar después del descuento
        double totalPagar = totalCompra - descuento;
        
        // Mostrar el total a pagar después del descuento
        System.out.println("El total a pagar después del descuento del 15% es: " + totalPagar);
        
        scanner.close();
            
    }
    
}
