
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Negativo_Lig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int x=1; x<=5; x++){
            System.out.print("Escriba un numero: ");
            int num = scanner.nextInt();
            int pos = num*-1;
            System.out.println("el numero:" + num);
            System.out.println("el numero es positivo:" + pos);
        }
         
    }
    
}
