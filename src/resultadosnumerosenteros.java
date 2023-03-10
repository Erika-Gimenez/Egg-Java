/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y
   la raíz cuadrada de ese número. 
   Nota: investigar la función Math.sqrt().

 */


import java.util.Scanner;

/**
 *
 * @author ale
 */
public class resultadosnumerosenteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num= leer.nextInt();
        System.out.println("El doble del numero es:" +num*2);
        System.out.println("El triple del numero es:" +num*3);
        System.out.println("La raiz del numero es:" +Math.sqrt(num));
     // TODO code application logic here
    }
    
}
