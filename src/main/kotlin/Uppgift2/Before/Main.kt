package Uppgift2.Before

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

//TODO: Advent of code 2021 dag 2
fun main(){
    val file = Path.of("src/main/kotlin/Uppgift2/Before/MovementInput")
    getSubmarineInput(readSubmarineInputsFromFile(file))
    getAdvancedSubmarineInput(readSubmarineInputsFromFile(file))
}

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
    for(i in inputList.indices)
        when{
           inputList[i].contains("forward") -> horizontal += separateString(inputList[i])
           inputList[i].contains("down") -> depth += separateString(inputList[i])
           inputList[i].contains("up") -> depth -= separateString(inputList[i])
        }
    return horizontal*depth
}

fun separateString(string: String): Int{
    val value = string.split(" ")[1].toInt()
    return value
}

fun getAdvancedSubmarineInput(inputList: List<String>): Int{
    var horizontal = 0
    var depth = 0
    var aim = 0
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