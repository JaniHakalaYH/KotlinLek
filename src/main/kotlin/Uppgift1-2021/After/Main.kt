package `Uppgift1-2021`.After

import java.io.File

val file = "src/main/kotlin/Uppgift1-2021/Before/DepthInput"
fun getStringListFromFile(file: String): List<Int> = File(file).readLines().map{it.toInt()}

fun main(){
    println(part1(getStringListFromFile(file)))
    println(part2(getStringListFromFile(file)))
}
//här lägger man till zipwithnext för att hela tiden jämföra med nästa tal
fun part1(list: List<Int>): Int = list.zipWithNext().count { it.first < it.second }


//samma här fast med windowed som summerar 3 tal i taget
fun part2(list: List<Int>): Int = list.windowed(3,1){ it.sum() }.zipWithNext().count { it.first < it.second }

