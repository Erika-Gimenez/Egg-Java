/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosdeEstructuradeControl;

import java.util.Scanner;

/**
 *
 * @author ale
 */
public class ejercicio4letracorrectaoin {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
     * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y 
     * equals() de Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        
        frase=frase.toUpperCase();
        String letra= frase.substring(0,1);
        if (letra.equals("A")) {
            System.out.println("La frase es CORRECTA");
        }else{
            System.out.println("La frase es INCORRECTO"); 
        }
        
    
}
}
