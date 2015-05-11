package problemaslogica.problema6;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que imprima todos los numeros naturales que hay
 *   desde la unidad hasta un numero que introducimos por teclado.
 * @author Erik David Zubia Hernádez
 * @since 11/05/15
 * @version 1.0
 */
public class Problema6 {
    
    /**
     * Método que imprime los numeros naturales enteros hasta un numero
     * que introdusca el usuario
     */
    public static void numNaturales(){
        Integer num=0;
        System.out.println("Introduce un numero porfavor");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for (int i = 0; i <=num; i++) {
            System.out.println(i);
        }
    }
    
}
