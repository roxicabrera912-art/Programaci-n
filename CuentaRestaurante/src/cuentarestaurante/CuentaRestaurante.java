/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;

/**
 *
 * @author roxic
 * Desarrollar un algoritmo que simule la cuenta de un restaurante que se tiene
 * que pagar entre un grupo de amigos (7) dividido en partes iguales.
 */

public class CuentaRestaurante {

    /**
     * @param args the command line arguments
     * Objetivo
     * 1. Conocer los diferentes tipos de ciclo de repetición.
     * 2. Analizar los componentes de todo ciclo de repetición.
     * 3. Construir un algoritmo con un ciclo de repetición.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        double promedioPago = 0;
        int gastoIndividual = 0;
        
        int numPersona = 1; //Variable de Control
        int gastoAcumulado = 0; //Acumulador
        //Condición -Variable de Control con limite
        while (numPersona <= 7) {
        //Instrucciones a Repetir
            System.out.printf("(Persona %d) Cuanto consumiste?",numPersona);
            gastoIndividual = sc.nextInt();
            
            gastoAcumulado += gastoIndividual; //Suma de los gastos
            System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d",numPersona,
                    gastoIndividual,gastoAcumulado);
            System.out.println("");
            //Modificador
            //Opcion #1
            //numPersona += 1; //numPersona = numPersona +1;
            
            //Opción #2
            numPersona++; //Incremento unitario (POST Incremento)
            
        }//Fin de While
        
        //promedioPago = gastoAcumulado / 7; //Hardcoring
        numPersona--; //  POST Decremento Unitario
        System.out.printf("\nTotal Personas: %d",numPersona);
        promedioPago = gastoAcumulado / numPersona;
        
        System.out.printf("\nGasto Promedio x Persona: %.2f",promedioPago);
        
    }//Fin de Main
    
}//Fin de Class
