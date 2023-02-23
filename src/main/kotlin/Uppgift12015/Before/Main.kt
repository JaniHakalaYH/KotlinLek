package Uppgift12015.Before

import java.io.File

val file = "src/main/kotlin/Uppgift12015/Before/Input"
val stringLista: List<String> = File(file).readLines()

fun readAndCalculateFloor(list: List<String>): Int {

    var floor = 0

    for(element in list) {
        for (x in element) {
            if (x == '(') {
                floor++
            } else {
                floor--
            }
        }
    }
    println(floor)
    return floor
}
fun calculateBasement(list: List<String>): Int{
    var floor = 0
    var pos = 1
    var hitBasement = false

    for(element in list) {
        for (x in element) {
            if (x == '(')
                floor++
            else
                floor--
            if(!hitBasement){
                if(floor == -1){
                    return pos
                }
                pos++
            }
        }
    }
    return -1
}
fun main(){
    readAndCalculateFloor(stringLista)
    println(calculateBasement(stringLista))
}