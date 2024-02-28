
package PAQUETE;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[]args){
        
     Scanner scanner = new Scanner(System.in);   
     
      // Solicitar al usuario que ingrese las calificaciones parciales, el examen final y el trabajo final
        System.out.println("Ingrese las tres calificaciones parciales:");
        double calificacionParcial1 = scanner.nextDouble();
        double calificacionParcial2 = scanner.nextDouble();
        double calificacionParcial3 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del examen final: ");
        double calificacionExamenFinal = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del trabajo final: ");
        double calificacionTrabajoFinal = scanner.nextDouble();
        
        // Calcular el promedio de las calificaciones parciales
        double promedioCalificacionesParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;
        
        // Calcular la calificación final
        double calificacionFinal = (0.55 * promedioCalificacionesParciales) + (0.30 * calificacionExamenFinal) + (0.15 * calificacionTrabajoFinal);
        
        // Mostrar la calificación final
        System.out.println("La calificación final del alumno en la materia de Algoritmos es: " + calificacionFinal);
        
        scanner.close();
    }
    
}
