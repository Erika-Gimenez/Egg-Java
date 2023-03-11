/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosdeEstructuradeControl;

import java.util.Scanner;

/**
 *Crear un programa que dado un número determine si es par o impar.

 * @author 
 */
public class ejercicio1paroimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in); 
        System.out.println("Ingresa un numero entero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println(" El numero " +num+ " es par");  
        }else{
            System.out.println(" El numero " +num+ " es impar");
        }
    }
    
}
