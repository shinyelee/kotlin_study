// When Expression(when 표현식) //

fun main() {

    // 코틀린에서는 switch 대신 when 표현식으로
    var cardInt = 11
    when (cardInt) {
        11 -> println("Jack")
        12 -> println("Queen")
        13 -> println("King")
    }

    // if랑 마찬가지로 변수 설정 가능
    // else 까먹지 않기
    val cardInt2 = 14
    val cardName = when (cardInt2) {
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
        else -> "Other"
    }
    println(cardName)

}