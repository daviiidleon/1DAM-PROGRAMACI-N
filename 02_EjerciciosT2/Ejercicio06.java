/*

 */
package actividad6tema2;

import bpc.daw.mario.*;
import java.util.Scanner;


/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad6tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Mario m = new Mario();
    int m2;
    int m3;
    
    System.out.println("Introduce la coordenada X para crear a Mario");
    m2 = new Scanner(System.in).nextInt();
    System.out.println("Introduce la coordenada X para crear a Luigi");
    m3 = new Scanner(System.in).nextInt();
    m.colocar(m2, m3);
    
        
        
    }
    
}
