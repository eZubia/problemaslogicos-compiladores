package problemaslogica.problema9;

import java.util.Scanner;

/**
 * Introducir un numero por teclado que nos diga si es positivo o negativo.
 * @author Erik David Zubia Hernádez
 * @since 11/05/15
 * @version 1.0 
 */
public class Problema9 {
    
    /**
     * Metodo que permite un introducir un numero y saca su signo
     */
    public static void signo(){
        Integer num=0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Introduce un numero, en caso de que sea una letra se volvera a pedir");
        num = scan.nextInt();
        }catch(Exception e){
            signo();
        }
        if(num<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
    }
}
