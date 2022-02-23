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


}