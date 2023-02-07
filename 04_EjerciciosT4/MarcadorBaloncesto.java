/*

 */
package daw.persona;

import java.time.LocalDate;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class MarcadorBaloncesto {
    
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    
    public MarcadorBaloncesto (String nL, String nV){
        
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = LocalDate.now();
    }
    public MarcadorBaloncesto (String nL, String nV, LocalDate f){
        
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = f;
        
    }
    public MarcadorBaloncesto (String nL, int pL, String nVI, int pV, LocalDate fecha){
        
        nombreLocal = nL;
        nombreVisitante = nVI;
        puntosLocal = pL;
        puntosVisitante = pV;
        fecha = fecha;
    }
    
    public LocalDate getFecha(){
        return fecha;
    }
    public int getPuntosLocal(){
        return puntosLocal;
    }
    public int getPuntosVisitante(){
        return puntosVisitante;
    }
    public String getNombreLocal(){
        return nombreLocal;
    }
    public String getNombreVisitante(){
        return nombreVisitante;
    }
    public void MeterCanastaLocal(int ca){
        puntosLocal+=ca;
    }
    public void MeterCanastaVisitante(int ca){
        puntosVisitante+=ca;
    }
    public void CambiarNombreLocal(String nom){
        nombreLocal = nom;
    }
    public void CambiarNombreVisitante(String nom){
        nombreVisitante = nom;
    }
}
