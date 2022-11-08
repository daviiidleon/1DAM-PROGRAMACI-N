/*              

 */
package Actividad4tema2;

import bpc.daw.mario.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad4tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Luigi l = new Luigi (550,500);
        Mario m = new Mario (500,500);
        double distancia = l.getDistanciaOrigen(); 
        double distancia2 = m.getDistanciaOrigen();
        System.out.println("El muñeco de Luigi está a distancia "+distancia);
        System.out.println("El muñeco de Mario está a distancia "+distancia2);
        
    }
    
}