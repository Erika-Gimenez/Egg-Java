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
public class ejerExtra5ObraSocial {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento
* (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese monto de tratamiento");
        //int monto=leer.nextInt();
        System.out.println("Ingrese la clase de socio");
        System.out.println("Socio tipo A");
        System.out.println("Socio tipo B");
        System.out.println("Socio tipo C");
        char opc;
        opc=leer.next().charAt(0);
        System.out.println("Ingrese monto de tratamiento");
        int monto=leer.nextInt();
        switch(opc){
            case 'A' :
                int porcentaje= ((monto*50)/100)-100;
                System.out.println(porcentaje);
                break;
            case 'B':
                int porcentaj= ((monto*35)/100)-100;
                System.out.println(porcentaj);
                break;
            case 'C':
                
                System.out.println(monto);
                break; 
            default:
                System.out.println("La clase ingreda no se encuntra en las opciones ");
        }
    }
    
}
