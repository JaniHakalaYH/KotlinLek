package Uppgift3.Before

import java.io.File
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import javax.swing.plaf.ListUI

fun main(){
    val file = "src/main/kotlin/Uppgift3/Before/BinaryInput"
    fun getStringListFromFile(file: String): List<String> = File(file).readLines()
    findGamma(getStringListFromFile(file))
}
fun findGamma(list: List<String>){
    for (i in list.indices){
        val newlist = list.get(i).toList()

    }
}

fun findEpsilon(list: List<String>){
}