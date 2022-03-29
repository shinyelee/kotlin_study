// Any
// 타입 노상관

// is as
// is -> 확인
// as -> type casting

fun main() {

//    var str1 : String = "abc"
//    println(str1)
//    // String -> ㅇㅋ
//    str1 = "cba"
//    println(str1)
//    // Int -> 에러
//    str1 = 123
//    println(str1)

    // Any
    var str2 : Any = "abc"
    println(str2)
    str2 = 123
    println(str2)

    // is
    var str3 : Any = "abc"
    if(str3 is String) {
        println("this is string")
    } else {
        println("this is not string")
    }

//    var str4 : Any = 123
//    var str4 : Any = "abc"
    var str4 : Any = 123L
    when(str4) {
        is Int -> {
            println("this is int")
        }
        is String -> {
            println("this is string")
        }
        else -> {
            println("this is else")
        }
    }

    // as
    var str5 : String = "abc"
    var str6 : String = str5 as String
    println(str6)

//    var str7 : Int = 1
//    var str8 : String = str7 as String
    // Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')

    // String 아니면 null 출력
    var str9 : String? = 1 as? String
    println(str9)

}