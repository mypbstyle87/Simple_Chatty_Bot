fun main() {
    val ch = readLine()!!.first()
    println(ch.isDigit() && ch != '0' || ch.isUpperCase())
}