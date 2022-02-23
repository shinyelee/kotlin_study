// 리스트와 filter
// ?와 !
// 반복문

fun main() {

    // 리스트 만드는 방법 (1)
    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")
    println(testList1)

    // 리스트 만드는 방법 (2)
    val testList2 = listOf("a", "b", "c")
    println(testList2)

    // 리스트 만드는 방법 (3)
    val testList3 = mutableListOf<String>("a", "b", "c")
    println(testList3)
    testList3.add("d")
    println(testList3)

    // 필터
    val testList4 = listOf("student1","student2","student3","student4","teacher1","student5")
    println(testList4)
    println(testList4.filter { it.startsWith("s") })

    // 리스트에 null 있을 때
    val testList5 = listOf("student1","student2","student3","student4","teacher1","student5",null)
    println(testList5)
    // 잘못된 필터링
    // Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//    println(testList5.filter { it.startsWith("s") })
    // 올바른 필터링(null 제외)
    println(testList5.filterNotNull().filter { it.startsWith("s") })

    // test1에 test2의 값을 넣음 -> "a"가 "b"로 바뀜
    var test1 : String = "a"
    var test2 : String = "b"
    test1 = test2
    println(test1)

    // test3에 test4의 값을 넣음 -> ?(null 일수도) 때문에 에러남
    // !!(null 아님)를 붙여주면 에러가 나지 않음
    var test3 : String = "c"
    var test4 : String? = "d"
//    test3 = test4
    test3 = test4!!
    println(test3)

    // 리스트 출력
//    val testList6 = listOf("a", "b", "c","d", "e", "f")
//    // 관습적으로 i로 씀 -> 다른 알파벳이어도 노상관
//    for (i in testList6) {
//        print(i)
//    }

    // 숫자 범위 지정
//    for (j in 1..10) {
//        print(j)
//    }

    // 3씩 더하기
//    for (i in 1..10 step 3) {
//        println(i)
//    }

    // 문자열과 함께 출력
//    for (i in 1..3) {
//        println("l의 값은 : $i")
//    }

    // 이중 반복문
//    for (i in 1..3) {
//        for (j in 1..3) {
//            println("i is $i j is $j")
//        }
//    }

}