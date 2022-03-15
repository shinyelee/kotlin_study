// 문자열의 숫자와 짝수(true)와 홀수(false)를 알려주는 solution을 만드세요

fun main(){

    val result1 = solution("abcd")
    println(result1)
    // [4, true]

    val result2 = solution("abcde")
    println(result2)
    // [5, false]
}

fun solution(str : String) : ArrayList<String> {

    // 길이 구하기
    val length = str.length
    println(length)

    // 홀짝 확인
//    var isEven = true
//    if(length % 2 == 0) {
//        println("true")
//        isEven = true
//    } else {
//        println("false")
//        isEven = false
//    }
    val isEven = length % 2 == 0 // 간소화

    val tempReturnArr = arrayListOf<String>(length.toString(), isEven.toString())

    return tempReturnArr

}