// while
// list
// map
// iterator

fun main() {

    // while //

    var count = 0

    while (count < 10) {
        // count = count + 1
        count++
        println(count)
    }
//    1
//    2
//    3
//    4
//    5
//    6
//    7
//    8
//    9
//    10

//    while (stillDownloading) {
//        println("Downloading…")
//    }



    // list 복습 //

    val testList1 = mutableListOf("a", "b", "c")

    println(testList1)
//    [a, b, c]

    for (i in testList1) {
        println(i)
    }
//    a
//    b
//    c



    // map 복습 //

    val testMap1 = mutableMapOf<Int, String>()

    testMap1.put(5, "유리1")
    testMap1.put(15, "유리2")
    testMap1.put(25, "유리3")
    testMap1.put(35, "유리4")

    println(testMap1)
//    {5=유리1, 15=유리2, 25=유리3, 35=유리4}

    for (j in testMap1) {
        println(j)
    }
//    5=유리1
//    15=유리2
//    25=유리3
//    35=유리4



    // map 다른 방법 //

    val testMap2 = mutableMapOf<Int, String>()

    testMap2[5] = "철수1"
    testMap2[15] = "철수2"
    testMap2[25] = "철수3"
    testMap2[35] = "철수4"

    println(testMap2)
//    {5=철수1, 15=철수2, 25=철수3, 35=철수4}

    for (k in testMap2) {
        println(k)
    }
//    5=철수1
//    15=철수2
//    25=철수3
//    35=철수4



    // Iterator(반복자) //

    val testList2 = mutableListOf("a", "b", "c")

    val testIterator = testList2.listIterator()

    println(testIterator.next()) // a
    println(testIterator.next()) // a 다음 -> b
    println(testIterator.hasNext()) // b 다음 -> c -> true
    println(testIterator.next()) // b 다음 -> c
    println(testIterator.hasNext()) // c 다음 -> 없음 -> false
    println(testIterator.previous()) // false 이전 -> c
    println(testIterator.previous()) // c 이전 -> b
    println(testIterator.hasPrevious()) // b 이전 -> a -> true
    println(testIterator.previous()) // b 이전 -> a
//    a
//    b
//    true
//    c
//    false
//    c
//    b
//    a

    while (testIterator.hasNext()) {
        println(testIterator.next())
    }
//    a
//    b
//    c



    // 문제 //

    val student = mutableMapOf<Int, String>()

    student[99] = "지민"
    student[20] = "민정"
    student[35] = "시은"
    student[48] = "세은"
    student[100] = "원영"
    student[22] = "유진"
    student[45] = "다연"
    student[88] = "채현"
    student[91] = "수빈"
    student[87] = "연준"
    student[54] = "주연"
    student[42] = "영훈"

    // 점수가 50점 이상인 사람들의 이름만 반복문과 조건문을 통해 출력하세요

    val testList = ArrayList<String>()

    for (l in student) {
        // 점수(key) 50점 이상인 사람들의

        if(l.key >= 50) {
            // 각각 이름(value) 출력
            println(l.value)
            // 이름 리스트로 만들어서
            testList.add(l.value)
        }

    }
//    지민
//    원영
//    채현
//    수빈
//    연준
//    주연

    // 리스트 출력
    println(testList)
//    [지민, 원영, 채현, 수빈, 연준, 주연]

}