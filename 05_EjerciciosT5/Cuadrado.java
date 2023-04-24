/*

 */
package FigurasGeométricas;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Cuadrado extends Rectangulo{
    
    //atributo
    private int logitudLado;
    
    //Constructor
    public Cuadrado(Point esi, int longitudLado, Color c) {
        super(esi, new Point(esi.x + longitudLado, esi.y + longitudLado), c);
    }   
}
