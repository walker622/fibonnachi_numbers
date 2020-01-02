object Main {

    fun fib(n: Int): Int {
        if (n <= 1)
            return n

        val digit1 = fib(n - 1)
        val digit2 = fib(n - 2)

        return digit1 + digit2
    }

    fun fibDp(n: Int, memo: IntArray): Int {
        if (memo[n - 1] != -1) {
            return memo[n - 1]
        }

        if (n <= 1)
            return n

        memo[n - 1] = fib(n - 1) + fib(n - 2)
        return memo[n - 1]
    }

    fun fibOptimized(n: Int): Int {
        val arr = IntArray(n + 2)
        arr[0] = 0
        arr[1] = 1

        for(i in 2..n) {
            arr[i] = arr[i - 1] + arr[i - 2]
        }

        return arr[n]
    }

    @JvmStatic
    fun main(vararg args: String) {
        var start = System.nanoTime()
        println(fib(30))
        var end = System.nanoTime()
        println("first algo: ${end - start}")

        start = System.nanoTime()
        println(fibDp(30, IntArray(30) {
            -1
        }))
        end = System.nanoTime()
        println("second algo: ${end - start}")

        start = System.nanoTime()
        println(fibOptimized(45))
        end = System.nanoTime()
        println("third algo: ${end - start}")

    }
}