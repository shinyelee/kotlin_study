// Any //
// 타입 노상관



// Polymorphism(다형성) //

// Up-Casting(업캐스팅) //
// 상위 자료형인 수퍼 클래스로 변환
// 별도의 연산자 필요 없음

// Down-Casting(다운캐스팅) //
// 업캐스팅 된 인스턴스를 다시 하위 자료형으로 변환
// as is

// as //
// 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자
// 코드 내에서 사용시 즉시 자료형 변환 후 변환된 자료형 반환

// is //
// 변수가 자료형에 호환되는지를 먼저 체크한 후 변환해주는 캐스팅 연산자
// 조건문 내에서만 사용

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



    var a = Drink()
    a.drink()
//    음료를 마십니다

    var b: Drink = Coke()
    b.drink()
//    음료 중 콜라를 마십니다

//    b.washDishes()
//    Kotlin: Unresolved reference: washDishes
    // -> 다운캐스팅 필요

    // is
    if(b is Coke) {
        b.washDishes()
    }
//    콜라로 설거지를 합니다

    // as
    var c = b as Coke
    c.washDishes()
//    콜라로 설거지를 합니다
    b.washDishes()
//    콜라로 설거지를 합니다

}

open class Drink {

    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다")
    }

}

// Drink 상속받음
class Coke: Drink() {

    var type = "콜라"

    override fun drink() {
        println("${name} 중 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다")
   }

}