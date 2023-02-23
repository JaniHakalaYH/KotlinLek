package Uppgift12015.Before

import java.io.File

val file = "src/main/kotlin/Uppgift12015/Before/Input"
val stringLista: List<String> = File(file).readLines()

fun readAndCalculateFloor(list: List<String>): Int {

    var floor = 0

    for(element in list){
        if(element == "("){
            floor++
        }else{
            floor--
        }
    }
    println(floor)
    return floor
}

fun main(){
    readAndCalculateFloor(stringLista)
}