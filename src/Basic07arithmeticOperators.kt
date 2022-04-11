// calculator

// calculator

fun main() {
    sumTwo(2, 5)
    sumThree(2, 4, 6)
    minus(30, 20)
    division(10, 3)
    remainder(10, 3)
}

fun sumTwo(num1 : Int, num2 : Int) {
    println(num1 + num2)
}
//    7

fun sumThree(num1 : Int, num2 : Int, num3 : Int) {
    println(num1 + num2 + num3)
}
//    12

fun minus(num1 : Int, num2 : Int) {
    println(num1 - num2)
}
//    10

fun division(num1 : Int, num2 : Int) {
    println(num1 / num2) // 몫
}
//    3

fun remainder(num1 : Int, num2 : Int) {
    println(num1 % num2) // 나머지
}
//    1