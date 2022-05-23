// 람다 보충설명 (2)

fun main() {

    // 람다함수 //

    println(square(12))
//    144

    println(triangle(4))
//    8

    println(book("작별인사", 2))
//    <작별인사> 2권 주세요

    println(album("PROOF", 1))
//    <PROOF> 1장 주세요



    // 확장함수 //

    val a = "I love my"
    val b = "Love your"

    println(a.self())
//    I love myself:)

    println(b.self())
//    Love yourself:)

    println(extendString("you", 3000))
//    I love you 3000

}

// 기본형
// val 람다함수명 : (input 자료형) -> (output 자료형) = { 매개변수 -> 본문 }
val square : (Int) -> (Int) = { number -> number * number }

// 좀 더 짧게
// val 람다함수명 = { 매개변수 : 자료형 -> 본문 }
val triangle = { number : Int -> number * number / 2 }

// 기본형2
val book : (String, Int) -> String = { title : String, many : Int ->
    "<${title}> ${many}권 주세요"
}

// 좀 더 짧게2
val album = {title : String, many : Int ->
    "<${title}> ${many}장 주세요"
}

// 람다함수는 value처럼 다룰 수 있는 익명함수
// 1. 메소드의 매개변수로 넘겨줄 수 있음
// 2. 리턴값으로 쓸 수 있음



// 확장함수 //

// String.(매개변수 없음)
val self : String.() -> String = {

    // String 오브젝트 그 자체를 this로 가리킴
    this + "self:)"

}

fun extendString(who : String, much : Int) : String {

    // String.(매개변수 있음) <- this
    // 매개변수 Int를 it으로 가리킴
    val ironMan : String.(Int) -> String = { "I love ${this} ${it}" }

    return who.ironMan(much)

}
