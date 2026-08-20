/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemademonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roxic
 * Desarrolla un programa en Java que simule la lectura de sensores 
 * de temperatura en un cuarto 
 * 1. Comprender el tema que se esta abordando 
 *  a. Que datos de entrada necesito?
 *  b. Transformación / Calculos necesarios 
 *  c. Que resultados necesito?
 * 2. Visualización / Diseño de la Solución 
 *  a. Diagrama flujo
 *  b. Pseudocódigo
 * 3. Programación Incremental
 *  a. Listando las tareas a cumplir 
 *    i. Declaración de variables 
 *    ii. Estructuras de selección
 *    iii. Ciclos de repetición WHILE 
 *    iv.  Validación de datos 
 *  b. Validación
 * 4. Prueba de escritorio
 *  a. Casos 
 *  b. Escenarios
 *  c. Resultados / Patrones definidos.
 */ 
public class SistemadeMonitoreo {

    /**
     * @param args the command line arguments
     * Comprensión problema  
     * 1. Entrada
     *  a. Nombre de usuario
     *  b. Numero de lecturas
     *  c. Ingreso de temperaturas (RANDOM)
     * 2. Calculos / transformación
     *  a. Formulas Celsius - Farenheit
     *  b. Definición de Sobrecalentamiento
     *  c. Validación temperaturas (0 > lectura menor 50)
     *  d. Promediar el monitoreo
     *  e. Contabilizar el numero de calentamiento
     *  -Validación temperatura
     * 3. Salidas 
     *  a. Resumen de estadisticas 
     *  b. Alerta de sobrecalentamiento.
     * 
     * Lista de tareas:
     * 1.Capturar el nombre del usuario
     *  Definición de libreria / instancia SCANNER
     *  Declaración de variable para el usuario 
     * 2.Captura de numero de lecturas 
     *  Declaración de variavble para numero de lectura
     * 3.Generación de temperatura 
     *  definición de libreria RANDOM
     *  Declaración de variable 
     *  Mostrar el numero random generando temporalmente 
     *  Rango de temp 200 - 400
     * 
     * 4. formula: F = ( C * 9/5+32)
     * 5. limite de sobrcalentameinto 350 C (662 F)
     *  Estructura de selección (IF/ELSE)
     * 6. Validación de lecturas DO WHILE 
     * 7. Sumar los numeros de sobrecalentamiento 
     * 8. Calcular el promdio 
     * 9. Mostrar el resumen 
     *  Promedio
     *  sobreCalentamiento
     * 10. Generar una alerta de sobrecalentamiento 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Random rd = new Random ();
        
        
        String nombreUsuario = "John Doe";
        int numLectura = 0;
        int ciclo = 0;
        double tempC = 0;
        double tempF = 0;
        int numSobreCalentamiento = 0;
        double promedio = 0;
        double acumTemp = 0;
        
        System.out.print("Nombre de operación: ");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar captura: %s\n", nombreUsuario);
        
        do {
            System.out.print("Numero de Lecturas: ");
            numLectura = sc.nextInt();
           //System.out.printf("Validación Captura: %d\n", numLectura);
        //if (!(numLectura>0 && numLectura<50)){
            if (numLectura<0 || numLectura <50 ){
            System.out.println("Valor NO VALIDO"); 
            System.out.println("Tiene que ser entre 0 y 50");
        }
        //}while (!(numLectura>0 && numLectura<50));
    }    while (numLectura<0 || numLectura<50);
        
        while(ciclo < numLectura) {
            //while(numLectura > 0) { 
            tempC = rd.nextDouble(200,500);
            tempF = (tempC*9/5)+32;
             //tempC = (Math.random()*500)-300 + 200;
             //System.out.printf("Validación Random: %.2f\n", tempC);
             System.out.printf("Num Lectura: %d\tTemp C: %.2f\n",ciclo+1,tempC);
             System.out.printf("Temperatura en faren: %.2f\n",tempF);
             
             if (tempF>662){
                 System.out.println("Alerta!!!...SobreCalentamiento");
                 numSobreCalentamiento++;
             }else{
                 acumTemp +=tempF;
             }
            //System.out.printf("Num Lectura: %d\tTemp C: %.2f\n",numLectura,tempC);
            
            
            ciclo++;
            //numLectura--;
        }//Fin de while  
        promedio = acumTemp / numLectura;
        
        System.out.println("------------------");
        System.out.println("     Resumen      ");
        System.out.println("------------------");
        System.out.printf("Promedio de Temperatura: %.2f\n",promedio);
        System.out.printf("# SobreCalentamiento: %d",numSobreCalentamiento);
        
        
    }//Fin de main 
    
}//Fin de class
