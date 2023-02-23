package Uppgift12020.After

import java.io.File

val file = "src/main/kotlin/Uppgift12020/Before/input"
val intLista: List<Int> = File(file).readLines().map { it.toInt() }

fun compareValuesAgain(list: List<Int>): Int{
    val newList = mutableListOf<Int>()

    for(i in list.indices){
        for(j in i+1 until list.size){
            val value = list[i] + list[j]
                if(value == 2020){
                    newList.add(list[i])
                    newList.add(list[j])
                }
        }
    }
    return newList[0]*newList[1]
}

fun advancedCompareValuesAgain(list: List<Int>): Int{
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
    println(compareValuesAgain(intLista))
}