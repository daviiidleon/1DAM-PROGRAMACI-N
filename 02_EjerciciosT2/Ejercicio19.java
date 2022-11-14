/*

 */
package actividad19tema2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad19tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe la ruta de un archivo");
        String nombre = new Scanner(System.in).nextLine();
        
        File ruta = new File(nombre);
        
        System.out.println("¿Cuántos bytes ocupa el archivo en el disco duro?: "+ruta.length()+("bytes"));
        System.out.println("¿Cuántos megabytes ocupa el archivo en el disco duro?: "+ ruta.length()*1/1024/1024+("megabytes"));
        
        
        
        
        
        
        
    }
    
}
