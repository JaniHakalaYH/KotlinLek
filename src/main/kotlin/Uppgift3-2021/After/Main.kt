package `Uppgift3-2021`.After

import java.io.File

fun main(){
    val file = "src/main/kotlin/Uppgift3-2021/Before/BinaryInput"
    fun getStringListFromFile(file: String): List<String> = File(file).readLines()
    findGammaAndEpsilon(getStringListFromFile(file))
}
fun findGammaAndEpsilon(list: List<String>): Int{

    //gör om input till en lista med listor som innehåller 1or och 0or som index
    val newList: List<List<Int>> = list.map{newList -> newList.split("").filter { it.isNotBlank() }.map{ it.toInt() }}
    val gammaList: MutableList<Int> = mutableListOf()

    //kollar om innehåller flest 1or eller 0or och därefter lägger till 1a eller 0a i ny lista
    for(i: Int in newList.first().indices){
        val gamma: Int = if ((newList.sumOf { it[i] } / newList.count().toDouble()) >= 0.5) 1 else 0
        gammaList.add(gamma)
    }

    //funktion för att byta alla 1or till 0or och vise versa
    val epsilon: List<Int> = gammaList.map{it.xor(1)}

    //gör om från binärt till decimalt
    val epsilonRate = epsilon.joinToString("").toInt(2)
    val gammaRate = (gammaList.joinToString("").toInt(2))

    println("$gammaRate and $epsilonRate")
    println(gammaRate*epsilonRate)
    return gammaRate * epsilonRate
}