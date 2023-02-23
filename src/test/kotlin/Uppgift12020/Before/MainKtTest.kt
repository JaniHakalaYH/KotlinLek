package Uppgift12020.Before

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class MainKtTest {

    val file = "src/test/kotlin/Uppgift12020/Before/testInput"
    val intLista: List<Int> = File(file).readLines().map { it.toInt() }
    val testMethod = compareValues(intLista)
    val testMethod2 = advancedComparedValues(intLista)

    @Test
    fun compareValues() {
        val expected = 514579
        assertEquals(expected, testMethod)
    }

    @Test
    fun advancedComparedValues() {
        val expected = 241861950
        assertEquals(expected, testMethod2)
    }
}