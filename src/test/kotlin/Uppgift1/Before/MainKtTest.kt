package Uppgift1.Before

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.io.path.Path

class MainKtTest {
    val testfile = Path("src/test/kotlin/Uppgift1/Before/InputTest")
    val testMethods: Int = readFileLineByLine(testfile)
    val testMethods2: Int = readFileThreeLinesAtATime(testfile)

    @Test
    fun readFileLineByLineTest() {
        val expected = 7
        val notExpected = 5
        assertNotEquals(notExpected, testMethods)
        assertEquals(expected, testMethods)
    }
    @Test
    fun readFileThreeLinesAtATimeTest(){
        val expected = 5
        val notExpected = 7
        assertEquals(expected, testMethods2)
        assertNotEquals(notExpected, testMethods2)
    }
}