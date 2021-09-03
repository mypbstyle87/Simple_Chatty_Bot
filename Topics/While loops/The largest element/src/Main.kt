fun main() {
    var number = readLine()!!.toInt()
    var max = number
    while (number != 0) {
        number = readLine()!!.toInt()
        if (max < number) {
            max = number
        }
    }
    print(max)

}