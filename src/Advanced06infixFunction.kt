// Infix Function(중위 함수) //

// 중위 표기법 함수라고도 함
// 이름 그대로 두 변수 중간에 위치하는 함수

fun main() {

    println(6 multiply 4)
    println(6.multiply(4))
//    24
//    24

    // 숫자
    println(10 sum1 20)
    println(10 multi1 10)
    println(30 sum2 50)
//    30
//    100
//    80

    // 문자
    println("pine" sum3 "apple")
    println("ba" sum4 "nana")
//    pineapple
//    banana

    // 리스트
    println(10 showList 20)
//    [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]



}

infix fun Int.multiply(a: Int): Int = this * a

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