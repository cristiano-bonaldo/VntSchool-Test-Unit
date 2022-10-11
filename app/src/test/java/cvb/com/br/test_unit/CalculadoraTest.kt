package cvb.com.br.test_unit

import org.junit.Assert
import org.junit.Testet

class CalculadoraTest {

    val calc = Calculadora()

    @Test
    fun `multiplicar 5 vezes 5 = 25`() {
        val expected = 25

        val value = calc.multiplicar(5,5)

        Assert.assertEquals(expected,  value)
    }

    @Test
    fun `multiplicar -5 vezes 5 = -25`() {
        val expected = -25

        val value = calc.multiplicar(-5,5)

        Assert.assertEquals(expected,  value)
    }

    @Test
    fun `multiplicar -5 vezes -5 = -25`() {
        val expected = 25

        val value = calc.multiplicar(-5,-5)

        Assert.assertEquals(expected,  value)
    }

    @Test
    fun `multiplicar 0 vezes 5 = 0`() {
        val expected = 0

        val value = calc.multiplicar(0,5)

        Assert.assertEquals(expected,  value)
    }

    //=============================

    @Test
    fun `adicao 5 mais 5 = 10`() {
        val expected = 10

        val value = calc.somar(5,5)

        Assert.assertEquals(expected, value)
    }

    @Test
    fun `adicao 5 mais -5 = 0`() {
        val expected = 0

        val value = calc.somar(5,-5)

        Assert.assertEquals(expected, value)
    }

    @Test
    fun `adicao -5 mais -5 = 0`() {
        val expected = -10

        val value = calc.somar(-5,-5)

        Assert.assertEquals(expected, value)
    }

    //=============================

    @Test
    fun `subtracao 25 menos 5 = 20`() {
        val expected = 20

        val value = calc.subtrair(25,5)

        Assert.assertEquals(expected, value)
    }

    @Test
    fun `subtracao 5 menos -25 = 30`() {
        val expected = 30

        val value = calc.subtrair(5,-25)

        Assert.assertEquals(expected, value)
    }

    //=============================

    @Test
    fun `test if the number 2 is odd`() {
        val expected = true
        val result = calc.isOdd(2)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun `test if the number 1 is odd`() {
        val expected = false
        val result = calc.isOdd(1)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun `test if the number 2 is even`() {
        val expected = false
        val result = calc.isOdd(1)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun `test if the number 1 is even`() {
        val expected = true
        val result = calc.isEven(1)
        Assert.assertEquals(expected, result)
    }

    //=============================

    @Test
    fun `test if the number 13 is prime`() {
        val expected = true
        val result = calc.isPrime(13)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun `test if the number 14 is prime`() {
        val expected = false
        val result = calc.isPrime(14)
        Assert.assertEquals(expected, result)
    }


}