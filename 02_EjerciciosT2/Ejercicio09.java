/*

 */
package actividad9tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad9tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Caja c = new Caja ("Bienvenido al instituto");
    String m = c.getMensaje();
    
    System.out.println("El mensaje es: "+m);
    
    c.abrirCaja();
    
    m = c.getMensaje();
    System.out.println("El mensaje es "+m);
    
    
    
    
   
        
        
        
    }
    
}
