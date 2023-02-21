package Uppgift4.Before

import java.io.File

//TODO: Advent of code år 2019 uppgift 1

fun main(){
    val file = "src/main/kotlin/Uppgift4/Before/MassInput"
    println(calculateFuelInput(getStringListFromFile(file)))

}
fun getStringListFromFile(file: String): List<String> = File(file).readLines()

fun calculateFuelInput(list: List<String>): Long{
    val list = list.map { it.toInt() }
    return list.sumOf { (it / 3) - 2 }.toLong()
}

/*fun calculateFuelInputForAllModules(long: Long): Long {

    return
}
*/


