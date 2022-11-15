/*

 */
package actividad22tema2;

import bpc.daw.objetos.*;
import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad22tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        TarjetaCredito tc = new TarjetaCredito (5000,1111);
        System.out.println("El saldo de la tarjeta de crédito es: "+tc.getSaldo(1111)+"€");
        
        try{
            tc.sacarDinero(2000,1111);
        }catch(Exception t) {
                System.out.println("Excepcion producida por error en el programa");
        }
        System.out.println("El saldo de la tarjeta despues de sacar 2000€ es: "+tc.getSaldo(1111)+"€");
        
        
    }
    
}




