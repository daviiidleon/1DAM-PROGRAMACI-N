/*

 */
package daw.persona;

import java.time.LocalDate;
import daw.persona.DNI;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Persona {
    
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    public Persona (String n, DNI d, double s, LocalDate fn){
        
        nombre = n;
        dni = d;
        sueldo = s;
        fechaNacimiento = fn;
    }
    
    public Persona (String n, int numDNI, char letraDNI, double s, LocalDate fn){
        
        nombre = n;
        dni = new DNI (numDNI, letraDNI);
        sueldo = s;
        fechaNacimiento = fn;
    }
    
    public Persona (String n, DNI d){
        
        sueldo = 900;
        fechaNacimiento = fechaNacimiento.now().minusYears(20);
    }
    
    public Persona (String n, int numDNI, char letraDNI){
        
        nombre = n;
        dni = new DNI (numDNI, letraDNI);
        sueldo = 900;
        fechaNacimiento = fechaNacimiento.now().minusYears(20);
    }
    
    public void cambiarNombre(String n){
        nombre = n;
    }
    public void cambiarsueldo(int s){
        sueldo = s;
    }
    public String GetNombre(){
        return nombre;
    }
    
    public double GetSueldo(){
        return sueldo;
    }
    public LocalDate GetFecha(){
        return fechaNacimiento;
    }
    
    
}
