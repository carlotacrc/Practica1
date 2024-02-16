package mates;
/**
 * Clase con métodos matemáticos.
 */
public class Matematicas {
    /**
     * Genera una aproximación de pi mediante el método de Monte Carlo.
     * @param pasos Número de pasos a realizar.
     * @return Aproximación de pi.
     */
public static double generarNumeroPiIterativo(long pasos){
    // Contador de puntos dentro del círculo.
    long dentroCirculo = 0;
    // Generar puntos aleatorios y contar cuántos caen dentro del círculo.
    for (long i = 0; i < pasos; i++){
        double x = Math.random();
        double y = Math.random();
        // Si el punto está dentro del círculo, incrementar el contador.
        if (x * x + y * y <= 1){
            dentroCirculo++;
        }
    }
    // Devolver la aproximación de pi.
    return 4.0 * dentroCirculo / pasos;
    }
}