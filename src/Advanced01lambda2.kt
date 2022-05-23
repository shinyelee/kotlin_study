// 람다 보충설명 (1)

fun main() {

    println(square(12))
//    144

    println(triangle(4))
//    8

    println(book("작별인사", 2))
//    <작별인사> 2권 주세요

    println(album("PROOF", 1))
//    <PROOF> 1장 주세요

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