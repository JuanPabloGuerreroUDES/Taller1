
package PAQUETE;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        
        // Solicitar al usuario que ingrese el sueldo base y el monto de las tres ventas
        System.out.print("Ingrese el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();
        
        System.out.print("Ingrese el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();
        
        System.out.print("Ingrese el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();
        
        System.out.print("Ingrese el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();
        
        // Calcular el total de las ventas
        double totalVentas = venta1 + venta2 + venta3;
        
        // Calcular el 10% de comisión sobre las ventas
        double comision = totalVentas * 0.10;
        
        // Calcular el total a recibir en el mes
        double totalMes = sueldoBase + comision;
        
        // Mostrar los resultados
        System.out.println("El dinero por concepto de comisiones es: " + comision);
        System.out.println("El total que recibirá en el mes es: " + totalMes);
        
        scanner.close();
        
    }
    
}
