// Arrays(배열) //

fun main() {

    // 숫자 들어간 5칸짜리 배열
//    var intArr : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    // 코틀린은 알아서 타입추론하기 때문에
    // : Array<Int> 즉 자료형 부분 생략 가능
    var intArr = arrayOf(1, 2, 3, 4, 5)
    println(intArr[2])
//    3

    // 배열 index는 1이 아닌 0부터 셈
    // -> intArr[2]는 intArr의 2번째가 아닌 3번째 값임
    // 배열의 기존 값 변경
    intArr[2] = 8
    println(intArr[2])
//    8

    // null로 채워진 5칸짜리 배열
    // <배열에 들어갈 자료형 지정> -> generic
    // ()로 배열 크기 지정
    var nullArr = arrayOfNulls<Int>(5)

    // 문자열 들어간 배열도 동일함
    // 자료형 생략
    var cardNames = arrayOf("Jack", "Queen", "King")

    // 1번째 값 출력
    var firstCard = cardNames[0]
    println(firstCard)

    // 값 변경 후 출력
    cardNames[0] = "Ace"
    println(cardNames[0])
//    println(firstCard)

    // : Array<Any>일 경우 자료형 아무거나 다 넣을 수 있음
//    val anyArr : Array<Any> = arrayOf(1,"a",2.3f)
    // 자료형 생략
    val anyArr = arrayOf(1,"a",2.3f)

}
