// Kotlin Scope function

fun main() {

    // let
    // non null일 때 동작O null일때 동작X
    val str : String? = "hi"
    println(str?.length)
    val length = str?.let {
        println(it)
        it.length
    }
    println(length)

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

    // run
    // 객체 초기화와 return값 계산이 필요할 때 주로 사용
    val service = multiPortService("www.naver.com", 80)
    val result1 = service.query(service.prepareRequest() + " to port ${service.port}")
    println(result1)

    val result2 = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    println(result2)

}

class multiPortService(var url : String, var port : Int) {
    fun prepareRequest() : String = "기본 요청 url $url"
    fun query(request : String) = "결과 query $request"
}