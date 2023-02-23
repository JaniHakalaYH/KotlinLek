package Uppgift12015.After

import java.io.File


val file = "src/main/kotlin/Uppgift12015/Before/Input"
val stringLista: List<String> = File(file).readLines()

fun readAndCalculateFloorAgain(list: List<String>): Int {
    val string = list[0]
    //fold ackumulerar värdet av varje char baserat på våra inputs i formeln alltså (if next == '(' så +1 annars -1)
    return string.fold(0) { acc, next -> if (next == '(') acc + 1 else acc - 1 }
}

fun calculateBasementAgain(list: List<String>): Int {
    val string = list[0]
    //acc ökar värdet om char är '(' och annars sänker värdet, och när värdet på acc når -1 för första gången på "it" vilket är index man är på så returneras det
    return string.runningFold(0) { acc, next -> if (next == '(') acc + 1 else acc - 1 }.indexOfFirst { it == -1 }
}
fun main(){
    println(readAndCalculateFloorAgain(stringLista))
    println(calculateBasementAgain(stringLista))
}