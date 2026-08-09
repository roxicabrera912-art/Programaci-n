/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelibreriamath;

import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class UsodelibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el radio del circulo: ");
        double radio = teclado.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("El area del circulo es: " + area);
        System.out.println("La circunferencia del circulo es:" + circunferencia);
    }
    
}
