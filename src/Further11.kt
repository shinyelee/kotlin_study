fun main() {

    val test4 = Test4.Test4NestedClass()
    test4.testFun4()

    val test5 = Test5().Test5InnerClass()
    test5.testFun5()

}

// Nested Class(중첩 클래스)
// 객체지향 / 캡슐화
class Test4 {
    class Test4NestedClass {
        fun testFun4() {
            println("TestFun4")
        }
    }
}

// Inner Class(내부 클래스)
// RecyclerView
class Test5 {
    inner class Test5InnerClass {
        fun testFun5() {
            println("TestFun5")
        }
    }
}