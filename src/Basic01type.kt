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

    // 문자 -> 일이삼사
    val test1 = "1234"
    println(test1::class.java.simpleName)
    // 일이삼사 + 일 -> 일이삼사일
    println(test1 + 1)

    // 숫자 -> 천이백삼십사
    val test2 = 1234
    println(test2::class.java.simpleName)
    // 천이백삼십사 + 일 -> 천이백삼십오
    println(test2 + 1)

    // 소수점 붙은 숫자 -> double
    val test3 = 123.456
    println(test3::class.java.simpleName)

    // 타입 지정하기
    val test4 : Int = 123456
    println(test4::class.java.simpleName)

    // 잘못된 타입 지정 -> 에러 발생
    // Kotlin: Type mismatch: inferred type is String but Int was expected
//    val test5 : Int = "1234"
//    println(test5)
//    val test6 : Int = 12345678901234
//    println(test6)

    val test7 : Long = 12345678901234
    println(test7)
    val test8 : Float = 1234.5678f
    println(test8)



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