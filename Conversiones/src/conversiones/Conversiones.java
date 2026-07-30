/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;
import java.util.Scanner;

/**
 *
 * @author roxic
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner(System.in);
       //Declarar Variables
       int pulgadas = 0;
       double resultadoCM = 0;
       
       double kilometros = 0;
       double millas = 0;
       double farenheit = 0;
       double celsius = 0;
       double gradosFar = 0;
       double gradosCel = 0; 
       
       pulgadas = 10;  // los datos van de derecha a izquierda 
       resultadoCM = pulgadas * 2.54;
       System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
       
       pulgadas = 35;
       resultadoCM = pulgadas * 2.54;
       System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadoCM,pulgadas);
       
       System.out.println("");
       System.out.println("Cuantos kilometros hay de TGU - SPS"); 
       kilometros = teclado.nextDouble();
       millas = kilometros /1.6;
       System.out.printf("%.2f km es igual a %.2f millas \n",kilometros,millas);
       System.out.printf(kilometros + "km es igual a"+ millas + "millas");
       
       
       System.out.printf("Ingrese la temperatura en farenheit");
       farenheit = teclado.nextDouble();
       celsius = (farenheit -32) * 5/9;
       System.out.printf("%.2f farenheit equivale a %.2f grados celsius",farenheit,celsius);
       System.out.println("");
       
       
       System.out.print("A como esta la temp Farenheit en la Yusa?");
       gradosFar = teclado.nextDouble();
 
       gradosCel = (gradosFar -32) * 5/9;
       System.out.printf("Resultado Temp C: %.3f \n",gradosCel);
       
       //Orden de operaciones si importa 
       //gradosCel = 5/9 * gradosFar - 32;
       //System.out.printf("Resultado Temp C: %.3f ",gradosCel);
       
        
    }//Fin de main
    
}
