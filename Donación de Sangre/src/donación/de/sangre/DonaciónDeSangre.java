/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donación.de.sangre;

import java.util.Scanner;

/**
 *
 * @author roxic
 * Desarrollar un algoritmo que permita desarrollar si el usuario puede donar o 
 * no, basandose en su edad (18-65) y peso (Mas de 110 lbs).
 * Si se llega a cumplir los criterios antes expuestos, solo se podra donar 
 * sangre si ha comido.
 * Otro elemento que se tiene que considerar para poder donar sangre es tener el
 * nivel del hierro/hemoglobina en la sangre en los niveles adecuados.
 * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12.
 */
public class DonaciónDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
       
    Scanner entrada = new Scanner(System.in);
    
    int edad = 0;
    int peso = 0;
    char comio = 'a';
    int niveles = 0;
    String genero = 'x';
            
            
    System.out.println("Ingrese edad");
    edad = entrada.nextInt();
    
    System.out.println("Ingrese peso");
    peso = entrada.nextInt();
    
    System.out.println("peso");
    System.out.println("edad");
    
    if (edad>=18 && edad<=65 && peso>=110) {
        
        entrada.nextLine();
        
        System.out.println("Si se puede donar");
        
        System.out.println("Ya comio");
        comio = entrada.nextLine().charAt(0);
        
        if (comio == 'S'|| comio == 's') {
            
        }
        else {
            System.out.println("Necesita comer");
        }
    }
    else 
    {
        System.out.println("No se puede donar");
    }
        
        System.out.println("¿Cuales son sus niveles de hierro?");  
        niveles = entrada.nextInt();
       
        System.out.println("¿Eres hombre o mujer?");
        genero = entrada.nextLine().toUpperCase();
        
        if((niveles >=14 && genero.equals("Hombre"))||(niveles >=12 && genero.equals ("Mujer"))){
            
        System.out.println("Si puede donar sangre");
        }
        else{
            System.out.println("No puede donar sangre");
        }
    }
    
}
