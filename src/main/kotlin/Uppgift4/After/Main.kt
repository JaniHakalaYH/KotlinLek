package Uppgift4.After

import java.io.File

    val modules: List<Int> = File(Uppgift4.Before.file).readLines().map { it.toInt() }

    fun solvePart1(): Int =
        modules.sumOf { it.fuel() }

    fun solvePart2(): Int =
        modules.sumOf { it.fuelWithFuel() }

    private fun Int.fuel(): Int = (this / 3) - 2

    private fun Int.fuelWithFuel(): Int =
        if(this < 9)  {
            0
        } else {
            val fuel = this.fuel()
            fuel + fuel.fuelWithFuel()
        }

fun main(){
    println(solvePart1())
    println(solvePart2())
}