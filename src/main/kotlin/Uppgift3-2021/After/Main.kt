package `Uppgift3-2021`.After

import java.io.File

fun main(){
    val file = "src/main/kotlin/Uppgift3-2021/Before/BinaryInput"
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

    println("$gammaRate and $epsilonRate")
    println(gammaRate*epsilonRate)
    return gammaRate * epsilonRate
}