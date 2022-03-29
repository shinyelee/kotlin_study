// Variables(변수)

// 클래스명은 파스칼 표기법
// 함수/변수명은 카멜케이스 표기법

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
    // 일반적인 변수
    // 언제든지 읽기/쓰기 가능

    // immutable variable -> 불변 변수 -> val
    // 선언시에만 초기화 가능
    // 중간에 값 변경 불가

    // 수정할 수 없는 변수를 만들고 싶다면 var 대신 val 사용

    val greeting4 = "Hello World!"
//    greeting4 = "Hello Kotlin!"
//    Kotlin: Val cannot be reassigned

    // 클래스에 선언된 변수 -> property(속성)
    // 이외 스코프 내에 선언된 변수 -> Local Variable(지역변수)

    var nullable: Int? = null
    // 자료형 뒤에 ? 붙여서 nullable 변수로 선언

}
