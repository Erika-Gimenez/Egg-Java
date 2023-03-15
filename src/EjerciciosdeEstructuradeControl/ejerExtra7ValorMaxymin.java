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
public class ejerExtra7ValorMaxymin {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo,
     * el valor mínimo y el promedio de n números (n>0). 
     * El valor de n se solicitará al principio del programa
     * y los números serán introducidos por el usuario.
     * Realice dos versiones del programa,
     * una usando el bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int cantidad=leer.nextInt();
        int cont=0;
        int numMax=0;
        int numMin=0;
        while(cantidad>cont){
            System.out.println("Ingresa numeros");
           int n=leer.nextInt();
            numMax=n;
           numMin=n;
           
            if (n>numMax) {
                numMax=n;
            }
            if (n<numMin) {
                numMin=n;
            }
             cont++;
        }
        System.out.println(numMax);
        System.out.println(numMin);
                
        
        
      /*  do{
          
            System.out.println("Ingresa numeros");
            int n=leer.nextInt(); 
            
        }while(cantidad>0);*/
    }
    
}
