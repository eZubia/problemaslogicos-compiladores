package problemaslogica.problema7;

import java.util.Scanner;

/**
 *Introducir tantas frases como queramos y contarlas.
 * @author Erik David Zubia Hernádez
 * @since 11/05/15
 * @version 1.0
 */
public class Problema7 {
    
    /**
     * Metodo que permite introducir cuantas frases se quiera y se cuentan
     */
    public static void frases(){
        String frase ="a";
        System.out.println("Introdusca cuantas frases quiera y cuando quiera detenerse escriba detener (todas en minusculas)");
        Scanner in = new Scanner(System.in);
        Boolean sigue=true;
        int count=0;
        while(sigue==true){
            frase= in.next();
            System.out.println(frase);
            if(frase.toString().equals("detener")){
                sigue=false;
            }else{
                count++;
            }            
        }
        System.out.println(String.format("El numero de frases que introdujo es %s",count));
    }
}
