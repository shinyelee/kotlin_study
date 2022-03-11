// infix function

fun main() {

    // 숫자
    println(10 sum1 20)
    println(10 multi1 10)
    println(30 sum2 50)

    // 문자
    println("pine" sum3 "apple")
    println("ba" sum4 "nana")

}

infix fun String.sum3(abc : String) : String = this + abc
infix fun String.sum4(abc : String) : String {
    return this + abc
}

infix fun Int.sum1(num : Int) : Int = this + num
infix fun Int.multi1(num : Int) : Int = this * num
infix fun Int.sum2(num : Int) : Int {
    return this + num
}