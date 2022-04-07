// list
// mutable list
// map
// set

fun main () {

    // list는 추가/제거를 못 함
    val testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0])
//    [a, b, c]
//    a

    // 이렇게 만들면 추가/제거 불가능
//    testList1.add("d")

    // mutable list는 추가/제거 가능
    val testList2 = mutableListOf("a", "b", "c")
    println(testList2)
//    [a, b, c]

    // "d" 추가
    testList2.add("d")
    println(testList2)
//    [a, b, c, d]

    // "a" 제거
    testList2.remove("a")
    println(testList2)
//    [b, c, d]

//     5 유리
//     10 철수
//     15 짱구
//     22 훈이

    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)

    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList2[findIndex])

    // 인덱스는 겁나 귀찮음 -> map 사용
    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5, "유리")
    testMap1.put(10, "철수")
    testMap1.put(15, "짱구")
    testMap1.put(22, "훈이")

    println(testMap1[15])

    // set -> 중복을 막아줌
    val testSet1 = mutableSetOf("a", "b", "c")
    println(testSet1)
    testSet1.add("d")
    testSet1.add("e")
    println(testSet1)
    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")
    println(testSet1)
    testSet1.remove("e")
    println(testSet1)

}

