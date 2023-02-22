package `Uppgift2-2021`.After

import java.io.File

fun main() {

    //Ungefär samma lösning som min, men hittade egentligen inte så många med stora skillnader
    //och ville inte bara kolla lösningar från tginsberg

    val file = "src/main/kotlin/Uppgift2-2021/Before/MovementInput"
    val input: List<String> = File(file).readLines()

    fun part1(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0
        val instructions = input.map { it.split(' ') }
        for ((direction, amountString) in instructions) {
            val amount = amountString.toInt()
            when (direction) {
                "forward" -> horizontalPosition += amount
                "up" -> depth -= amount
                "down" -> depth += amount
            }
        }
        return horizontalPosition * depth
    }

    fun part2(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0
        var aim = 0
        val instructions = input.map { it.split(' ') }
        for ((direction, amountString) in instructions) {
            val amount = amountString.toInt()
            when (direction) {
                "forward" -> {
                    horizontalPosition += amount
                    depth += (aim * amount)
                }
                "up" -> aim -= amount
                "down" -> aim += amount
            }
        }
        return horizontalPosition * depth
    }
    println(part1(input))
    println(part2(input))
}