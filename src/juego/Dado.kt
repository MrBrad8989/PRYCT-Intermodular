package juego

import kotlin.random.Random
/*
* @author Remus Sabou
*/
class Dado {
    /**
     * Lanza el dado.
     * @return un número entero entre 1 y 6.
     */
    fun lanzar(): Int {
        // Genera un número entre 1 y 6 (ambos incluidos)
        return Random.nextInt(1, 7)
    }
}