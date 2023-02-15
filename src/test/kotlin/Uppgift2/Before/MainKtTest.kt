package Uppgift2.Before

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.io.path.Path

class MainKtTest {

    val testList = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
    val testString = "forward 5"
    val testMethod = separateString(testString)
    val testMethod2 = getSubmarineInput(testList)

    @Test
    fun getSubmarineInputTest() {
        val expected = 150
        val notExpected = 200
        assertEquals(expected, testMethod2)
        assertNotEquals(notExpected, testMethod2)
    }

    @Test
    fun separateStringTest() {
        val expected = 5
        val notExpected = 10
        assertEquals(expected, testMethod)
        assertNotEquals(notExpected, testMethod)
    }
}