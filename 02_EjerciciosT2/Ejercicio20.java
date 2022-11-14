/*

 */
package actividad20tema2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad20tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribre la ruta de un archivo del disco duro");
        String nombre = new Scanner(System.in).nextLine();
        
        File ruta = new File (nombre);
        
        if (ruta.exists()&& ruta.isDirectory()) {
            System.out.println("La ruta introducida corresponde a un directorio");
        }else{
            if (ruta.exists()&& ruta.isFile()){
                System.out.println("La ruta introducida es un archivo de tamaño "+ruta.length()+"bytes");
                System.out.println("¿Desea borrarló? (si/no)");
                String comprobación = new Scanner(System.in).nextLine();
                if (comprobación.equals("si")) {
                    ruta.delete();
                    if(ruta.delete()) {
                        System.out.println("Hubo un error, el archivo no se pudo borrar");
                    }else{
                        System.out.println("El archivo se ha borrado correctamente");
                    }
                }else{
                    System.out.println("El borrado ha sido cancelado");
                }
            }
        }
        
        
        
    }
    
}
