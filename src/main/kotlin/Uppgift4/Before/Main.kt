package Uppgift4.Before

import java.io.File

//TODO: Advent of code år 2019 uppgift 1

fun main(){
    val file = "src/main/kotlin/Uppgift4/Before/MassInput"
    //calculateFuelInput(file)
    println(calculateFuelAgain(doCalculation(calculateFuelInput(getStringListFromFile(file)))))
}
fun getStringListFromFile(file: String): List<String> = File(file).readLines()

fun calculateFuelInput(list: List<String>): Int{
    val list = list.map { it.toInt() }
    return list.sumOf { (it / 3) - 2 }
}
fun doCalculation(int: Int): Int{
    var calculated = int/3-2
    return calculated
}
fun calculateFuelAgain(int: Int): Int{
    var calculated = int
        return calculated
}



