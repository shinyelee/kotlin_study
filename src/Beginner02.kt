// Strings(문자열)

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