/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generacion.de.toquen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roxic
 * Objetivos 
 * 1. Utilizar el ciclo de repeticion DO - WHILE
 * 2. Uso de Nuevas Librerias
 *  a. Random
 * 3. Uso de Otras Funciones de String
 */
public class GeneracionToken {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita registrar
     * un dispositivo y generar un token para su sesion
     * de validacion mientras se esta navegando con dicho dispositivo. 
     * Contexto del problema:
     * Un sistema de gestión de red necesita registrar 
     * nuevos enrutadores (routers) y asignarles una clave 
     * de sesión única generada aleatoriamente. 
     * Sin embargo, el canal de comunicación tiene "ruido", por lo que la 
     * generación de la clave no siempre es constante.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        String nombreEquipo = "a";
        boolean longitudCorrecta = true;
        boolean prefijoCorrecto = true;
        boolean validacionCorrecta = true;
        int tipoCaracter = 0;
        int numeroToken = 0;
        char letraToken = 'a';
        String Token = "s";
        
           do{
           System.out.println("Ingrese el nombre de su equipo");
        nombreEquipo = sc.nextLine().toUpperCase();
        
        System.out.printf("\nNombre del Equipo: %s\n",nombreEquipo);
        
        longitudCorrecta = nombreEquipo.length()== 8;
        prefijoCorrecto = nombreEquipo.startsWith("RT")||nombreEquipo.startsWith("SW");
        
        //System.out.println(longitudCorrecta);
        //System.out.println(prefijoCorrecto);
        
        validacionCorrecta = longitudCorrecta && prefijoCorrecto;   
      
        }while(!validacionCorrecta);
        System.out.println("Registro Correcto");
        
        while (Token.length()<12) {
        tipoCaracter = rd.nextInt(2);
        
        if (tipoCaracter == 0){
            numeroToken = rd.nextInt(10);
            Token = Token  + numeroToken;
        }
        else {
            letraToken = (char) (rd.nextInt(26)+65); 
            Token = Token + letraToken;
            }
        }
        System.out.printf("Token es: %s",Token);
    }//Fin de main
    
}//Fin de Class
