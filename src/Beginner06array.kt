// Arrays(배열)

fun main() {

//    val cardNames: Array = arrayOf("Jack", "Queen", "King")
//    Kotlin: One type argument expected for class Array<T>

    // 기본 형태(타입 생략 가능)
    val cardNames = arrayOf("Jack", "Queen", "King")
    val firstCard = cardNames[0]
    println(firstCard)
    // 배열의 기존 값 바꾸기
    cardNames[0] = "Ace"
    println(cardNames[0])
//    println(firstCard)

    // null로 채워진 배열 생성
    // <>안에 배열에 할당할 자료형 지정 -> Generic
    // ()로 배열 크기 지정
    var nullArr = arrayOfNulls<Int>(5)

}
