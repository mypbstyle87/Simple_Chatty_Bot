fun main() {
    val numElement = readLine()!!.toInt()
    var max = 0
    repeat(numElement) {
        val elem = readLine()!!.toInt()
        if (elem % 4 == 0) {
            if (elem >= max) {
                max = elem
            }
        }
    }
    println(max)
}