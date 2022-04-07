// String Format(문자열 가공) //

// 유저가 입력한 데이터를 가공하거나
// 서버에서 가져온 데이터를 알맞게 가공해서 쓰거나

fun main() {

    val testString = "동해물과 백두산이 마르고 닳도록"
    println(testString[1])
    println(testString[2])
//    해
//    물

    val a = testString[1]
    val b = testString[2]
    println(a.toString() + b.toString())
//    해물

    // [1]에서 시작, [3] 앞에서 자름
    val splitString = testString.substring(1, 3)
    println(splitString)
//    해물

    // 전체 가져오기
    val splitString2 = testString.substring(0, testString.length)
    println(splitString2)
//    동해물과 백두산이 마르고 닳도록

    // 공백(띄어쓰기) 기준으로 잘라줌
    val newTestString = testString.split(" ")
    println(newTestString)
    println(newTestString[0])
    println(newTestString[1])
//    [동해물과, 백두산이, 마르고, 닳도록]
//    동해물과
//    백두산이

    // 문자열 대체하기
    val replaceValue = testString.replace("백두산", "한라산")
    println(replaceValue)
//    동해물과 한라산이 마르고 닳도록



    val test1 = "Test.Kotlin.String"

    // 길이
    println(test1.length)
//    18

    // 소문자
    println(test1.toLowerCase())
//    test.kotlin.string

    // 대문자
    println(test1.toUpperCase())
//    TEST.KOTLIN.STRING

    // . 기준으로 쪼개기
    val test2 = test1.split(".")
    println(test2)
//    [Test, Kotlin, String]

    // 문자열 합치기
    println(test2.joinToString())
    println(test2.joinToString("-"))
//    Test, Kotlin, String
//    Test-Kotlin-String

    // 해당 부분만 출력
    println(test1.substring(5..10))
//    Kotlin



    val nullString: String? = null // null
    val emptyString = "" // 아무것도 없음
    val blankString = " " // 공백 문자열
    val normalString = "A" // 일반 문자열

    // null 또는 아무것도 없는 문자열인지 확인
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())
//    true
//    true
//    false
//    false

    // null 또는 공백 문자열(스페이스, 탭 등)인지 확인
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())
//    true
//    true
//    true
//    false



    var kt = "kotlin.kt"
    var java = "java.java"

    // java로 시작하는 문자열
    println(kt.startsWith("java"))
    println(java.startsWith("java"))
//    false
//    true

    // kt로 끝나는 문자열
    println(kt.endsWith(".kt"))
    println(java.endsWith(".kt"))
//    true
//    false

    // lin을 포함하는 문자열
    println(kt.contains("lin"))
    println(java.contains("lin"))
//    true
//    false



    // 문제
    val testList = ArrayList<String>()
    testList.add("abc1@naver.com")
    testList.add("abc2@google.com")
    testList.add("abc3@daum.net")
    testList.add("abc4@kakao.com")
    testList.add("abc5@naver.com")
    testList.add("abc6@kakao.com")
    testList.add("abc7@naver.com")
    // 주소가 @naver.com인 이메일의 개수 찾기

    // 자른 문자열 담아줌
    val emailList = ArrayList<String>()

    // 문자열 잘라주기
    for (item in testList) {
        println(item.split("@")[1].split(".")[0])
        emailList.add(item.split("@")[1].split(".")[0])
    }

    // naver 개수 담아줌
    var count = 0

    // naver 개수 세 주기
    for (item in emailList) {
        if(item == "naver") {
            count++
        }
    }
    println(count)

}