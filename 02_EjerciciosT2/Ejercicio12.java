/*

 */
package actividad12tema2;

import bpc.daw.objetos.*;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class Actividad12tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    MarcadorBaloncesto MB = new MarcadorBaloncesto("Estudiantes","CB Granada");
    
    boolean anota = MB.anotarCanasta('L', 2);
                    MB.anotarCanasta('V', 3);
                    MB.anotarCanasta('L', 2);
                    MB.anotarCanasta('V', 2);
                    MB.anotarCanasta('V', 3);
                    MB.anotarCanasta('L', 1);
                    MB.anotarCanasta('L', 1);
                    MB.anotarCanasta('V', 2);
                    
                    
                    System.out.println(MB.toString());
                    System.out.println("El equipo que va ganando: "+MB.getNombreEquipoGanador());
                    System.out.println("El equipo que va perdiendo: "+MB.getNombreEquipoPerdedor());
        
        
        
        
    }
    
}
