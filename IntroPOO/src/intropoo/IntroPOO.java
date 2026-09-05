/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intropoo;

/**
 *
 * @author roxic
 */
public class IntroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Javier = new Persona();
        Persona Stephanie = new Persona("Astrid",19,1.63);
        
        System.out.println("----------------");
        Javier.ImpresionNombre();
        Javier.CaracteristicasPersona();
        
        System.out.println("----------------");
        Stephanie.ImpresionNombre();
        Stephanie.CaracteristicasPersona();
        
        System.out.println("-----------------");
        
        Javier.nombre = "Antonio";
        Javier.edad = 27;
        Javier.estatura = 1.70;
        Javier.SetGenero('M');
        
        Stephanie.nombre = "Sarai";
        Stephanie.edad = 19;
        Stephanie.estatura = 1.72;
        Stephanie.SetGenero('F');
        
        Javier.ImpresionNombre();
        Stephanie.ImpresionNombre();
        
        System.out.println("-----------------");
        
        Javier.CaracteristicasPersona();
        System.out.printf("Genero: %c\n",Javier.GetGenero());
        
        Stephanie.CaracteristicasPersona();
        System.out.printf("Genero: %c\n",Stephanie.GetGenero());
        
        VentanaPrincipal VP = new VentanaPrincipal(Javier.nombre,Javier.edad,Javier.estatura);
        VP.setVisible(true);
        VP.setLocationRelativeTo(null);
    }//fin de Main
    
}//Fin de class
