/*

 */
package actividad23tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad23tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        TarjetaCredito tc = new TarjetaCredito (1000,2222);
        System.out.println("El saldo actual de tu tarjeta es: "+tc.getSaldo(2222)+"€");
        
    try{
        tc.ingresarDinero(100);
    }catch(Exception t) {
        System.out.println("Excepcion producida por error en el programa");
    }
    System.out.println("El saldo actual de la tarjeta es de: "+tc.getSaldo(2222)+"€");
    
    try{
        tc.sacarDinero(2800,2222);
    }catch(Exception t) {
        System.out.println("Excepcion producida por error en el program");
    }    
    System.out.println("El saldo actual de la tarjeta es de: "+tc.getSaldo( 2222)+"€");
    
    
    }
    
}
