object Main {

    fun fib(n: Int): Int {
        if(n <= 1)
            return n

        val digit1 = fib(n - 1)
        val digit2 = fib(n - 2)

        return digit1 + digit2
    }

    @JvmStatic
    fun main(vararg args: String) {
        println(fib(5))
    }
}