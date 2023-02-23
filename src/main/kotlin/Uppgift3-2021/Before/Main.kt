package `Uppgift3-2021`.Before

import java.io.File

//TODO: Advent of code 2021 dag 3, Hann endast med del 1
fun main(){
    val file = "src/main/kotlin/Uppgift3-2021/Before/BinaryInput"
    fun getStringList(file: String): List<String> = File(file).readLines()
    println(buildStringAndConvertToGamma(getGamma(onesInCertainPositionInList(getStringList(file))))*
            buildStringAndconvertToEpsilon(getEpsilon(onesInCertainPositionInList(getStringList(file)))))
}
fun onesInCertainPositionInList(list: List<String>): MutableList<Int>{
    var anotherList = MutableList(list[0].length){0}

    //räknar hur många ettor det finns i varje position i listan och gör en lista av antalen
    for (i in list.indices) {
        for(j in list[i].indices){
            anotherList[j] += list[i][j].toString().toInt()
        }
    }
    return anotherList
}
fun getGamma(list: MutableList<Int>): MutableList<String>{

    var gammaAndEpsilonList = mutableListOf<String>()
    //gör en ny lista med 1or och 0or beroende på om förra listans index hade fler 1or eller 0or
    for(x in list){
        if (x > list.size/2){
            gammaAndEpsilonList.add("1")
        }else gammaAndEpsilonList.add("0")
    }
    return gammaAndEpsilonList
}
fun getEpsilon(list: MutableList<Int>): MutableList<String>{

    var gammaAndEpsilonList = mutableListOf<String>()
    //samma sak som förra fast inverted för att få epsilon
    for(x in list){
        if (x > list.size/2){
            gammaAndEpsilonList.add("0")
        }else gammaAndEpsilonList.add("1")
    }
    return gammaAndEpsilonList
}
//bygg strängarna och översätt från binärt
fun buildStringAndConvertToGamma(list: MutableList<String>): Int{
    val newString = list.joinToString("")
    return newString.toInt(2)
}
fun buildStringAndconvertToEpsilon(list: MutableList<String>): Int{
    val newString = list.joinToString("")
    return newString.toInt(2)
}
