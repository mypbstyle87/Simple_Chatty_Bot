fun main() {
    var count = 0
    var number = readLine()!!.toInt()
    while (number != 0) {
        count++
        number = readLine()!!.toInt()
    }
    print(count)

}