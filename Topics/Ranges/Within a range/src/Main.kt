fun main() {
    val min1 = readLine()!!.toInt()
    val max1 = readLine()!!.toInt()
    val min2 = readLine()!!.toInt()
    val max2 = readLine()!!.toInt()
    val number = readLine()!!.toInt()
    println(number in min1..max1 || number in min2..max2)
}