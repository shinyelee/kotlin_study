// Infix Function(중위 함수) //

// Infix notation(중위 표기법)이라고도 함
// 이름 그대로 두 변수 "중"간에 "위"치하는 "함수"

fun main() {

    // 중위 함수의 조건 //

    // 1. 멤버 함수 또는 확장 함수
    // 2. 단일 매개 변수
    // 3. 매개 변수가 가변 인자를 허용하지 않음
    // 4. 매개 변수가 기본값을 갖지 않음
    // 5. this 생략 불가능



    println(6 multiply 4)
//    24

    println(6.multiply(4))
//    24



    // 숫자

    println(10 sum1 20)
//    30

    println(10 multi1 10)
//    100

    println(30 sum2 50)
//    80



    // 문자

    println("pine" sum3 "apple")
//    pineapple

    println("ba" sum4 "nana")
//    banana



    // 리스트

    println(10 showList 20)
//    [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]



    // 중위 함수의 우선 순위 //

    // 1. 산술 연산, 형 변환, rangeTo
    // 2. 중위 함수
    // 3. 논리 연산

    // 산술 연산, 형 변환, rangeTo가 중위 함수보다 우선하는 예시
    // 1 shl 2 + 3 == 1 shl (2 + 3)
    // 0 until n * 2 == 0 until (n * 2)
    // xs uniton ys as Set<*> == xs union (us as Set<*>)

    // 중위 함수가 논리 연산보다 우선하는 예시
    // a && b xor c == a && (b xor c)
    // a xor b in c == (a xor b) in c

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