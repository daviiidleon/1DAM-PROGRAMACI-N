/*

 */
package actividad10tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad10tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Caja c = new Caja ("Valencia peor club del mundo");
    c.abrirCaja();
    String m = c.getMensaje();
    
    System.out.println("El mensaje es: "+m);
    
    boolean cambio = c.cambiarMensaje("Valencia mejor club del mundo");
    
    m = c.getMensaje();
    System.out.println("El mensaje es: "+m);
    
    
    
        
        
        
        
        
    }
    
}
