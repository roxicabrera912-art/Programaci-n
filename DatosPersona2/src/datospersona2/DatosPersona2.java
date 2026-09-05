/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datospersona2;

import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class DatosPersona2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
                
        //Declarar arreglo 
        String [] nombres;
        
        //Crear arreglo 
        nombres = new String[5];
        
        //Declarar y crear el arreglo
        char [] generos = new char [5];
        
        //Declarar e Inicializar
        int [] edades = new int []{10,20,30,40,50};
        
        double[] pesos = new double [5];
        double [] estaturas = new double [5];
        
        for (int i = 0; i < 5; i++){
            System.out.print("Ingresa Nombre: ");
            nombres[i] = scanner.nextLine();
            
            System.out.print("Ingresa Genero (M/F): ");
            generos [i] = scanner.next().charAt(0);
            
            System.out.print("Ingresa Edad: ");
            edades [i] = scanner.nextInt();
            
            System.out.print("Ingresa Peso: ");
            pesos [i] = scanner.nextDouble();
            
            System.out.println("Ingresa Estatura: ");
            estaturas [i] = scanner.nextDouble();
            
            scanner.nextLine();
            System.out.println("----------------------");
        }//Fin de ciclo FOR
       
        for (int i = 0; i < 5; i++){
            System.out.printf("Nombre: %s\n",nombres[i]);
            System.out.printf("Edad: %d\t Genero: %c\n",edades[i],generos[i]);
            System.out.printf("Peso: %.2f\t, Estatura: %.2f\n",pesos[i],estaturas[i]);
            System.out.println("-----------------------------------");
        }//Fin de Ciclo For
    }//Fin de main
    
}//Fin de Class
