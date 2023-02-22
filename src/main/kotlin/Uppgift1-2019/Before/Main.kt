package `Uppgift1-2019`.Before

import java.io.File
import java.util.*

//TODO: Advent of code år 2019 uppgift 1

    val file = "src/main/kotlin/Uppgift1-2019/Before/MassInput"
    val intLista: List<Int> = File(file).readLines().map { it.toInt() }
    var sc = Scanner(File("src/main/kotlin/Uppgift1-2019/Before/MassInput"))

    //Del 1 av uppgiften
    fun calculateFuelInput(): Int {
        return intLista.sumOf { (it / 3) - 2 }
    }

    //Del 2 av uppgiften
    fun calculateEachModule(int: Int): Int {
        var tempInt = int
        return (tempInt / 3)-2
    }

    fun calculateFuel():List<Int>{
        var fuel: Int
        var list = mutableListOf<Int>()
        while (sc.hasNextInt()) {
            val mass = sc.nextInt()
            //kalkylerar varje moduls startvärde
            val getfuel = calculateEachModule(mass)
            fuel = getfuel
            //kalkylerar totalen av varje modul genom rekursion och lägger till det i fuel
            fuel += calculateFuelForModules(fuel)
            //lägg till totalvärden i lista
            list.add(fuel)
        }
        //returnerar listan med alla värden
        return list
    }

    //Rekursiv funktion för varje moduls bränsle
    fun calculateFuelForModules(int: Int): Int {

        var totalFuel = 0
        //int här är input läst från textfilen
        var extraFuel = calculateEachModule(int)

        while(extraFuel > 0){
            //extrafuel är varje moduls bränsle räknat flera gånger på bränslet (((bränsle / 3-2) -> /3 -2) -> /3 -2 osv)))
            //sålänge extrafuel är över 0
            //totalfuel är totalen av all extrafuel adderat
            //println(extraFuel)
            totalFuel += extraFuel
            extraFuel = calculateEachModule(extraFuel)
        }
        return totalFuel
    }
    //Kalkylerar värdena i listan till ett slutgiltigt värde
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
