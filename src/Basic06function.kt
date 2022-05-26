// function(함수) //

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

    // Bts 클래스의 인스턴스를 생성한 뒤
    val bts = Bts()
    // .함수명() 붙여서 멤버 함수 호출
    bts.suga()
//    AgustD

}



// 매개변수 있는 함수 //
// fun 함수명(매개변수명 : 자료형) { 코드 본문 }
fun cuckoo(time : Int) {
    println("$time 분 후에 취사가 완료됩니다.")
}

fun sum(num1 : Int, num2 : Int) : Int {
//    println(num1 + num2)
    val result = num1 + num2
    return result
}

// 매개변수 없는 함수 //
// fun 함수명() { 코드 본문 }
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
//fun getCardString(cardName: String, cardValue: Int): String {
//    return("$cardName = $cardValue")
//}

// 짧은 ver.
//fun getCardString(cardName: String, cardValue: Int): String = "$cardName = $cardValue"

// 더 짧은 ver.
fun getCardString(cardName: String, cardValue: Int) = "$cardName = $cardValue"

// 위 셋은 모두 같음

//fun xORy(x: Int, y: Int): Int {
//    return if (x > y) x else y
//}

// 함수가 단일 식을 리턴 -> {} 생략 후 = 붙임
// 컴파일러가 반환형 타입 추론 -> : Int 생략
// 본문 막줄은 반환형으로 추론 -> return 생략

fun xORy(x: Int, y: Int) = if (x > y) x else y
// 이렇게 짧아짐



// 클래스 내 함수(멤버 함수)
class Bts {
    fun suga(): Unit = println("AgustD")
}