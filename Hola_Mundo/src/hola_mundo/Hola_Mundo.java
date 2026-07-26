/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

/**
 *
 * @author roxic
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Hola.. me llamo Roxana");
        System.out.println ("Este sera mi 1er");
        System.out.println ("PROGRAMAAA!!!!!!");
       
        System.out.print("Vamos camino a");
        System.out.print("la clase de");
        System.out.print("Progra!!");  
        
        //System.out.println("");
        
        System.out.printf ("Tu apellido es %S\n","Cabrera");
        //System.out.println("");
        
        System.out.printf("%S Tu apellido es\n","Cabrera");
        System.out.println("");
        
        System.out.printf("Tu apellido %S es\n","Cabrera"); 
        
        System.out.println("Hola \n este es \n un nuevo \n amanecer");
        System.out.println("Hola \t este es \t un nuevo \t amanecer");
        
        //Variables
        int edad;       //Tipo Entero
        double peso;    //Tipo Decimal
        char inicial;   //Tipo Caracter, letras, digitos, simbolos especiales
        String nombre;  //Tipo cCadena 
        boolean estado; //Tipo Estado true(verdadero), false(falso)
        
        edad = 20;
        peso = 60.5;
        inicial = 'R';
        nombre = "Roxana";
        
        System.out.printf("Tengo %d años \n",edad);
        System.out.printf("Mi peso ideal es %.2f \n", peso);
        System.out.printf("Dime %c por mi inicial \n",inicial);
        System.out.printf("%s es mi nombre",nombre);
       
      }//Fin de main
    
}//Fin de class
