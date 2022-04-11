// Lateinit / Lazy(지연초기화) //

fun main() {

//    var justString : String = "아무거나 스트링"
//    println(justString)
//    justString = "변경된 스트링"
//    println(justString)

    // 값 변경 가능(var)
    lateinit var lateString : String

    lateString = "a"
    lateString = "b"

    // 값 없어서 에러남
//    println(lateString)

    lateString = "선 타입지정 후 값입력"
    println(lateString)

    // 엥 이걸 어따씀? => 미리 변수를 선언해놓은 후
    // 서버에서 데이터 값을 받아와 넣어줄 때 사용함

    // 값 변경 불가능(val)
    val lazyString : String by lazy {
        println("얘가 만들어질 때 프린트")
        "lazyTestString"
    }

    lazyString
    // println(lazyString)

}