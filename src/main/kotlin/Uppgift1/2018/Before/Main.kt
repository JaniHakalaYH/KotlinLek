package Uppgift1.`2018`.Before

import java.io.File

//TODO: Advent of code 2018 dag 1
fun main(){
    val list: List<Int> = File("src/main/kotlin/Uppgift1/2018/Before/FrequencyInput").readLines().map{it.toInt()}
    println(calculateFrequency(list))
}
fun calculateFrequency(list: List<Int>): Int{ //Del 1
    return list.sumOf { it }
}
//Gjorde ingen after eftersom den hade sett likadan ut, hann inte med del 2

