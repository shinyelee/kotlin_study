// Functions(함수) //

// 특정한 동작이나 결과값 연산에 사용
// 함수 생성시 함수명 앞에 fun을 붙임

fun main() {

    // 문자열 출력하는 함수
    printJack()
//    Jack

    // 매개변수 있는 함수
    printCard("ive", 11)
//    ive = 11

    // 단일 표현식 함수
    println(plus(4, 5, 6))

}

//코드 줄이기
//fun plus(a: Int, b: Int, c: Int): Int {
//    // 반환값
//    return a + b + c
//}
// Single-Expression function(단일 표현식 함수) //
// 반환형 추론 가능 -> return 생략
fun plus(a: Int, b: Int, c: Int) = a + b + c

// () 안에 뭐 있음 -> 매개변수 있는 함수
fun printCard(cardName: String, cardValue: Int) {
    println("$cardName = $cardValue")
}

// () 비어있음 -> 매개변수 없는 함수
fun printJack() {
    println("Jack")
}