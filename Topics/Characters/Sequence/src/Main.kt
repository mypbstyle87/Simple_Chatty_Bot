fun main() {
    val ch1: Char = readLine()!!.first()
    val ch2: Char = readLine()!!.first()
    val ch3: Char = readLine()!!.first()

    print(ch2 - 1 == ch1 && ch2 + 1 == ch3)
}