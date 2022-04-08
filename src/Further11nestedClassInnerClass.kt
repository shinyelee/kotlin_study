fun main() {

    val test4 = Test4.Test4NestedClass()
    test4.testFun4()
//    TestFun4

    val test5 = Test5().Test5InnerClass()
    test5.testFun5()
//    TestFun5
//    tempText2



    Out.Nest().introduce()

    val outer = Out()
    val inner = outer.In()

    inner.introduceIn()
//    Nested Class
//    Inner Class

    inner.introduceOut()
//    Outer Class

    outer.text = "Changed Outer Class"
    inner.introduceOut()
//    Changed Outer Class

}

// Nested Class(중첩 클래스) //
// 객체지향 / 캡슐화
// 외부 클래스의 내용을 공유할 수 없는 별개의 클래스
class Test4 {
    val tempText1 = "tempText1"
    class Test4NestedClass {
        fun testFun4() {
            println("TestFun4")
            // Kotlin: Unresolved reference: tempText1
            // println(tempText1)
        }
    }
}

// Inner Class(내부 클래스) //
// RecyclerView
// 혼자서 객체를 만들 수 없음(외부 클래스의 객체가 있어야만 생성 및 사용 가능)
class Test5 {
    val tempText2 = "tempText2"
    inner class Test5InnerClass {
        fun testFun5() {
            println("TestFun5")
            println(tempText2)
        }
    }
}



// 실습
class Out {

    var text = "Outer Class"

    class Nest {

        fun introduce() {
            println("Nested Class")
        }

    }

    inner class In {

        var text = "Inner Class"

        fun introduceIn() {
            println(text)
        }

        fun introduceOut() {
            println(this@Out.text)
        }

    }

}