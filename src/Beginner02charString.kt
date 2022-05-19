fun main () {

    // Char(문자 1개) //

    // 글자 하나는 2bytes(16bits) 차지함

    val alphabetA = 'A'
    val koreanChar = 'ㄱ'



    // Strings(문자열) //

    // 큰따옴표 안에
    // "이런 식으로"
    // 사용
    val oneString = "one line string test"

    // 여러 줄인 경우
    // """이런 식으로"""
    // 줄바꿈, 특수문자까지 그대로 사용
    val threeStrings = """one
        =two=
        three^^
    """

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

    val firstName = "shinye"
    val lastName = "lee"
    // 이런 식으로도 결합 가능
    println("I'm ${firstName + lastName}")
//    I'm shinyelee

    // 문자열에 $을 쓰고 싶을 때(not변수)
    // \$을 입력하면 $으로 출력됨
    println("LO\$ER=LO♡ER")

    // 주석은 보통 이렇게 씀

    /* 여러 줄
    *  주석은
    *  이렇게도 씀 */

}