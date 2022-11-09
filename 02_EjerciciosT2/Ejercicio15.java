/*

 */
package actividad15tema2;

import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad15tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave= "valencia";
        
        System.out.println("Introduzca una contraseña");
        String contraseña = new Scanner(System.in).nextLine();
        
        System.out.println("¿Es esta la contraseña? "+contraseña.equals(clave));
        
        
        
        
        
    }
    
}
