// Higher-order Function(고차함수)
// f(x) = x 에서
// f(f(x)) = x 로 가는 느낌적인 느낌

fun main() {

    // 람다 복습
    println(testSum(1, 2))
    println(testLambdaSum(1, 2))

}

// 람다 복습
fun testSum(a : Int, b : Int) : Int {
    return a + b
}
val testLambdaSum = {a : Int, b : Int -> a + b}