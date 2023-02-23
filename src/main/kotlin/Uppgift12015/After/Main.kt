package Uppgift12015.After

import java.io.File


val file = "src/main/kotlin/Uppgift12015/Before/Input"
val stringLista: List<String> = File(file).readLines()

fun readAndCalculateFloorAgain(list: List<String>): Int {
    var floor = 0

    for(x in list.indices)
        when{
            list[x] == "(" -> floor += 1
            list[x] == ")" -> floor -= 1
            }
    println(floor)
    return floor
    }

fun main(){
    readAndCalculateFloorAgain(stringLista)
}