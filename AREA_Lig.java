
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class AREA_Lig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        for (int n=1; n<=10; n++){
             System.out.print("Escribe la base:");
        int altura = scanner.nextInt();
        System.out.print("Escriba la altura ");
        int base = scanner.nextInt();
        int area_rec= base*altura;
        System.out.println(" El area del rectangulo es:" + area_rec);
     }
    
  }
}