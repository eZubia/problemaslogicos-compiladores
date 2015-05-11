package problemaslogica.problema8;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que solo nos permita introducir S o N
 * @author Erik David Zubia Hernádez
 * @since 11/05/15
 * @version 1.0 
 */
public class Problema8 {
    
    /**
     * Metodo que solo permite introducir S o N
     */
    public static void sOrN(){
        Scanner scan = new Scanner(System.in);
        String respuesta = "S";
        Boolean s=true;
        while(s){
            if(respuesta.equals("S")||respuesta.equals("N")){
                System.out.println("Introduce solamente S o N");
                respuesta = scan.next();
            }else{
               System.out.println("Solamente se pueden introducir N o S");
               s=false; 
            }
        }
    }
}
