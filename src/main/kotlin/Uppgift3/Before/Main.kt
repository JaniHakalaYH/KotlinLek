package Uppgift3.Before

import java.io.File
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import javax.swing.plaf.ListUI

//TODO: Advent of code 2021 dag 3, del 2 verkar väldigt komplicerad
fun main(){
    val file = "src/main/kotlin/Uppgift3/Before/BinaryInput"
    fun getStringListFromFile(file: String): List<String> = File(file).readLines()
    findGammaAndEpsilon(getStringListFromFile(file))
}

fun findGammaAndEpsilon(list: List<String>): Int{

    val newList: List<List<Int>> = list.map{newList -> newList.split("").filter { it.isNotBlank() }.map{ it.toInt() }}
    val gammaList: MutableList<Int> = mutableListOf()

    for(i: Int in newList.first().indices){
        val gamma: Int = if ((newList.sumOf { it[i] } / newList.count().toDouble()) >= 0.5) 1 else 0
        gammaList.add(gamma)
    }
    val epsilon: List<Int> = gammaList.map{it.xor(1)}
    val epsilonRate = epsilon.joinToString("").toInt(2)
    val gammaRate = (gammaList.joinToString("").toInt(2))

    println(gammaRate*epsilonRate)
    return gammaRate * epsilonRate
}

