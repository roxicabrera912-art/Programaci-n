/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author roxic
 * Objetivos
 * 1.Selección multiple
 *  a.Estructura
 *  b.Tipos de Condición
 * 2.Formateo de Cadenas (printf)
 */
public class Tiemporelax {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita visitar un pais.
     * Posterior a ello, debemos nostros escoger las posibles ciudades a 
     * recorrer, sin embargo, solo se puede una ciudad.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int SeleccionMenu = 0;
        char SeleccionSubMenu = '@';
        
        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n","Taniha's travel", "Buen Viaje");
        System.out.println("--------------------------------------");
        System.out.println("1. Suiza");
        System.out.println("2. Corea del Sur");
        System.out.println("3. Noruega");
        System.out.println("4. Inglaterra");
        System.out.print("Respuesta: ");
        SeleccionMenu = sc.nextInt();
        
        /*if/else - Rango de valores
         switch - Igualdad / Todas las opciones estan al mismo nivel
        */
         
        switch (SeleccionMenu){
            case 1:
                System.out.println("Herzlich willkommen in der Schweiz");
                System.out.println("Te damos la bienvenida a Suiza");
                System.out.println("------------------------------");
                
                System.out.println("A. Zúrich");
                System.out.println("B. Berna");
                System.out.println("C. Ginebra");
                System.out.print("Respuesta: ");
                
                sc.nextLine(); //Limpieza de Buffer
                SeleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                switch (SeleccionSubMenu) {
                    case 'A' :
                        System.out.println("Lago de Zúrich");
                        break;
                        
                    case 'B' :
                        System.out.println("El BärenPark");
                        break;
                      
                    case 'C' :
                        System.out.println("El Jet d'Eau");
                        break;
                    default:
                        System.out.println("Cualquier ciudad..."); 
                        System.out.println("Porque no esta en la opcion");
                        System.out.println("que escogiste");
                        break;
                            
                }//Fin de SwitchSubMenu
                break;
            case 2:
                System.out.println("Hanguge osin geos-eul hwan-yeonghamnida");
                System.out.println("Te damos la bienvenida a Corea del Sur");
                System.out.println("-----------------");
                
                System.out.println("1. Busan");
                System.out.println("2. Seul");
                System.out.println("3. Incheon");
                System.out.println("Respuesta: ");
                
                sc.nextLine();
                SeleccionSubMenu = sc.nextLine().charAt(0);
                
                switch (SeleccionSubMenu){
                    case '1':
                        System.out.println("Gamcheon Culture Village");
                        break;
                        
                    case '2':
                        System.out.println("Rio Han");
                        break;
                        
                    case '3':
                        System.out.println("Isla Wolmido");
                        break;
                    default:
                        System.out.println("Porfavor lea, esa opcion no esta");
                        break;
                }//Fin de switchSubMenu
                break;
            case 3:
                System.out.println("Vi ønsker deg velkommen til Norge");
                System.out.println("Te damos la bienvenida a Noruega ");
                System.out.println("---------------------------------");
               
                System.out.println("A. Oslo");
                System.out.println("B. Bergen");
                System.out.println("c. Trondheim");
                System.out.print("Respuesta: ");
                
                sc.nextLine();
                SeleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                if (SeleccionSubMenu == 'A'){
                    System.out.printf("%s Oslo %s","\u001B[31m","\u001B[0m");
                    
                }else if(SeleccionSubMenu =='B'){
                    System.out.printf("%s Bergen %s","\u001B[32m","\u001B[0m");
                    
                }else if(SeleccionSubMenu =='C'){
                   System.out.printf("%s Trondheim %s","\u001B[34m","\u001B[0m");

                }else{
                   System.out.println("Verdad que usted no lee!!!");
                }
                break;
            case 4:
                System.out.println("welcome to England");
                System.out.println("Te damos la bienvenida a Inglaterra");
                break;
                
        }//Fin de Switch Menu
        
        }//Fin de main
    }//Fin de class
    

