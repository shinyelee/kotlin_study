// List Format(리스트 가공) //

fun main() {

    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)
    println(testList1)
//    [1, 2, 3, 4, 10, 10, 11, 11]

    // 중복 제거
    println(testList1.distinct())
//    [1, 2, 3, 4, 10, 11]

    // 최대값
    println(testList1.maxOrNull())
//    11

    // 최소값
    println(testList1.minOrNull())
//    1

    // 평균값
    println(testList1.average())
//    6.5



    // 필터
    val testList2 = listOf("john", "jay", "minsu", "minji", "suji", )

    val result1 = testList2.filter {
        it.startsWith("m")
    }
    println(result1)
//    [minsu, minji]

    val testList3 = listOf(1, 2, 3, 4, 5)

    val result2 = testList3.filter {
        // 글자수를 2로 나눴을 때 나머지가 0인 이름
        // 즉 글자수가 짝수인 경우만 출력
        it % 2 == 0
    }
    println(result2)
//    [2, 4]

    val testList4 = listOf("a", "aa", "aaa", "aaaa")

    val result3 = testList4.groupBy {
        // 글자수가 2 초과면 true로 묶고
        // 글자수가 2이하면 false로 묶음
        it.length > 2
    }
    println(result3)
//    {false=[a, aa], true=[aaa, aaaa]}

}