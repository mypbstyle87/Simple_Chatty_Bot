fun main() {    
    val minTime = readLine()!!.toInt()
    val maxTime = readLine()!!.toInt()
    val sleepTime = readLine()!!.toInt()
    if (sleepTime < minTime) {
        println("Deficiency")
    } else if (sleepTime <= maxTime) {
        println("Normal")
    } else {
        println("Excess")
    }
}