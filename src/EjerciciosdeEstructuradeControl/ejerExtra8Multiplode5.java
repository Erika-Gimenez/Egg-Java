/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosdeEstructuradeControl;

/**
 *
 * @author ale
 */
public class ejerExtra8Multiplode5 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. 
     * Si el número es múltiplo de cinco debe detener la lectura
     * y mostrar la cantidad de números leídos, la cantidad de números pares
     * y la cantidad de números impares. Al igual que en el ejercicio anterior 
     * los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
      int n = 0;
        int par=0;
        int impar = 0;
        int cantN = 0;
        int m = 2;
        
        while (m!=0) {
        System.out.println("Ingrese un numero entero");
        Scanner input = new Scanner (System.in);
        n = input.nextInt();
        cantN++;
        
        if (n%2==0) {
            par++;
        }
        else {
            impar++;
        }
        
         if (n%5==0){
            break;
    }
    
}
