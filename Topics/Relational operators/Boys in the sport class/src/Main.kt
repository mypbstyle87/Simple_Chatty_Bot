fun main() {
    val height1 = readLine()!!.toInt()
    val height2 = readLine()!!.toInt()
    val height3 = readLine()!!.toInt()

    if (height1 > height3) {
        println(height2 in height3..height1)
    } else println(height2 in height1..height3)
}