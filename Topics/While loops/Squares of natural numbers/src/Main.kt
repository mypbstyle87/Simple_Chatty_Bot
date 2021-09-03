fun main() {
    val lastNum = readLine()!!.toInt()
    var naturalNumber = 1

    while (naturalNumber * naturalNumber <= lastNum) {
        println(naturalNumber * naturalNumber)
        naturalNumber++
    }
}