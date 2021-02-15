package solucionandoproblemascomkotlin

// os testes 3 e 5 não passaram
fun main() {
    val n = readLine()!!.toInt()


    for (i in 0 until n) {
        var x = readLine()!!.toDouble()
        isPrime(x)


    }
}

fun isPrime(num: Double) {

    if (num % num == 0.0) {
        if (num == 1.0 || num !== 2.0 && (num % 2.0) == 0.0) {
            print("Not Prime\n")
        } else {
            print("Prime\n")
        }
    }

}


