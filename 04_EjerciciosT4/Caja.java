/*

 */
package daw.persona;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Caja {

    private boolean abierto;
    private String mensaje;
    
    
    public Caja (String m){
    
        mensaje = m;
        abierto = false;
    }
    
    public Caja (boolean a, String m){
    
        abierto = a;
        mensaje = m;
    }
    
    public Caja (){
    
        abierto = false;
        mensaje="Viva el tema 7";
    }
    
    public void abrirCaja(){
        
        abierto = true;
    }
    public void cerrarCaja(){
        
        abierto = false;
    }
    
    public String leerMensaje(){
        if(abierto) {
            return  mensaje;
        } else {
            return mensaje; }
    }
    
    public void setMensaje(String m){
        mensaje = m;
    };
}
