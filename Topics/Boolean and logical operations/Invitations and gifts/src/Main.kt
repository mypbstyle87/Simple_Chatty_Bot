fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val hasGift = readLine().toBoolean() // has Gift or not

    println(invitation && hasGift)
}