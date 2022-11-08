/*

 */
package actividad7tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad7tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    DepositoAgua d1 = new DepositoAgua(15,50);
    d1.dibujar();
    
    
    double porcentaje = (15*100)/50;
    
    System.out.println("El tanto por ciento de la ocupacion del depósito es: "+porcentaje+"%");
    
    
        
        
    }
    
}
