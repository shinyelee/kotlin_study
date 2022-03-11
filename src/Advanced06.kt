// infix function

fun main() {

    // 숫자
    println(10 sum1 20)
    println(10 multi1 10)
    println(30 sum2 50)

    // 문자
    println("pine" sum3 "apple")
    println("ba" sum4 "nana")

    // 리스트
    println(10 showList 20)

}

infix fun Int.showList(num : Int) : List<Int> {
    val list = mutableListOf<Int>()
    for (i in this..num) {
        list.add(i)
    }
    // println(this)
    return list
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