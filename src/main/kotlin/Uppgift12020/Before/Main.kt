package Uppgift12020.Before

import java.io.File
import java.util.ListResourceBundle

val file = "src/main/kotlin/Uppgift12020/Before/input"
val intLista: List<Int> = File(file).readLines().map { it.toInt() }

//Del1
fun compareValues(list: List<Int>): Int{
    var value = 0
    for(x in list){
        for(i in list){
            if(x + i == 2020) {
                value = i * x
            }
        }
    }
    //println(value)
    return value
}
fun advancedComparedValues(list: List<Int>): Int{
    var value = 0

    for(x in 0 until list.size-2){
        for(i in 1 until list.size-1)
            for(k in 2 until list.size){
                if(list[x] + list[i] + list[k] == 2020) {
                 value = list[i] * list[x] * list[k]
                }
            }
        }
    println(value)
    return value
}

fun main(){
    compareValues(intLista)
    advancedComparedValues(intLista)
}