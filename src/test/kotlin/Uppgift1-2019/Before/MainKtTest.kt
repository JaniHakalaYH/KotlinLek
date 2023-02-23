package `Uppgift1-2019`.Before

import org.junit.jupiter.api.Test

class MainKtTest {

    private val testinput = 118868
    private val testMethod = calculateEachModule(testinput)
    private val testMethod2 = calculateFuelForModules(testinput)

    @Test
    fun calculateEachModule() {
        val expected = 39620
        assert(expected == testMethod)
    }

    @Test
    fun calculateFuelForModules() {
        val expected = 59402
        assert(expected == testMethod2)
    }
}