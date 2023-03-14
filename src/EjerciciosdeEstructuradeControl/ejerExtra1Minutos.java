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
public class ejerExtra1Minutos {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular
     * su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Para calcular las Horas y los Dias");
        System.out.println("Ingresa minutos");
        int min= leer.nextInt(); 
        System.out.println( "minutos " +min+ " ->horas=" +min/60);
        System.out.println("minutos " +min+ " ->dias=" +min/1440);
    }
    
}
