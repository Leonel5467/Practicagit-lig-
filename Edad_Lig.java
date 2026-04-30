
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Edad_Lig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       for (int n=1; n<=30; n++){
           System.out.print("Escriba el año de la persona: ");
           int año_p = scanner.nextInt();
           System.out.print("scriba el año actual:");
           int año_ac = scanner.nextInt();
           int edad= año_ac - año_p;
           System.out.print("Edad de la persona es:" + edad);
           
       }
    }
    
}
