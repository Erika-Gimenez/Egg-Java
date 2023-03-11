/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosdeEstructuradeControl;

import java.util.Scanner;

/**
 *
 * 
 */
public class ejercicio3longitudpalabra {

    /**
     *Realizar un programa que solo permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo 
     * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
     * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
     * la función Lenght() en Java. 
     * @param args
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa una frase de tan solo 8 letras");
        String frase=leer.nextLine();
        if (8==frase.length()) {
            System.out.println("Genial! la frase " +frase+ " es CORRECTA");
        }else{
            System.out.println("Que mal la frase " +frase+ " es INCORRECTA");
        }
    }
    
}
