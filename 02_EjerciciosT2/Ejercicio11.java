/*

 */
package actividad11tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad11tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Caja c = new Caja("El Valencia tiene 6 ligas");
    Caja c2 = new Caja("El Valencia tiene 8 copas del rey");
    
    c.abrirCaja();
    c2.abrirCaja();
    
    String m1 = c.getMensaje();
    String m2 = c2.getMensaje();
    
    System.out.println("El mensaje de la primera caja es: "+m1);
    System.out.println("El mensaje de la segunda caja es: "+m2);
    
    boolean cambio = c.cambiarMensaje(m2);
            cambio = c2.cambiarMensaje(m1);
            
            m1 = c.getMensaje();
            m2 = c2.getMensaje();
            
    System.out.println("El mensaje de la primera caja es: "+m1);
    System.out.println("El mensaje de la segunda caja es: "+m2);
        
        
    }
    
}
