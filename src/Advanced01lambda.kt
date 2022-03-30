// Lambda Function(람다 함수)
// 고차함수 그잡채 -> 별도의 연산자 없이 변수에 담을 수 있음

fun main() {

    bb(::aa)

//    val cc: (String)->Unit = {str: String -> println("$str 람다함수 cc")}
    // 이렇게 냅다 축약해도 됨
    val cc = {str: String -> println("$str 람다함수 cc")}
}

fun aa (str: String) {
    println("$str 함수 aa")
}

fun bb (function: (String)->Unit) {
    function("bb가 호출한")
}
