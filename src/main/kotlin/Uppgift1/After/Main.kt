package Uppgift1.After

import java.io.File

val file = "src/main/kotlin/Uppgift1/Before/DepthInput"
fun getStringListFromFile(file: String): List<Int> = File(file).readLines().map{it.toInt()}

fun main(){
    println(part1(getStringListFromFile(file)))
    println(part2(getStringListFromFile(file)))
}
fun part1(list: List<Int>): Int = list.zipWithNext().count { it.first < it.second }

fun part2(list: List<Int>): Int = list.windowed(3,1){ it.sum() }.zipWithNext().count { it.first < it.second }

