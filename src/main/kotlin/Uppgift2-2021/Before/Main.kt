package `Uppgift2-2021`.Before

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

//TODO: Advent of code 2021 dag 2
fun main(){
    val file = Path.of("src/main/kotlin/Uppgift2-2021/Before/MovementInput")
    println(getSubmarineInput(readSubmarineInputsFromFile(file)))
    println(getAdvancedSubmarineInput(readSubmarineInputsFromFile(file)))
}
//här läser jag in filen på ett väldigt omständigt sätt, men behöll det för att se egen progress
fun readSubmarineInputsFromFile(file: Path): List<String> {
    var inputList = listOf("")
    try {
        inputList = Files.readAllLines((file))
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return inputList
}

fun getSubmarineInput(inputList: List<String>): Int{
    var horizontal = 0
    var depth = 0
    //för varje index i listan
    for(i in inputList.indices)
        //när input börjar med "input" -> addera eller subtrahera
        when{
           inputList[i].contains("forward") -> horizontal += separateString(inputList[i])
           inputList[i].contains("down") -> depth += separateString(inputList[i])
           inputList[i].contains("up") -> depth -= separateString(inputList[i])
        }
    return horizontal*depth
}
//funktion för att separera strängarna i listan och få rätt input
fun separateString(string: String): Int{
    val value = string.split(" ")[1].toInt()
    return value
}

fun getAdvancedSubmarineInput(inputList: List<String>): Int{
    var horizontal = 0
    var depth = 0
    var aim = 0
    //samma som innan, men fler additioner och parametrar
    for(i in inputList.indices)
            when{
                inputList[i].contains("down") -> aim += separateString(inputList[i])
                inputList[i].contains("up") -> aim -= separateString(inputList[i])
                inputList[i].contains("forward") -> {
                    horizontal += separateString(inputList[i])
                    depth += aim * separateString(inputList[i])
                }
            }
    return horizontal*depth
}