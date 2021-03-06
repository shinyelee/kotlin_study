// Lambda Function(람다 함수) //

// 고차함수 그잡채 -> 별도의 연산자 없이 변수에 담을 수 있음
// Lambda Expression(람다식), Anonymous Function(익명 함수)라고도 한다.

fun main() {

    // 이름이 없는 함수
    var result: Int

    // 일반 변수에 람다식 할당
    val multi = {x: Int, y: Int -> x * y}

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)
//    200



    bb(::aa)
//    bb가 호출한 함수 aa

//    val cc: (String)->Unit = {str: String -> println("$str 람다함수 cc")}
    // 이렇게 냅다 축약해도 됨
    val cc = {str: String -> println("$str 람다함수 cc")}

    bb(cc)
//    bb가 호출한 람다함수 cc



    // 1. 여러 구문을 사용하는 람다 함수
    val d = {str: String ->
        println("$str 이런 식으로")
        println("$str 여러 구문의")
        println("$str 사용이 가능함")
    }
    val calculate: (Int, Int)->Int = {a, b ->
        println(a)
        println(b)
        a+b
    }
    // 마지막 구문인 a+b의 값을 Int로 반환함

    // 2. 파라미터가 없는 람다 함수
    // -> 실행할 구문들만 나열
    val e: ()->Unit = {println("파라미터 없음")}

    // 3. 파라미터가 하나인 람다 함수
    // -> it 사용(파라미터 이름 일일이 쓸 필요 X)
    val f: (String)->Unit = {println("$it 파라미터 하나")}

}

fun aa (str: String) {
    println("$str 함수 aa")
}

fun bb (function: (String)->Unit) {
    function("bb가 호출한")
}