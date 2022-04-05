// Higher-order Function(고차함수) //

// 일반 함수를 인자나 반환값으로 사용
// 함수를 클래스에서 만들어낸 인스턴스처럼 취급하는 방법
// 함수를 파라미터로 넘겨주거나 결과값으로 반환 받을 수 있음

fun main() {

    // 일반 인자
    val res1 = sum1(3, 2)
    // 3 + 2 ->  5
    println(res1)
//    5

    // 인자에 함수 사용
    val res2 = mul1(sum1(3,3), 3)
    // (3 + 3) * 3 -> 18
    println(res2)
//    18

    // 함수의 반환값으로 함수 사용
    println("funcFunc: ${funcFunc()}")
//    funcFunc: 4

    // :: -> 고차함수로 만드는 연산자
    b(::a)
//    b가 호출한 함수 a
}

fun sum1(a: Int, b: Int) = a + b

fun mul1(a: Int, b: Int) = a * b

fun funcFunc(): Int {
    // 함수의 반환값으로 함수 사용
    return sum1(2, 2)
}

// 문자열을 받고 반환형은 없는 함수
fun a (str: String) {
    println("$str 함수 a")
}

// 함수를 자료형으로 나타내기
// Unit -> 값이 없음
fun b (function: (String)->Unit) {
    function("b가 호출한")
}

// 고차 함수, 람다 함수 어따 씀?
// -> 컬렉션의 조작, 스코프 함수 사용에 도움됨