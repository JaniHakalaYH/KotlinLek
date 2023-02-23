package `Uppgift1-2019`.After

import java.io.File

    val modules: List<Int> = File(`Uppgift1-2019`.Before.file).readLines().map { it.toInt() }

    fun solvePart1(): Int =
        modules.sumOf { it.fuel() }

    fun solvePart2(): Int =
        modules.sumOf { it.fuelWithFuel() }

    //extension function för utträkning som kan återanvändas
    private fun Int.fuel(): Int = (this / 3) - 2

    //rekursionen ginsberg använder sig av
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