fun main() {    
    val firstAnswer = readLine().toBoolean()
    val secondAnswer = readLine().toBoolean()
    val confess = readLine().toBoolean()
    println(!(firstAnswer xor secondAnswer) && !confess)
}