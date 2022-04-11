// list와 filter
// ?와 !
// 반복문

fun main() {

    // 리스트 만드는 방법 (1)
    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")
    println(testList1)
//    [a, b, c]

    // 리스트 만드는 방법 (2)
    val testList2 = listOf("a", "b", "c")
    println(testList2)
//    [a, b, c]

    // 리스트 만드는 방법 (3)
    val testList3 = mutableListOf<String>("a", "b", "c")
    println(testList3)
//    [a, b, c]
    testList3.add("d")
    println(testList3)
//    [a, b, c, d]



    // 필터
    val testList4 = listOf("student1","student2","student3","student4","teacher1","student5")
    println(testList4)
    println(testList4.filter { it.startsWith("s") })
//    [student1, student2, student3, student4, teacher1, student5]
//    [student1, student2, student3, student4, student5]

    // 리스트에 null 있을 때
    val testList5 = listOf("student1","student2","student3","student4","teacher1","student5",null)
    println(testList5)
//    [student1, student2, student3, student4, teacher1, student5, null]

    // 잘못된 필터링(null 포함)
//    println(testList5.filter { it.startsWith("s") })
    // Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    // 올바른 필터링(null 제외)
    println(testList5.filterNotNull().filter { it.startsWith("s") })
//    [student1, student2, student3, student4, student5]

    // test1에 test2의 값을 넣음 -> "a"가 "b"로 바뀜
    var test1 : String = "a"
    var test2 : String = "b"
    test1 = test2
    println(test1)
//    b

    // test3에 test4의 값을 넣음 -> ?(null 일수도) 때문에 에러남
    // !!(null 아님)를 붙여주면 에러가 나지 않음
    var test3 : String = "c"
    var test4 : String? = "d"
//    test3 = test4
    test3 = test4!!
    println(test3)
//    d

//    // 리스트로 문자열(알파벳) 출력
//    val testList6 = listOf("a", "b", "c","d", "e", "f")
//    // 관습적으로 i로 씀 -> 다른 알파벳이어도 노상관
//    for (i in testList6) {
//        print(i)
//    }
//    println()
////    abcdef
//
//    // 숫자 범위 지정
//    for (j in 1..10) {
//        print(j)
//    }
//    println()
////    12345678910
//
//    // 3씩 더하기
//    for (i in 1..10 step 3) {
//        println(i)
//    }
////    1
////    4
////    7
////    10
//
//    // 문자열과 함께 출력
//    for (i in 1..3) {
//        println("l의 값은 : $i")
//    }
////    l의 값은 : 1
////    l의 값은 : 2
////    l의 값은 : 3
//
//    // 이중 반복문
//    for (i in 1..3) {
//        for (j in 1..3) {
//            println("i is $i j is $j")
//        }
//    }
////    i is 1 j is 1
////    i is 1 j is 2
////    i is 1 j is 3
////    i is 2 j is 1
////    i is 2 j is 2
////    i is 2 j is 3
////    i is 3 j is 1
////    i is 3 j is 2
////    i is 3 j is 3

    // 구구단 출력하기
    for (i in 2..9) {
        for (j in 1..9) {
            val times = i * j
            println("$i * $j : $times")
        }
    }
//    2 * 1 : 2
//    2 * 2 : 4
//    2 * 3 : 6
//    ...중략...
//    9 * 7 : 63
//    9 * 8 : 72
//    9 * 9 : 81

    // 숫자 범위 지정
    for (i in 1..10) {
        print("${i} ")
    }
    println()
//    1 2 3 4 5 6 7 8 9 10

    // 내림차순은 .. 대신 downTo
    for (j in 10 downTo 1) {
        print("${j} ")
    }
    println()
//    10 9 8 7 6 5 4 3 2 1

    // 리스트로 문자열(단어) 출력
    val cards1 = mutableListOf("Jack", "Queen", "King")
    for (k in cards1) {
        println(k)
    }
//    Jack
//    Queen
//    King

    // 키, 값 동시 출력
    val cards2 = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    for ((name, value) in cards2) {
        println("$name, $value")
    }
//    Jack, 11
//    Queen, 12
//    King, 13

}