// Numbers(숫자)

fun main() {

    // 정수형
    // Byte -> 8비트
    // Short -> 16비트
    // Int -> 32비트(기본)
    // Long -> 64비트

    // 실수형
    // Float -> 32비트
    // Double -> 64비트(기본)

    // 16진수 -> 0x
    // 2진수 -> 0b
    // 를 해당 숫자 앞에 붙여줌

    val num1 = 42 // Int -> 정수
    val num2 = 3.14 // Double -> 10진수

    val num3 = 42L // Long -> L만 가능
//    val num3 = 42l
//    Kotlin: Use 'L' instead of 'l'
    val num4 = 3.14f // Float -> F, f 상관X
//    val num4 = 3.14F

    // 형변환
    // 명시적 형변환 -> to자료형() 함수 사용
    // 암시적 형변환 -> 코틀린은 지원X

    // to자료형() 함수 사용 예시
    val num5 = 42.toFloat() // Int를 Float로 변환
    val num6 = num1.toDouble() // Int를 Double로 변환

    // 긴 숫자의 경우 _를 쓰면 가독성이 좋아짐
    val distToMoon = 92_960_000 // miles
    println(distToMoon)
//    92960000

}