/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticiónfor;

import java.util.Scanner;

/**
 *
 * @author roxic
 * Objetivos 
 * 1. Implementar ciclos de repetición FOR
 * 2. Uso de CONSTANTES
 */
public class CicloRepeticiónFOR {

    /**
     * @param args the command line arguments
     * Se quiere contabilizar la cantidad de minutas que se entregan 
     * a los niños y niñas en una fiesta. Con ello sacar el porcentaje de
     * cuantos fueron niñoas y niñas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Variable Control
        */
        
        for (int i = 0 ; i<10 ; i++){
            System.out.printf("Valor: %d\n",i);
        }//Fin de ciclo FOR
        
        System.out.println("");
        System.out.println("2do Ciclo FOR");
        
        for (int i = 2; i<10 ; i +=2){
            System.out.printf("Valor: %d\n",i);
        }//Fin de ciclo FOR
        
        //Declaración de Variables
        Scanner sc = new Scanner (System.in);
        final int TOTAL = 10;
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = 'a';
        double porcentaje = 0;
        
       
        for (int i = 0 ; i < TOTAL ; i++){
            System.out.println("%d) Quien viene x minuta\n");
            System.out.println("V: Varon / M: Mujer");
            System.out.print("Respuesta: ");
            seleccion = sc.next().toUpperCase().charAt(0);
            
            switch (seleccion){
                case 'V':
                    System.out.println("Varon comiendo minuta");
                    numVarones ++;
                    break;
                case 'M':
                    System.out.println("Mujer comiendo minuta");
                    numMujeres ++;
                    break;
                    
                default :
                    System.out.println("Seleccion no valida");
                    break;
                    
            }//Fin de Switch
            
    }//Fin de Ciclo FOR
        
        System.out.println("Porcentaje de Varones");
        porcentaje = (double) numVarones / TOTAL;
        System.out.printf("Porcentaje : %.2f\n",porcentaje);
        
        System.out.println("Porcentaje de Mujeres");
        porcentaje = (double) numMujeres / TOTAL;
        System.out.printf("Porcentaje: %.2f\n",porcentaje);
        
    }//Fin de main
    
}//Fin de Class
