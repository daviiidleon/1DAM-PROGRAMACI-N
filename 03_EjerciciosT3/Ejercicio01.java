/*

 */
package javaapplication97;

import java.util.Scanner;

/**
 *
 * @author David <daviiidleongutierrez@gmail.com>
 */
public class JavaApplication97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        
        System.out.println("Selecciona una de las siguientes opciones");
        System.out.println("1. Valencia.mp3");
        System.out.println("2. Madrid.mp3");
        System.out.println("3. Granada.mp3");
        System.out.println("4. Málaga.mp3");
        System.out.println("5. Barcelona.mp3");
        
        opcion= new Scanner(System.in).nextInt();
        
        switch(opcion){
            case 1:
                reproducirSonido("Valencia.mp3");
                break;
            case 2:
                reproducirSonido("Madrid.mp3");
                break;
            case 3:
                reproducirSonido("Granada.mp3");
                break;
            case 4:
                reproducirSonido("Málaga.mp3");
                break;
            case 5:
                reproducirSonido("Barcelona.mp3");
                break;
            default:
                System.out.println("ERROR");
                
        }
       
            
    }
    
}
