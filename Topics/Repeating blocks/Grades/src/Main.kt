fun main() {
    val number = readLine()!!.toInt()
    var sumD = 0
    var sumC = 0
    var sumB = 0
    var sumA = 0

    repeat(number) {
        val score = readLine()!!.toInt()
        if (score == 2) sumD++
        if (score == 3) sumC++
        if (score == 4) sumB++
        if (score == 5) sumA++
    }
    print("$sumD $sumC $sumB $sumA")
}