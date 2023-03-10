/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y después toda en minúsculas. 
 Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */


import java.util.Scanner;

/**
 *
 * @author ale
 */
public class Newmayusyminus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase=leer.nextLine();
        System.out.println("Tu frase en Minuscula es " +frase.toLowerCase()); 
        System.out.println("Tu frase en Minuscula es " +frase.toUpperCase()); 
        // TODO code application logic here
    }
    
}
