// Data Type(자료형) //

// 코틀린 기준,
// 코딩시 -> Reference Data Type(참조형 자료형)
// 컴파일 단계 -> Primitive Data Type(기본형 자료형)

// 정수 자료형
// 실수 자료형
// 문자 자료형
// 문자열 자료형
// 논리 자료형

fun main(){

    // Type Inference(타입 추론) //

    // 코틀린은 똑똑하기 때문에 알아서 자료형(변수 타입)을 때려맞춤
    // -> 정수는 Int, 실수는 Double이 기본값
    // -> 자료형을 코드에 명시하지 않아도 됨
    // (Byte, Short 등을 사용하려면 자료형을 명시하면 됨)

    var apple = 1234
    // var apple: Int = 1234
    // 기본적으로 정수는 Int형으로 추론

    var banana = 1234L
    // var apple: Long = 1234L
    // 정수에 L 붙어있으면 Long형으로 추론

    var cherry = 12.45
    // var apple: Double = 12.45
    // 기본적으로 실수는 Double형으로 추론

    var dragonFruit = 12.45f
    // var apple: Float = 12.45f
    // 실수에 f 붙어있으면 Float형으로 추론

    var fig = 0xABCD
    var grape = 0b0101010
    // 16진수, 2진수는 Int형으로 추론

    var kiwi = true
    var lemon = 'l'
    // Boolean형, Char형도 알아서 추론



    // 비슷하게 생겼지만 문자와 숫자는 다르다

    // 문자 -> 일이삼사 + 일
    var test1 = "1234"
    println(test1::class.java.simpleName)
    println(test1 + 1)
//    12341

    // 숫자 -> 천이백삼십사 + 일
    var test2 = 1234
    println(test2::class.java.simpleName)
    println(test2 + 1)
//    1235



    // 잘못된 타입 지정 -> 에러 발생
    // 틀리게 쓰느니 안 쓰는 게 낫다
    var test5 = "5678"
//    val test5 : Int = "5678"
//    println(test5)
//    Kotlin: Type mismatch: inferred type is String but Int was expected

    var test6 = 5678
//    val test6 : String = 5678
//    println(test6)
//    Kotlin: Type mismatch: inferred type is String but Int was expected



    // Type Casting(형변환) //

    // 자료형을 변경하는 기능
    // 논리형은 형변환 불가능

    // Explicit Type Casting(명시적 형변환)
    // -> 코틀린에서 사용하는 형변환
    // 변환될 자료형을 개발자가 직접 지정함

    // Implicit Type Casting(암시적/묵시적 형변환)
    // -> 코틀린에서 지원 안 함
    // 자료형 지정하지 않아도 변수 할당시 자동으로 형변환됨



    var a: Int = 321
    var b: Long = a.toLong()
//    var b: Long = a
// Kotlin: Type mismatch: inferred type is Int but Long was expected
    // a는 Int, b는 Long -> 냅다 할당하면 에러 발생
    // Long형으로 바꾸기 위해 toLong() 함수 사용

    var c = 119
    var d: String = c.toString()
//    var d: String = c



    // Type Casting Function(형변환 함수) //

    // toByte()
    // toShort()
    // toInt()
    // toLong()
    // toFloat()
    // toDouble()
    // toChar()
    // toString()



    // 그냥 공백
    val test13 = ""
    println(test13)
    // null <- 대충 슈뢰딩거의 값(undefined, 0, ""와는 다름)
    val test14 = null
    println(test14)

    // null은 문자열이 아니기 때문에 -> 에러 발생
    // Kotlin: Null can not be a value of a non-null type String
//    val test15 : String = null
    // test16은 String 또는 null이다
    val test16 : String? = null

}