package Uppgift12015.Before

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class MainKtTest {

    val file = "src/main/kotlin/Uppgift1-2019/Before/MassInput"
    val input: List<String> = File(file).readLines()
    val testMethod = readAndCalculateFloor(input)

    @Test
    fun readAndCalculateFloor() {
        val expected = -100
        assertEquals(expected,testMethod)
    }
}