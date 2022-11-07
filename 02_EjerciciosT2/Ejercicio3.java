/*          3

 */
package JavaApplication15;

import bpc.daw.mario.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Seta s = new Seta (120,90);
        s.andarHacia(0, 0);
        Mario m = new Mario (200,200);
        m.saltar();
        Cañon c = new Cañon (500,500);
        Luigi l = new Luigi (700,500);
        c.disparar(700, 500);
        Planta p = new Planta (800,800);
        p.comer(true);
         Planta pl = new Planta (830,800);
        p.comer(true);
         Planta pla = new Planta (860,800);
        p.comer(true);
            
                
        
        
    }
    
}
