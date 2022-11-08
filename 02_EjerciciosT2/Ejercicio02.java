/*          

 */
package actividad1tema2;

import bpc.daw.mario.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad1tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str1 = "hola";
        Mario m1, m2 = null;
        Luigi l1, l2= null;
        Seta s1,s2 = null;
        Cañon c1,c2 = null;
        Disparo d1,d2 = null;
        Planta p1,p2 = null;
        
        
        // constructor por defecto 
        m1 = new Mario();
        l1 = new Luigi();
        s1 = new Seta(45,67);
        c1 = new Cañon(67,90);
        d1 = new Disparo(34,23,78,56);
        p1 = new Planta(67,21);
        
        // constructor por parámetros 
        m2 = new Mario(25,15);
        l2 = new Luigi(25,15);
        s2 = new Seta(25,15);
        c2 = new Cañon(25,15);
        d2 = new Disparo(25,15,65,32);
        p2 = new Planta(25,15);
            
                
        
        
    }
    
}
