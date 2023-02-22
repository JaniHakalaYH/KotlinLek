package Uppgift4.Before

import java.io.File
import java.util.*

//TODO: Advent of code år 2019 uppgift 1

    val file = "src/main/kotlin/Uppgift4/Before/MassInput"
    val intLista: List<Int> = File(file).readLines().map { it.toInt() }
    var sc = Scanner(File("src/main/kotlin/Uppgift4/Before/MassInput"))

    fun calculateFuelInput(): Int {
        return intLista.sumOf { (it / 3) - 2 }
    }

    fun calculateEachModule(int: Int): Int {
        var tempInt = int
        return (tempInt / 3)-2
    }

    fun calculateFuel():List<Int>{
        var fuel = 0
        var list = mutableListOf<Int>()
        while (sc.hasNextInt()) {
            val mass = sc.nextInt()
            val getfuel = calculateEachModule(mass)
            fuel = getfuel
            fuel += calculateFuelForModules(fuel)
            list.add(fuel)
        }
        //returnerar listan med alla värden
        return list
    }

    fun calculateFuelForModules(int: Int): Int {

        var totalFuel = 0
        var extraFuel = calculateEachModule(int)

        while(extraFuel > 0){
            totalFuel += extraFuel
            extraFuel = calculateEachModule(extraFuel)

        }
        return totalFuel
    }
    //Kalkylerar värdena i listan
    fun addList(list: List<Int>): Int{
        var num = 0
        for (i in list){
            num += i
        }
        return num
    }

fun main(){
    println(calculateFuelInput())
    println(addList(calculateFuel()))
}
