/*

 */
package actividad8tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad8tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    DepositoAgua d1 = new DepositoAgua(15,20);
    DepositoAgua d2 = new DepositoAgua(5,20);
    
    d1.dibujar();
    d2.dibujar();
    
    boolean retira = d1.retirarLitro();
                     d1.retirarLitro();
                     d1.retirarLitro();
                     d1.retirarLitro();
                     d1.retirarLitro();
    
    boolean rellena= d2.añadirLitro();
                     d2.añadirLitro();
                     d2.añadirLitro();
                     d2.añadirLitro();
                     d2.añadirLitro();
    
    d1.dibujar();
    d2.dibujar();
        
          
        
    }
    
}
