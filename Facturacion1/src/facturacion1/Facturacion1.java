/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion1;

import java.util.Scanner;

/**
 *
 * @author roxic
 * (Es un bloque reutilizable para hacer una tarea)
 * Objetivos:
 * Definir el concepto función/metodo
 * Conocer la estructura de una función 
 * Implementar funciones en el algoritmo
 * 
 * Caracteristicas de las funciones / Metódos:
 * Reutilizable 
 * Modular ->
 * 
 * Estructura de una función 
 * 1. Acceso de la función
 *   Public, private, protected 
 * 2. Tipo de dato Retorna/Devuelve 
 *   int, double
 *   char, String
 *   boolean, long
 *   arraylist..
 * 3. Nombre de la función
 * 4. Parametro de trabajo
 *   int, double 
 *   char, String
 *   boolean, long
 *   arrylist..
 */
public class Facturacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
        
         final double ISV = 0.15;
        
        int precioProducto = 0;
        int cantidad = 0;
        double descuento = 0;
        double impuesto = 0;
        double subTotal = 0;
        double total = 0;
        
        //1ra Función 
        MensajeBienvenida();
        
        //2da Función
        System.out.print("Ingresa el Precio del Producto: ");
        precioProducto = scanner.nextInt();
        precioProducto = ValidacionNumerica(precioProducto,scanner);
        
        System.out.print("Cuantos productos llevas?");
        cantidad = scanner.nextInt();
        cantidad = ValidacionNumerica(cantidad,scanner);
        subTotal = precioProducto * cantidad;
        if(subTotal >100){
            descuento = subTotal *0.10;
        }
        else{
            descuento = 0;
        }
        
        impuesto = (subTotal - descuento)*ISV;
        
        total = subTotal - descuento + impuesto;
        
        //4ta Función
        ResultadoFactura(subTotal, descuento,impuesto,total);
    }// fin de main
    
    public static void MensajeBienvenida (){       //public es el acceso a la funcion, void que tipo de datos va a retomar la función
      System.out.println("---------------------------");   // Las funciones se crean fuera del main
      System.out.println(" Sistema de Facturacion");
      System.out.println(" La logica de Programacion");
      System.out.println("---------------------------");  
       
    }//Fin de función MensajeBienvenida 
      public static int ValidacionNumerica (int numero, Scanner input){
          int numeroValido = numero;
          final int LIMITE = 0;
          
          do {
              if (numeroValido<LIMITE){
                  System.out.println("Valor Numerico no puede");
                  System.out.println("Ser menor a 0");
                  System.out.println(" Ingrese nuevamente el dato");
                  numeroValido = input.nextInt();
                  
              }
          }while (numeroValido<LIMITE);
          return numeroValido;
          
        }//Fin funcion ValidacionNumerica
        public static void ResultadoFactura (double sub, double des, double imp, double tot){ 
        System.out.printf("\nSubtotal: %.2f",sub);
        System.out.printf("\nDescuento: %.2f",des);
        System.out.printf("\nImpuesto: %.2f",imp);
        System.out.printf("\nPrecio a Pagar: %.2f",tot);
    }//Fin de Función Resultado Factura 
}// Fin de class   
     
    

