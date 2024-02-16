package aplicacion;
import mates.Matematicas;

/**
 * Clase principal de la aplicación.
 */
public class Principal {
    /**
    * Método principal de la aplicación.
    * @param args Argumentos pasados por línea de comandos.
    */
public static void main(String[] args){
    // Comprobar que se ha pasado un argumento.
    System.out.println("El número PI es " +
        Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
    }

}