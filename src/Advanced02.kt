// Higher-order Function(고차함수)
// f(x) = x 가 아니라
// f(f(x)) = x 임
// 함수 안에 함수 있음

fun main() {

    // 람다 복습
//    println(testSum(1, 2))
//    println(testLambdaSum(1, 2))

    sums(1, 2, ::testSum)
    sums(1, 2, {a : Int, b : Int -> a + b})
    // 이렇게 써도 됨
    sums(1, 2) {a : Int, b : Int -> a + b}

}

fun sums(a : Int, b : Int, operation : (Int, Int) -> Int) {
    println("$a $b")
    println(operation(a, b))
}

// 람다 복습
fun testSum(a : Int, b : Int) : Int {
    return a + b
}
// val testLambdaSum = {a : Int, b : Int -> a + b}