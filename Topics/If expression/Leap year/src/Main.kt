fun main() {
    val year = readLine()!!.toInt()
    if (year % 400 == 0) {
        print("Leap")
    } else if (year % 100 == 0) {
        print("Regular")
    } else if (year % 4 == 0) {
        print("Leap")
    } else {
        println("Regular")
    }
//    fun main() {
//        val year = readLine()!!.toInt()
//        println(
//            if (year % 400 == 0) {
//                "Leap"
//            } else if (year % 100 == 0) {
//                "Regular"
//            } else if (year % 4 == 0) {
//                "Leap"
//            } else {
//                "Regular"
//            }
//        )
//    }
}