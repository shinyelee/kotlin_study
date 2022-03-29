// If Expression(if 표현식)

fun main() {

    // 일반적인 쓰임
    val a = 3
    val b = 5
    var aIsBigger = false
    if (a > b) {
        aIsBigger = true
    } else {
        aIsBigger = false
    }
    println(aIsBigger)

    // 변수 설정
    val aIsBigger2 = if (a > b) {
        true
    } else {
        false
    }
    println(aIsBigger2)

    // 실행할 구문이 하나라면
    // {} 생략 가능
    val aIsBigger3 = if (a > b) true else false
    println(aIsBigger3)

}