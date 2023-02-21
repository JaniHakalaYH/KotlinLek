package Uppgift5.Before

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.io.File

class MainKtTestFrequency {

    val list: List<Int> = File("src/test/kotlin/Uppgift5/Before/TestInput").readLines().map{it.toInt()}
    val testMethod = calculateFrequency(list)

    @Test
    fun calculateFrequency() {
        val expected = 8
        assertEquals(expected, testMethod)
    }
}



