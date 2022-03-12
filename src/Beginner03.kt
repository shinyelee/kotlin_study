// numbers(숫자)

fun main() {

    // Int -> 32비트 정수(기본)
    // Long -> 64비트 정수
    // Float -> 32비트 소수
    // Double -> 64비트 소수(기본)

    val num1 = 42 // Int -> 정수
    val num2 = 3.14 // Double -> 10진수

    val num3 = 42L // Long -> 반드시 대문자 L
//    val num3 = 42l
//    Kotlin: Use 'L' instead of 'l'
    val num4 = 3.14f // Float -> 대소문자 상관X
//    val num4 = 3.14F

    // 타입 바꾸려면 -> toType 함수 사용
    val num5 = 42.toFloat() // Int를 Float로 변환
    val num6 = num1.toDouble() // Int를 Double로 변환

    // 긴 숫자의 경우 _를 쓰면 가독성이 좋아짐
    val distToMoon = 92_960_000 // miles
    println(distToMoon)
//    92960000

}