// 람다 보충설명 (1)

fun main() {

    println(square(12))
//    144

    println(triangle(4))
//

    println(book("작별인사", 2))
//    <작별인사> 2권 주세요

    println(album("PROOF", 1))
//    <PROOF> 1장 주세요

}

// 기본형
// val 람다함수명 : (input 자료형) -> (output 자료형) = { 인자 -> 코드 }
val square : (Int) -> (Int) = { number -> number * number }

// 좀 더 짧게
// val 람다함수명 = { 인자 : 자료형 -> 코드 }
val triangle = { number : Int -> number * number / 2 }

// 기본형2
val book : (String, Int) -> String = { title : String, many : Int ->
    "<${title}> ${many}권 주세요"
}

// 짧게2
val album = {title : String, many : Int ->
    "<${title}> ${many}장 주세요"
}