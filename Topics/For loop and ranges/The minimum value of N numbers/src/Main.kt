fun main() {
    val number = readLine()!!.toInt()
    var numberN = readLine()!!.toInt()

    repeat(number - 1) {
        val temp = readLine()!!.toInt()
        if (numberN > temp) {
            numberN = temp
        }
    }
    println(numberN)
}