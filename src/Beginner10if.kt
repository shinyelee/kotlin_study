// If Expression(if 표현식) //

// if문의 조건이 참이면 -> 구문 실행

fun main() {

    // 일반적인 쓰임
    val a = 3
    val b = 5
    var aIsBigger = false

    // if -> 조건을 만족할 때 구문 실행
    if (a > b) {
        // a가 b보다 크면 true 출력
        aIsBigger = true
    // else -> 조건을 만족하지 못할 때
    } else {
        // a가 b보다 크지 않으면 false 출력
        aIsBigger = false
    }
    println(aIsBigger)
//    false

    // 변수 설정
    val aIsBigger2 = if (a > b) {
        true
    } else {
        false
    }
    println(aIsBigger2)
//    false

    // 실행할 구문이 하나라면
    // {} 생략 가능
    val aIsBigger3 = if (a < b) true else false
    println(aIsBigger3)
//    true

}