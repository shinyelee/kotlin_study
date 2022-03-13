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

}
