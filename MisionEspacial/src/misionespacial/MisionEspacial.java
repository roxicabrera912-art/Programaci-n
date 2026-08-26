/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misionespacial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class MisionEspacial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String piloto;
        boolean enVuelo = true;
        double combustible = Math.sqrt(10000) * 5;
        int opcion = 0;
        int distancia = 0;

        
        System.out.println("Ingrese el nombre del piloto:");
        piloto = sc.next();

        System.out.println("Iniciando secuencia de despegue...");
        for (int i = 1; i < 3; i++) {
            System.out.println(i);
        }//Fin de For

        
        do {
            System.out.println("Seleccione destino:");
            System.out.println("1. Marte\n2. Júpiter\n3. Saturno");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    distancia = 500;
                case 2:
                    distancia = 1200;
                case 3:
                    distancia = 2000;
                    break;
                default:
                    System.out.println("Opción inválida");
            }//Fin de Switch
        } while (opcion < 1 || opcion > 3);

        

        while (distancia > 0 && combustible > 0) {
            System.out.println("Distancia restante: " + distancia + " | Combustible: " + combustible);
            
            int evento = rand.nextInt(2) + 1;

            if (evento == 1) {
                System.out.println("¡Impacto de asteroide!");
                combustible = combustible + 50;
            } else if (evento == 2) {
                System.out.println("¡Viento solar a favor!");
                distancia += 100;
            }

            distancia = distancia + 50;
        }//Fin de While

        if (distancia <= 0) {
            System.out.println("¡Misión completada con éxito, " + piloto + "!");
        }//Fin de If 
        else {
            System.out.println("Misión fallida. Te quedaste sin combustible.");
        }//Fin de Else
    }//Fin de main 
    
}//Fin de class
