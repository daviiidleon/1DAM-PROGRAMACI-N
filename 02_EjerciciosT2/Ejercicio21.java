/*

 */
package actividad21tema2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad21tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce la ruta de un directorio");
        String directorio = new Scanner(System.in).nextLine();
        
        File ruta = new File(directorio);
        
        if(ruta.isDirectory()){
            File lista[] = ruta.listFiles();
            System.out.println("Total archivo y carpetas "+lista.length);
        }else{
            System.out.println("Error, no es un directorio");
        }   
    }
    
}
