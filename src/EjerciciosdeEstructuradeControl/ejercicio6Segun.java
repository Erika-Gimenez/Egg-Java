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
public class ejercicio6Segun {

    private static String letra;

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y 
     * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
     * y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
     * si el usuario selecciona la opción 5, en vez de salir del programa directamente,
     * se debe mostrar el siguiente mensaje de confirmación: 
     * ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter ‘S’ se sale del programa,
     * caso contrario se vuelve a mostrar el menú.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
      String palabra = "s";
      int opc= 0;
        do {
        System.out.println("Ingresa dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt(); 
        System.out.println("MENU");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.SALIR");
        
        
            System.out.println("Elije una opcion");
            opc=leer.nextInt();
          switch(opc) {
              case 1:
                  System.out.println("La suma de los numeros " +num1+ " , " +num2+ " es:");
                  System.out.println(num1+num2);
                  break;
              case 2:
                  System.out.println("La resta de los numeros " +num1+ " , " +num2+ " es:");
                  System.out.println(num1-num2);
                  break;
              case 3:
                  System.out.println("La multiplicacion de los numeros " +num1+ " , " +num2+ " es:");
                  System.out.println(num1*num2);
                   break;
              case 4:
                  System.out.println("La division de los numeros " +num1+ " , " +num2+ " es:");
                  System.out.println(num1/num2);
                   break; 
              case 5:
                  System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    palabra=leer.next();
                   break; 
              default:
                  System.out.println("El valor ingresado es una opcion es diferente, vuelve a intentarlo");
          }
        } while (palabra.equalsIgnoreCase("n") );
        
    }
    
    
}
