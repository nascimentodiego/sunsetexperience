package br.com.dfn.app.feature.condominium

import org.junit.Test
import org.junit.Assert.assertEquals

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkClassTest(){
        val myClass = CondomMyClass("sunset", "demo")

        assertEquals(myClass.setup(), "sunset demo")
    }
}