// Higher-order Function(고차함수)
// f(x) = x 가 아니라
// f(f(x)) = x 임
// 함수 안에 함수 있음

fun main() {

    // 람다 복습
//    println(testSum(1, 2))
//    println(testLambdaSum(1, 2))

    // 고차함수
//    sums(1, 2, ::testSum)
//    sums(1, 2, {a : Int, b : Int -> a + b})
//    // 이렇게 써도 됨
//    sums(1, 2) {a : Int, b : Int -> a + b}

    // 일반
    printTest("abc")
    // 고차
    highPrintTest(::printTest)
    // :: 빼먹으면 에러남

    test1()
    test2()
    test3()

}

// Unit은 아무것도 리턴하지 않음
fun test1() : Unit {
    println("test")
    // return "nothing"
}
// 이렇게 써도 똑같고
fun test2() : Unit {
    println("test test")
    return
}
// 이렇게 써도 됨
fun test3() : Unit {
    println("test test test")
    return Unit
}
// 딱히 중요한 내용은 아닌데 이게 뭔가 하고 당황하지 말라고 설명해주심

// 일반
fun printTest(str : String) {
    println(str)
}
// 고차
fun highPrintTest(operation : (String) -> Unit) {
    operation("def")
}
// 저기 들어가는 단어가 꼭 operation일 필요 없음 걍 이름임
// abc ffff lalala 뭐여도 노상관

// 고차함수
//fun sums(a : Int, b : Int, operation : (Int, Int) -> Int) {
//    println("$a $b")
//    println(operation(a, b))
//}

// 람다 복습
//fun testSum(a : Int, b : Int) : Int {
//    return a + b
//}
// val testLambdaSum = {a : Int, b : Int -> a + b}