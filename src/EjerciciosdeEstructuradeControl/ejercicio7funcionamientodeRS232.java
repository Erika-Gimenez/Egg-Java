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
public class ejercicio7funcionamientodeRS232 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
     * RS232, este tipo de dispositivo 1-/lee cadenas enviadas por el usuario./
     * Las cadenas deben llegar con un formato fijo: 2-/tienen que ser de un
     * máximo de 5 caracteres de largo/ 3-/ el primer carácter tiene que ser X y
     * el último tiene que ser una O./ 4-/Las secuencias leídas que respeten el
     * formato se consideran correctas, 5-/ la secuencia especial“&&&&&” marca
     * el final de los envíos (llamémosla FDE), 6-/ y toda secuencia distinta de
     * FDE,que no respete el formato se considera incorrecta. 7-/ Al finalizar
     * el proceso, se imprime un informe indicando la cantidad de lecturas
     * correctas e incorrectas recibidas. Para resolver el ejercicio deberá
     * investigar cómo se utilizan las siguientes funciones de Java Substring(),
     * Length(), equals().
     *
     * @param args the command line arguments
     */
    //String primerCarac= "X";
    //String ultimoCarac= "O";
    //String caracterMax="xjkko";
    /*String lee = primerCarac.substring(0, 3);
        System.out.println(lee); 
        String le = primerCarac.substring(2);
        System.out.println(le);
     */
    //finSecuencia=leer.next();
    //String l="&&&&&";
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String finSecuencia = null;
        String caracterMax = null;
        String l = "&&&&&";
        int contador = 0;
        int contador2 = 0;
        System.out.println("Ingresa una cadena de 5 caracteres que comience con letra X y termine con la letra O");
        System.out.println("Para salir ingresa esta secuencia &&&&&");
        do {
            System.out.println("Ingresa una cadena");

            caracterMax = leer.nextLine();

            String letra = caracterMax.substring(0, 1);
            String letra2 = caracterMax.substring(4, 5);
            if (!caracterMax.equals("&&&&&")) {

                if (caracterMax.length() == 5 && letra.equalsIgnoreCase("x") && letra2.equalsIgnoreCase("o")) {

                    contador++;

                } else {
                    contador2++;

                }
            }
        } while (!caracterMax.equals("&&&&&"));
        System.out.println("Correctas" + contador);
        System.out.println("Incorrectas " + contador2);
    }
}
