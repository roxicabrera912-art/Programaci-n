/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selección.de.vehículos;

import java.util.Scanner;

/**
 *
 * @author roxic
 * Objetivos
 * Estructuras de Selección
 * 1. Estructura o formato
 *   a.Palabras claves
 *   b.Bloques
 *   c.Terminaciones
 *   d.Condiciones
 * 2. Tipos de Selección
 *   a.Simple
 *   b.Doble
 * 3. Condiciones
 *   a.Tipos de Condiciones
 *   b.Tipos de Comparación
 */
public class SelecciónDeVehículos {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita escoger los siguientes elementos
     * de un vehiculo:
     *  a. Si el tamaño del tanque de combustible agarra mas de 30 litros (Dato Numerico)
     *  b. El tipo de combustible si es o no Diesel (Dato tipo caracter)
     *  c. Si es energeticamente eficiente y ecologico (Dato Cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cantidadLitros = 0;
        char respuestoTipo = 'a';
        String respuestaCadena = "John Doe";
                
        System.out.println("Me dijeron que eres dueño de un vehiculo \"Verde\"");
        System.out.println("Tienes que echarle biodiesel");
        System.out.print("Cuantos litros de agarra?");
        cantidadLitros = entrada.nextInt();
         
        if(cantidadLitros>30){
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta!!");
            }
        System.out.println("");
        
        entrada.nextLine(); //Limpiar el Buffer
        System.out.println("Tu vehiculo es Diesel Verde? (x = si, y = no");
        respuestoTipo = entrada.nextLine().charAt(0);
        System.out.println("\nRespuesta Dada");
        
        if(respuestoTipo == 'x'){ 
            //Condición VERDADERO
            System.out.println("Si es diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
        else
        {
           System.out.println("Uyyy...eres anticlimatico");
           System.out.println("Calentamiento Global!!!");
        }  
        
        System.out.println("");
        
        System.out.println("Tu carro es energeticamente eficiente");
        respuestaCadena = entrada.nextLine();
        /*
        System.out.printf("Respuesta ingresada: %s",respuestaCadena);
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta Ingresada: %s", respuestaCadena);
        
        System.out.println("\n100% Seguro?");
        respuestaCadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        */
        
       if (respuestaCadena.equals("si")) {
           System.out.println("Excelente");
           System.out.println("Amigable con el ambiente");
        }  
       else {
           System.out.println("Uyy...busca que se puede hacer");
        }
        
        
        
        
    } //Fin de main
    
}
