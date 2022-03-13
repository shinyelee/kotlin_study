// Variables(변수)

fun main() {

    // var 변수명: 변수타입 = 변수값
    // 의 형태로 작성
    var greeting: String = "Hello World!"

    // 변수타입 생략O
    var greeting2 = "Hello World!2"
    // 이렇게만 써도 코틀린은 변수타입이 문자열이란 것을 앎

    // 변수 수정시 var 생략O
    var greeting3 = "Hello World!"
    greeting3 = "Hello Kotlin!"

    // matable variable -> 가변 변수 -> var
    // immutable variable -> 불변 변수 -> val
    // 수정할 수 없는 변수를 만들고 싶다면 var 대신 val 사용
    val greeting4 = "Hello World!"
//    greeting4 = "Hello Kotlin!"
//    Kotlin: Val cannot be reassigned

}
