// function

fun main() {

    testFun()
    abc()
    abc2()
    // 출력 방법 (1)
//    println(sum(30, 50))
    // 출력 방법 (2)
    val sumValue = sum(30, 60)
    println(sumValue)
    cuckoo(50)

    // 출력 안 하는 함수
    getCardString("invu", 9)

}



fun cuckoo(time : Int) {
    println("$time 분 후에 취사가 완료됩니다.")
}

fun sum(num1 : Int, num2 : Int) : Int {
//    println(num1 + num2)
    val result = num1 + num2
    return result
}

fun abc2() {
    val a = 20
    val b = 40
    val c = a + b
    println(c)
}

fun abc() {
    val a = 10
    val b = 20
    val c = a + b
    println(c)
}

fun testFun() {
    println("a")
    println("b")
    println("c")
    println("d")
}

// 문자열 객체로 반환
// fun getCardString(cardName: String, cardValue: Int): String {
//     return("$cardName = $cardValue")
// }

// {}와 return 생략 가능
// fun getCardString(cardName: String, cardValue: Int): String = "$cardName = $cardValue"

// 반환타입(: String) 생략 가능
fun getCardString(cardName: String, cardValue: Int) = "$cardName = $cardValue"