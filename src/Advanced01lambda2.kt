// 람다 보충설명

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



    // 람다의 return //

    println(calculateGrade(74))
//    Pass

    println(calculateGrade(999))
//    Error



    // 람다를 표현하는 여러가지 방법 //

    val lambda : (Double) -> Boolean = { number : Double ->
        number == 5.4321
    }

    // invokeLambda 안에 lambda를 넣어줌
    // 5.4321 != 1.2345
    println(invokeLambda(lambda))
//    false

    // it == 1.2345
    // 1.2345 > 0.1
    println(invokeLambda{it > 0.1})
//    true

    // 원래 이런 형태인데 () 생략 가능
//    println(invokeLambda({it > 0.1}))

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



// 람다의 return //

// input 자료형은 () 필수
// output 자료형은 () 생략 가능
val calculateGrade : (Int) -> String = {

    when(it) {
        in 0..49 -> "Fail"
        in 50..99 -> "Pass"
        100 -> "Perfect"
        else -> "Error"
        // else 필수
    }

}



// 람다를 표현하는 여러가지 방법 //

// 람다함수는 value처럼 다룰 수 있는 익명함수
// 1. 메소드의 매개변수로 넘겨줄 수 있음
// 2. 리턴값으로 쓸 수 있음

fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(1.2345)
}