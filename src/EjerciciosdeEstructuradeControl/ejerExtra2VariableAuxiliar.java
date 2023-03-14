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
public class ejerExtra2VariableAuxiliar {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones necesarias 
     * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D 
     * y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
     * de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int A,B,C,D,AXI,AXI1,AUXI2;
        System.out.println("Ingrese valores para A,B,C y D");
        A=leer.nextInt();
        B=leer.nextInt();
        C=leer.nextInt();
        D=leer.nextInt();
        AXI=0;
        AXI=B;
        B=C;
        C=A;
        A=D;
        D=AXI;
        
        /*System.out.println(B+ "=" +C); 
        System.out.println(C+ "=" +A); 
        System.out.println(A+ "=" +D);
        System.out.println(D+ "=" +B); 
        */
        System.out.println("A=D " +A);
        System.out.println("B=C " +B);
        System.out.println("C=A " +C);
        System.out.println("D=B " +D);
    }
    
}
