// Nullability(널 가능성)

fun main() {

//    val x: Int = null
//    Kotlin: Null can not be a value of a non-null type Int
//    val y: String = null
//    Kotlin: Null can not be a value of a non-null type String
//    ?은 null인지 아닌지를 확인(포함한다고 봐도 됨)
//    변수값을 null로 지정하되 에러 안 나려면 변수타입에 ? 붙이기
    val x: Int? = null
    val y: String? = null

    val name: String? = null
//    println(name.length)
//    Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//    값이 null일 때 ? 사용해 오류 없이 null 반환함
    println(name?.length)
//    null

    var name2: String? = null
    name2 = "Treehouse"
//    값이 null이 아니라고 장담할 수 있을 때 !! 사용
    println(name2!!.length)
//    9

}