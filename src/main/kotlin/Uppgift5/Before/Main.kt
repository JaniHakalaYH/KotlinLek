package Uppgift5.Before

import java.io.File

//TODO: Advent of code 2018 dag 1
fun main(){
    val file = "src/main/kotlin/Uppgift5/Before/FrequencyInput"
    val list: List<Int> = File("src/main/kotlin/Uppgift5/Before/FrequencyInput").readLines().map{it.toInt()}
    println(calculateFrequency(list))
}
fun calculateFrequency(list: List<Int>): Int{ //Del 1
    return list.sumOf { it }
}

