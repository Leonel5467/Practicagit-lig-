
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Positivos_lig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num;
        for (int n =1; n<=10; n++){
        System.out.print("Ingresa un numero: ");
        num = scanner.nextInt();
        if(num > 0) {
            System.out.println("Numero positivo:" + num);
            }
        
         }
    scanner.close();
   }
}