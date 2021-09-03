fun main() {
    val num1 = readLine()!!.toLong()
    val num2 = readLine()!!.toLong()
    var product = 1L
    for (i in num1 until num2) {
        product *= i
    }
    print(product)
}