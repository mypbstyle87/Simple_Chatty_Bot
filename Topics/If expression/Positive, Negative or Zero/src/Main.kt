fun main() {
    val number = readLine()!!.toInt()
    if (number > 0) {
        println("positive")
    } else if (number < 0) {
        println("negative")
    } else {
        println("zero")
    }
}