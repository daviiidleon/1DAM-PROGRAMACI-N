/*

 */

package dl.t2.ejercicio01t4;
import daw.persona.DNI;
import daw.persona.Persona;
import java.time.LocalDate;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Ejercicio01T4 {

    public static void main(String[] args) {
        
        DNI d = new DNI ("74541305F");
        LocalDate fn = LocalDate.now();
        
        System.out.println(d.GetNumero());
        System.out.println(d.GetLetra());
        System.out.println(fn.getYear());
        
        
    }
}
