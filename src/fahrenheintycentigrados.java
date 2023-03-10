/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
   La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */

/**
 *
 * @author ale
 */
public class fahrenheintycentigrados {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int centigrados= 2;
        double resultado=32 + (9 * centigrados / 5);
        System.out.println("El equivalente de grados Centigrados a grados Fahrenheint es :" + resultado);
        // TODO code application logic here
    }
    
}
