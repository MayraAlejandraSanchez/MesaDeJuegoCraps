/*Nombre: Mayra alejandra Sanchez Salinas
 * Codigo: 202040506
 * Email: mayra.alejandra.sanchez@correounivalle.edu.co
 * Programación orientado a eventos*/

package juegoCraps;

import java.util.Random;

/**
 * Clase Dado genera un valor random entre 1 y 6
 * @author Mayra Alejandra Sanchez Salinas 202040506
 * @version 1.0.0 fecha 30/11/2021
 */
public class Dado {
    private int cara;

    /**
     * Metodo que genera el numero aleatorio entre 1 y 6 para la cara del dado
     * @return
     */
    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
