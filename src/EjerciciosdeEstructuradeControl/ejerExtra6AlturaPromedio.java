/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosdeEstructuradeControl;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class ejerExtra6AlturaPromedio {

    /**
     * @param args the command line arguments Leer la altura de N personas y
     * determinar el promedio de estaturas que se encuentran por debajo de 1.60
     * mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas en tu grupo");
        int cantidad = leer.nextInt();
        double altura = 0.0;
        double comparacion = 1.60;
        int cont = 0;
        int cont2 = 0;
        double suma=0.0;
        double suma1=0.0;
        while (cont2 < cantidad){
            System.out.println("Ingresa estatura de tu grupo");
            altura = leer.nextDouble();
            //double comparacion = 1,60;

            if (altura < comparacion) {
                cont++;
                suma+=altura;
            }
            
                cont2++;
                suma1+=altura;
            
        } 

        System.out.println("El promedio de personas que miden menos 1,60 es: " + suma/cont);
        System.out.println("El promedio de todo el grupo es: " + suma1/cont2);

    }
}
/*System.out.println("Ingrese la cantidad de numeros");
        Scanner n = new Scanner (System.in);
        int cantidad = n.nextInt();
        int cont = 0;
        int prom=0;
        int aux = 0;
        int aux2= 999999999;
        int numeros = cantidad;
       
        do {
            System.out.println("Ingrese un numero");
            int num = n.nextInt();
            prom+= num;
            
            if (num > aux) {
                aux = num;
            }
            if (num < aux2) {
                aux2 = num;
            }
            cantidad--;
            
        }
        
        while (cantidad>0); {
        
    }
        System.out.println("El valor maximo es " + aux);
        System.out.println("El valor minimo es " + aux2); 
        System.out.println("El promedio es " + prom/numeros);
*/