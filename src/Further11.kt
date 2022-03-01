// Nested Class(중첩 클래스)
// 객체지향 / 캡슐화

fun main() {

    val test1 = Test1.Test1NestedClass()
    test1.testFun1()
}

class Test1 {
    class Test1NestedClass {
        fun testFun1() {
            println("TestFun1")
        }
    }
}
