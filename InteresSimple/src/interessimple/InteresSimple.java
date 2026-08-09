/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el capital inicial: ");  
        double capital = teclado.nextDouble();
        
        System.out.print("Por favor ingrese la tasa de interes anual (ejemplo 5% para 5%: ");
        int tasa = teclado.nextInt();
        
        System.out.print("Por favor ingrese el tiempo en años: ");
        int tiempo = teclado.nextInt();
        
        double interes = (capital * tasa * tiempo) / 100;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("El interes generado es: " + interes);
    }
    
}
