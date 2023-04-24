/*

 */
package FigurasGeométricas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Rectangulo implements Apoyable, Centrable{
    
    //atributos
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    //constructores
    public Rectangulo(Point esi, Point eid, Color c) {
        this.esquinaSuperiorIzquierda = esi;
        this.esquinaInferiorDerecha = eid;
        this.color = c;
    }

    //métodos abstractos
    @Override
    public int getLongitudBase() {
        return this.getLongitudBase();
    }

    @Override
    public int getLongitudAltura() {
        return this.getLongitudAltura();
    }

    public double getArea() {
        return this.getArea();
    }

    public int getPerimetro() {
        return this.getPerimetro();
    }

    public void dibujar(Graphics g) {
        g.create();
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public Point getCentro() {
        int x = (int)(this.esquinaSuperiorIzquierda.getX() 
                + esquinaInferiorDerecha.getX()) / 2;
        int y = (int)(esquinaSuperiorIzquierda.getY() 
                + esquinaInferiorDerecha.getY()) / 2;
        return new Point(x, y);
    }
    
}





