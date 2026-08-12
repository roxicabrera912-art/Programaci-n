/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobación;

import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class SistemadeAprobación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
       
        //Declaramos las variables 
       String nombre = "";
       double parcial1 = 0;
       double parcial2 = 0;
       double promedio = 0; 
       
        System.out.print("Por Favor ingrese el nombre del estudiante: ");
        nombre = scanner.nextLine();
        
        System.out.print("A continuación ingrese la calificación del primer parcial: ");
        parcial1 = scanner.nextDouble();
        
        System.out.print("Ahora ingrese la calificación del segundo parcial: ");
        parcial2 = scanner.nextDouble();
        
        promedio = (parcial1 + parcial2) / 2.0; //Calculo del promedio
        
        System.out.println("--- RESULTADOS ---");
        System.out.println("Estuadiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= 65.0){
            System.out.println("Estado: Aprobado");
            
        }
        else {
            System.out.println("Estado: Reprobado");
        }
    }//Fin de main
    
}
