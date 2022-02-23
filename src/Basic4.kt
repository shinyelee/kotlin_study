// list
// mutable list
// map
// set

fun main () {

    // list는 추가/제거를 못 함
    val testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0])
    // 이렇게 만들면 추가/제거 불가능
//    testList1.add("d")

    // mutable list는 추가/제거 가능
    val testList2 = mutableListOf("a", "b", "c")
    println(testList2)
    // "d" 추가
    testList2.add("d")
    println(testList2)
    // "a" 제거
    testList2.remove("a")
    println(testList2)

}