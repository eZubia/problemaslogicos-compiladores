package problemaslogica.problema5;

/**
 *Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que
 *  imprima cuantos impares hay
 * @author Erik David Zubia Hernádez
 * @since 11/05/15
 * @version 1.0
 */
public class Problema5 {
    
    /**
     * Metodo que imprime los numeros impares del 0 al 100 y cuantos impares hay
     */
    
    public static void numImpares(){
        int count=0;
        for (int i = 1; i <= 100; i++) {
            if((i%2)!=0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
