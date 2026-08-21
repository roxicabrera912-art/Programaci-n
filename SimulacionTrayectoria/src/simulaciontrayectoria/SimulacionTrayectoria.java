/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciontrayectoria;

import java.util.Scanner;

/**
 *
 * @author roxic
 * 3. Simulación de Trayectoria Balística (Uso estricto de for) 
Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la 
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula 
correspondiente a la trayectoria. 
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente 
entre 1 y 89 grados. 
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del 
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el 
segundo 𝑡 = 10. 
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el 
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser 
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe 
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
 */
public class SimulacionTrayectoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        double velocidad;
        double angulo;
        final double GRAVEDAD = 9.81;
        
        do {
            System.out.println("Ingrese la velocidad inicial (m/s > 0): ");
            velocidad = scanner.nextDouble();
            if (velocidad <= 0){
                System.out.println("Error: La velocidad debe ser mayor a 0.");
            }
        }while (velocidad <= 0);
        do{
            System.out.print("Ingrese el ángulo del lanzamiento (1 - 89 grados): ");
            angulo = scanner.nextDouble();
            if (angulo < 1 || angulo > 89){
                System.out.println("Error: El ángulo debe estar entre 1 y 89 grados.");
            }
        }while (angulo < 1 || angulo > 89);
        double anguloRadianes = Math.toRadians(angulo);
        double v0y = velocidad * Math.sin(anguloRadianes);
        
        double alturaMaxima = -1;
        int segundoMaximo = 0;
        
        System.out.println("\n---- Simulación de Trayectoria ----");
        
        //Ciclo estricto de t = 1 a t = 10
        for (int t = 1; t <= 10; t++){
        double altura = (v0y * t) - (0.5 * GRAVEDAD * Math.pow(t, 2));
        
        if (altura < 0){
            System.out.printf("Segundo %d: El proyectil a impactado el suelo (Altura negativa: %.2f m).\n", t, altura);
          break;  
        }else {
            System.out.printf("Segundo %d: Altura = %.2f metros\n",t ,altura);
            
            if (altura > alturaMaxima){
                alturaMaxima = altura;
                segundoMaximo = t;
            }
        }

    }
     if (segundoMaximo > 0){
         System.out.printf("\n La altura maxima estimada fue de %.2f m en el segundo %d.\n",alturaMaxima, segundoMaximo);
         
     }   

    }//Fin de Main
    
}//Fin Class

