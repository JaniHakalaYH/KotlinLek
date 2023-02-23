package Uppgift12020.After

import Uppgift12020.Before.advancedComparedValues
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class MainKtTest {

    val file = "src/test/kotlin/Uppgift12020/Before/testInput"
    val intLista: List<Int> = File(file).readLines().map { it.toInt() }
    val testMethod = compareValuesAgain(intLista)
    val testMethod2 = advancedCompareValuesAgain(intLista)

    @Test
    fun compareValuesAgain() {
        val expected = 514579
        assertEquals(expected, testMethod)
    }

    @Test
    fun advancedCompareValuesAgain() {
        val expected = 241861950
        assertEquals(expected, testMethod2)
    }
}