// Higher-order Function(고차함수)
// 함수를 클래스에서 만들어낸 인스턴스처럼 취급하는 방법
// 함수를 파라미터로 넘겨주거나 결과값으로 반환 받을 수 있음

fun main() {
    // :: -> 고차함수로 만드는 연산자
    b(::a)
}

// 문자열을 받고 반환형은 없는 함수
fun a (str: String) {
    println("$str 함수 a")
}

// Unit -> 값이 없음
fun b (function: (String)->Unit) {
    function("b가 호출한")
}

// 고차 함수, 람다 함수 어따 씀?
// -> 컬렉션의 조작, 스코프 함수 사용에 도움됨