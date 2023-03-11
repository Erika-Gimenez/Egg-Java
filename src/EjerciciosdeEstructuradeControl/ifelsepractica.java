/*
 * Implementar un programa que le pida dos números enteros al usuario y 
   determine si ambos o alguno de ellos es mayor a 25.

 */
package EjerciciosdeEstructuradeControl;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ifelsepractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingresa dos numeros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        if (num1>25) {
            System.out.println("El numero " +num1+ " es Mayor a 25");
        }else{
            System.out.println("El numero " +num1+ " es Menor a 25");
        }
        if (num2>25) {
            System.out.println("El numero " +num2+ " es Mayor a 25"); 
        }else{
            System.out.println("El numero " +num2+ " es Menor a 25");
        }
    }
}
