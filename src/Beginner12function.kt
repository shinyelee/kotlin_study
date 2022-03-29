// Functions(함수)

fun main() {

    // 함수
    printJack()
    add(1, 2, 3)

    // 매개변수 추가한 함수
    printCard("ive", 11)

    // 출력 안 하는 함수
    getCardString("invu", 9)

}

// 함수 생성
fun printJack() {
    println("Jack")
}

// 매개변수 추가
fun printCard(cardName: String, cardValue: Int) {
    println("$cardName = $cardValue")
}

// 문자열 객체로 반환
fun getCardString(cardName: String, cardValue: Int): String {
    return("$cardName = $cardValue")
}

// single-expression function(단일 표현식 함수)
//fun add(a: Int, b: Int, d: Int): Int {
//    return a + b + c
//}
fun add(a: Int, b: Int, c: Int) = a + b + c

// getCardString과 동일함
// {}와 return 생략하고 = 씀
fun getCardString2(cardName: String, cardValue: Int): String = "$cardName = $cardValue"

// getCardString, getCardString2와 동일함
// 반환타입(여기서는 : String) 생략 가능
fun getCardString3(cardName: String, cardValue: Int) = "$cardName = $cardValue"