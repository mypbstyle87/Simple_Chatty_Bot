fun main() {
    val number = readLine()!!.toInt()
    var total = number % 10
    total += number / 10 % 10
    total += number / 100
    println(total)
}