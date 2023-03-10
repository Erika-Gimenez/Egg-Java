/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
   El programa deberá después mostrar el resultado de la suma
 */


import java.util.Scanner;

/**
 *
 * @author ale
 */
public class dosnumerosenteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros:");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int suma= numero1+numero2;
        System.out.println("La suma de los dos numeros es: " +suma);
        
    }
    
}
