// Numbers(숫자)

fun main() {

    // 정수형 //

    // Byte -> 8비트
    // Short -> 16비트
    // Int -> 32비트(기본값)
    // Long -> 64비트

    var num1: Int = 42
    var num2: Long = 42L



    // 정수형의 리터럴(코드 내 값 표기) //

    // 10진수 -> Long만 숫자 뒤에 L 붙임
    // 16진수 -> 숫자 앞에 0x 붙임(1af는 431)
    // 2진수 -> 숫자 앞에 0b 붙임

    var decimal = 1234L
    var hexadecimal = 0x1af
    var binary = 0b10110110
    println(decimal)
    println(hexadecimal)
    println(binary)
//    1234
//    431
//    182



    // Type Inference(타입 추론) //

    // 코틀린은 똑똑하기 때문에 알아서 자료형(변수 타입)을 때려맞춤
    // -> 정수는 Int, 실수는 Double이 기본값
    // -> 자료형을 코드에 명시하지 않아도 됨
    // (Byte, Short 등을 사용하려면 자료형을 명시하면 됨)

    var num11 = 42
    var num22 = 42L
//    var num222 = 42l
//    Kotlin: Use 'L' instead of 'l'
    // Long은 대문자 L만 허용함(소문자 l은 안됨)



    // 실수형 //

    // Float -> 32비트
    // Double -> 64비트(기본값)

    val num3: Double = 3.14
    val num4 = 3.14F
    val num44 = 3.14f
    // Float는 대문자 F, 소문자 f 모두 허용



    // 긴 숫자는 _를 쓰면 가독성이 좋아짐
    val distToMoon = 92_960_000 // miles
    println(distToMoon)
//    92960000

}