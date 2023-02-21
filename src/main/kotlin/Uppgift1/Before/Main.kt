package Uppgift1.Before

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

//TODO: Uppgift 1 från 2021 års advent of code
fun main() {
    val file = Path.of("src/main/kotlin/Uppgift1/Before/DepthInput")
    readFileLineByLine(file)
    readFileThreeLinesAtATime(file)
}
fun readFileLineByLine(fileName: Path): Int {
    var counter = 0
    val list = Files.readAllLines((fileName)).map { it.toInt() }
    repeat(list.size -1) {
        if (list[it] < list[it + 1]) {
            counter++
        }
    }
    return counter
}
fun readFileThreeLinesAtATime(fileName: Path): Int {
    var counter = 0

    try {
        val intList = Files.readAllLines((fileName)).map { it.toInt() }
        val newlist = intList.windowed(3, 1) { it.sum() }
            repeat(newlist.size - 1) {
                if (newlist[it] < newlist[it + 1]) {
                    counter++
                }
            }
        }catch (e: IOException) {
            e.printStackTrace()
        }
    return counter
}






