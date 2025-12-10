package com.refork

import juego.Dado

fun main() {
    println("🎲 Iniciando prueba del componente: DADO")

    val miDado = Dado()

    // Hacemos 5 tiradas de prueba con un bucle simple
    for (i in 1..5) {
        val resultado = miDado.lanzar()
        println("Tirada $i: $resultado")

        // Verificación simple
        if (resultado !in 1..6) {
            System.err.println(" ERROR CRÍTICO: Valor imposible: $resultado")
        }
    }

    println("Prueba visual finalizada.")
}