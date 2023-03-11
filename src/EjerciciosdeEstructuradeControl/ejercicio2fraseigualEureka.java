/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosdeEstructuradeControl;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje 
 * de Incorrecto. Nota: investigar la función equals() en Java.

 * @author 
 */
public class ejercicio2fraseigualEureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String palabra= "eureka";
        System.out.println("Ingresa una frase,pista puede ser eureka");
        String frase=leer.nextLine();
        if (frase.equals(palabra)) {
            System.out.println("La frase ingresada " +frase+ " es CORRECTA");
        } else {
            System.out.println("La frase ingresada " +frase+ " es INCORRECTA");
        }
    }
    
}
