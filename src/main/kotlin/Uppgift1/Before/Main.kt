package Uppgift1.Before

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Scanner

fun main() {
    val file = Path.of("src/main/kotlin/Uppgift1/Before/DepthInput")
    readFileLineByLine(file)
    readFileThreeLinesAtATime(file)
}

fun readFileLineByLine(file: Path): Int{

    var counter = 0
    var tempLine = 0
    try{
        val sc = Scanner(file)
        while(sc.hasNextInt()){
            val line = sc.nextInt()
                 if(tempLine < line){
                    counter++
                 }
            tempLine = line
        }
        counter--
        println(counter)

    }catch (e: IOException){
        e.printStackTrace()
    }
    return counter
}
fun readFileThreeLinesAtATime(fileName: Path): Int{
    var counter = 0

    try {
        val list = Files.readAllLines((fileName))
        val intList = list.map { it.toInt() }
        val newlist = intList.windowed(3, 1) { it.sum() }
        repeat(newlist.size - 1) {
            if (newlist.get(it) < newlist.get(it + 1)) {
                counter++
            }
        }
        println(counter)
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return counter
}



