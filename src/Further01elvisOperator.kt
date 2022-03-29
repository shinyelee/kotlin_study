// Elvis Operator(엘비스 연산자)
// null 처리를 위해 사용
// val str = ""
// 이나
// val number = 0
// 과는 다르다

fun main() {

//    var testStr1 : String = ""
//    println(testStr1)
//
//    var testStr2 = null
//    println(testStr2)
//
//    // 단순 문자열은 String
//    var testStr3 : String = "abcd"
//    // null 포함하려면 String?
//    var testStr4 : String? = null

    println(findStringLength1("qwerasdf"))
    println(findStringLength2(null))
    println(findStringLength3("1234"))
    println(findStringLength4(null))

}

// null이면 에러남
fun findStringLength1(str : String) : Int {
    return str.length
}

// null이면 null 리턴
fun findStringLength2(str : String?) : Int? {
    return str?.length
}

// null이면 0 리턴
fun findStringLength3(str : String?) : Int {
    var resultCount = 0
    if(str != null) {
        resultCount = str.length
    }
    return resultCount
}

// null이면 0 리턴
fun findStringLength4(str : String?) : Int? {
    return str?.length ?: 0
}