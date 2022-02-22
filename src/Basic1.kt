// 자료형 //
// 숫자(int, long, double, float)
// 문자(String)
// boolean(true, false)

fun main(args: Array<String>){

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

    // 데이터 타입 변경
    val test9 : Int = 1234
    println(test9::class.java.simpleName)
    // Int -> String
    val test10 = test9.toString()
    println(test10::class.java.simpleName)

    // 형변환 이라고도 함
    val test11 : String = "1234"
    val test12 = Integer.parseInt(test11)
    // String -> Int
    println(test12::class.java.simpleName)
    println(test12 + 1234)

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