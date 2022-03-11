// Kotlin Scope function

fun main() {

    val str : String? = "hi"
    println(str?.length)
    val length = str?.let {
        println(it)
        it.length
    }
    println(length)

    // let
    // non null일 때 동작O null일때 동작X
    val str2 : String? = null
    val length2 = str2?.let {
        println(it)
        println("실행 안 됨")
        it.length
    }
    println(length2)

    // with
    // 컨텍스트 내부에서 함수 호출
    val numbers = mutableListOf("a", "b", "c", "d")
    println(numbers.first())
    println(numbers.last())
    val firstAndLast = with(numbers) {
        "${first()} and ${last()}"
    }
    println(firstAndLast)

}