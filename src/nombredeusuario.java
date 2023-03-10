/*
 * Escribir un programa que pida tu nombre, 
  lo guarde en una variable y lo muestre por pantalla.
 */


import java.util.Scanner;

/**
 *
 * @author ale
 */
public class nombredeusuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Escribe tu nombre");
        String nombre= leer.nextLine();
        System.out.println("Hola, soy " +nombre+ " y me gustaria morirme, pero no");
        // TODO code application logic here
    }
    
}
