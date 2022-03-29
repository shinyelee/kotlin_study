// String Format 문자열 가공
// 유저가 입력한 데이터를 가공하거나
// 서버에서 가져온 데이터를 알맞게 가공해서 쓰거나

fun main() {

//    val testString = "동해물과 백두산이 마르고 닳도록"
//    println(testString[1])
//    println(testString[2])
//
//    val a = testString[1]
//    val b = testString[2]
//    println(a.toString() + b.toString())
//
//    // [1]에서 시작, [3] 앞에서 자름
//    val splitString = testString.substring(1, 3)
//    println(splitString)
//
//    // 전체 가져오기
//    val splitString2 = testString.substring(0, testString.length)
//    println(splitString2)
//
//    // 공백(띄어쓰기) 기준으로 잘라줌
//    val newTestString = testString.split(" ")
//    println(newTestString)
//    println(newTestString[0])
//    println(newTestString[1])
//
//    // 문자열 대체하기
//    val replaceValue = testString.replace("백두산", "한라산")
//    println(replaceValue)

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