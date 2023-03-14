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
public class ejerExtra3DetectarVocal {

    /**
     * @param args the command line arguments Elaborar un algoritmo en el cuál
     * se ingrese una letra y se detecte si se trata de una vocal. Caso
     * contrario mostrar un mensaje. Nota: investigar la función equals() de la
     * clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Ingresa una letra");
            String letra = leer.next();
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                num = 1;
            } else {
                System.out.println("La letra ingresada no es una vocal, intenta de nuevo");

            }

        } while (num == 0);

    }
}
