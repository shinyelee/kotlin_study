// while
// list
// map
// iterator

fun main() {

    // while
    var count = 0
    while (count < 10) {
        // count = count + 1
        count++
        println(count)
    }

    // list 복습
    val testList1 = mutableListOf("a", "b", "c")
    println(testList1)
    for (i in testList1) {
        println(i)
    }

    // map 복습 (1)
    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5, "유리1")
    testMap1.put(15, "유리2")
    testMap1.put(25, "유리3")
    testMap1.put(35, "유리4")
    println(testMap1)
    for (j in testMap1) {
        println(j)
    }

    // map 다른 방법
    val testMap2 = mutableMapOf<Int, String>()
    testMap2[5] = "철수1"
    testMap2[15] = "철수2"
    testMap2[25] = "철수3"
    testMap2[35] = "철수4"
    println(testMap2)
    for (k in testMap2) {
        println(k)
    }

    // iterator
    val testList2 = mutableListOf("a", "b", "c")
    val testIterator = testList2.listIterator()
    println(testIterator.next()) // a
    println(testIterator.next()) // a 다음 -> b
    println(testIterator.hasNext()) // b 다음 -> c -> true
    println(testIterator.next()) // b 다음 -> c
    println(testIterator.hasNext()) // c 다음 -> 없음 -> false
    println(testIterator.previous()) // false 이전 -> c
    println(testIterator.previous()) // c 이전 -> b
    println(testIterator.previous()) // b 이전 -> a

    // 활용
    while (testIterator.hasNext()) {
        println(testIterator.next())
    }

}