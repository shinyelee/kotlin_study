// Looping(반복문)

fun main() {

    // for
    // 리스트 반복 출력
    val cards1 = mutableListOf("Jack", "Queen", "King")
    for (card in cards1) {
        println(card)
    }

    // 숫자 범위 지정
    for (i in 1..10) {
        println(i)
    }

    // 내림차순은 .. 대신 downTo
    for (j in 10 downTo 1) {
        println(j)
    }

    // 키, 값 동시 출력
    val cards2 = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    for ((name, value) in cards2) {
        println("$name, $value")
    }

    // while
    // 변수가 false 될 때까지 출력
//    while (stillDownloading) {
//        println("Downloading…")
//    }

}