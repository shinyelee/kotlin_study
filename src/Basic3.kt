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

}