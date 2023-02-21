package Uppgift3.Before

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class MainKtTest {

    val file = "src/main/kotlin/Uppgift3/Before/BinaryInput"
    fun getStringListFromFile(file: String): List<String> = File(file).readLines()
    val testMethod = findGammaAndEpsilon(getStringListFromFile(file))

    @Test
    fun findGammaAndEpsilon() {
        val excpected = 4138664
        assertEquals(excpected, testMethod)
    }
}