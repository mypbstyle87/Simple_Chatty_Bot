fun main() {
    val testNumber = readLine()!!.toInt()
    var largerNum = 0
    var smallerNum = 0
    var perfectNum = 0

    repeat(testNumber) {
        val size = readLine()!!.toInt()
        if (size == 1) {
            largerNum++
        } else if (size == 0) {
            perfectNum++
        } else smallerNum++
    }
    print("$perfectNum $largerNum $smallerNum")
}