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
public class ejercicio8For {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente:
   * * * *
   *     *
   *     *
   * * * *

     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Dibuja un cuadrado con * ");
        System.out.println("Ingresa tamaño del cuadrado");
        int n=leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n ; j++) {
                if (i==1||i==n||j==1||j==n) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
 
            }
            System.out.println();   
        }
         /*for (int i = 0; i < n ; i++) {
           System.out.print(" *");
            for (int j = 0; j < n-2 ; j++) {
                System.out.print("+");
            }
            System.out.println(" *"); 
        }*/
    }
    
}
