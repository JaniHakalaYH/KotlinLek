package Uppgift3.Before

import java.io.File
import java.nio.file.Files
import java.nio.file.Path

fun main(){
    val file = Path.of("src/main/kotlin/Uppgift3/Before/BinaryInput")

}
fun findGammaAndEpsilon(fileName: Path){
    val list = Files.readAllLines((fileName)).map { it.toDouble() }.forEach()
    //list.forEach
}