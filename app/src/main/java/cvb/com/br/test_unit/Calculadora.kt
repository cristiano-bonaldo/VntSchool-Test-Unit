package cvb.com.br.test_unit

class Calculadora {

    fun somar(v1: Int, v2:Int): Int = v1 + v2

    fun subtrair(v1: Int, v2:Int): Int = v1 - v2

    fun multiplicar(v1: Int, v2:Int): Int = v1 * v2

    fun dividir(v1: Int, v2:Int): Int = v1 / v2

    fun isOdd(number: Int): Boolean {
        return number % 2 == 0
    }

    fun isEven(number: Int): Boolean {
        return number % 2 != 0
    }

    fun isPrime(number: Int): Boolean {

        var flag = true
        for (i in 2..number / 2) {
            // condition for nonprime number
            if (number % i == 0) {
                flag = false
            }
        }
        return flag
    }
}