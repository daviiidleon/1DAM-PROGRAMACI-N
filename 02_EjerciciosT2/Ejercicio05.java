/*

 */
package actividad5tema2;

import bpc.daw.mario.*;


/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad5tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cañon c1 = new Cañon(800,850);
        Cañon c2 = new Cañon (550,500);
        c1.disparar(488, 823);
        c1.disparar(678, 345);
        c2.disparar(300, 498);
        c2.disparar(200, 600);
        c2.disparar(123, 889);
        
        
        System.out.println("¿Cuántas veces dispara el cañón1?"); 
        int Cañon1 = new Scanner (System.in).nextInt();
         System.out.println("¿Cuántas veces dispara el cañón2?");
        int Cañon2 = new Scanner (System.in).nextInt();
                
        
        
       
        
        
        
        
        
    }
    
}
