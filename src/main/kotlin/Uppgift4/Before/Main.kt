package Uppgift4.Before

import java.io.File

//TODO: Advent of code år 2019 uppgift 1


    val file = "src/main/kotlin/Uppgift4/Before/MassInput"
    val intLista: List<Int> = File(file).readLines().map { it.toInt() }

    fun calculateFuelInput(): Int {
        return intLista.sumOf { (it / 3) - 2 }
    }


    fun calculateFuelInputForAllModules(int: Int): Int {
        var summering = 0
        for(x in intLista)
            if ((intLista[x] / 3)-2 <= 0) {
                        0
            }else{
                summering += x
                calculateFuelInputForAllModules(x)
        }
        return summering
    }

fun main(){
    println(calculateFuelInput())
    println(calculateFuelInputForAllModules(calculateFuelInput()))
}
