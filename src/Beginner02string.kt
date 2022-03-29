// Strings(문자열)

// 큰따옴표 안에
// "이런 식으로"
// 사용

// 여러 줄인 경우
// """이런 식으로"""
// 줄바꿈, 특수문자까지 그대로 사용

fun main () {

    // + 연산자를 사용해 두 문자열 결합하기
    val language = "Kotlin"
    val creator = "JetBrains"
    val description = language + " is created by " + creator
    println(description)
//    Kotlin is created by JetBrains

    // $ 사용해 문자열 결합하기(더 편리함)
    val releaseDate = "July 2011"
    val releaseString = "Kotlin was released in $releaseDate"
    println(releaseString)
//    Kotlin was released in July 2011

}