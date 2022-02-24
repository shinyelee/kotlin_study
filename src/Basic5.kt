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

    // list
    val testList1 = mutableListOf("a", "b", "c")
    println(testList1)
    for (i in testList1) {
        println(i)
    }
}