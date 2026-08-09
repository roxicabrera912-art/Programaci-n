/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculovariables;

import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class CalculoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado = new Scanner(System.in);  
      
        System.out.print("Por Favor ingrese la base del rectángulo: ");
        double base = teclado.nextDouble();
        
        System.out.print("Por Favor ingrese la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        
        double área = base * altura;
        double perímetro = 2 * (base + altura);
        
        System.out.println("\n--- Resultados ---");
        System.out.println("El área del rectángulo es: " + área);
        System.out.println("El perímetro del rectángulo es: " + perímetro);
        
        
        
        
    }
    
}
