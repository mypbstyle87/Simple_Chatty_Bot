fun main() {
    val str = readLine()!!
    val number = str.length
    print("$number repetitions of the word $str: ")
    repeat(number) {
        print(str)
    }
}