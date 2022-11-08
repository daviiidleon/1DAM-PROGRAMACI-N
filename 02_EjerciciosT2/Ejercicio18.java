/*

 */
package actividad18tema2;


import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad18tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("¿Cuál es tu correo electrónico?");
    String correo = new Scanner(System.in).nextLine();

    int numero = correo.indexOf("@");
    String nombre = correo.substring(0,numero);
    String dominio = correo.substring(numero+1,correo.length());
            
    
    System.out.println("El nombre es: "+nombre);
    System.out.println("El dominio es: "+dominio);
               
        
        
        
    }
    
}
