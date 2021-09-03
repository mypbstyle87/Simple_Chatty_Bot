fun main() {
    val number = readLine()!!.toInt()
    val minNum = readLine()!!.toInt()
    val maxNum = readLine()!!.toInt()

    println(number in minNum..maxNum)
}