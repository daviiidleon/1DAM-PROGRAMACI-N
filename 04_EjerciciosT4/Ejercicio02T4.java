package dl.t2.ejercicio02t4;

import daw.persona.Caja;
/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Ejercicio02T4 {

    public static void main(String[] args) {
        
        Caja c = new Caja(); 
        c.setMensaje("AMUNT VALENCIA!!!!");
        
            System.out.println(c.leerMensaje());
            
        c.abrirCaja();
        System.out.println(c.leerMensaje());
    }
}

