package `Uppgift3-2021`.Before

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class MainKtTest {

    val file = "src/main/kotlin/Uppgift3-2021/Before/BinaryInput"
    fun getStringListFromFile(file: String): List<String> = File(file).readLines()
    val testMethod = buildStringAndConvertToGamma(getGamma(countOnesInCertainPositionInList(getStringListFromFile(file))))
    val testMethod2 = buildStringAndconvertToEpsilon(getEpsilon(countOnesInCertainPositionInList(getStringListFromFile(file))))

    @Test
    fun findGammaAndEpsilon() {
        val excpected = 4138664
        assertEquals(excpected, testMethod*testMethod2)
    }
}