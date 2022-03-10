// object => 싱글톤패턴(디자인 패턴 중 하나)
// 디자인패턴 => 코드르 ㄹ어떻게 짜는게 더 좋고, 어떤 방식으로 구성해야 유지보수가 쉬운가
// 객체를 한 개만 생성하도록 함
// 전역으로 생성 가능

fun main() {

    // testClass가 2번 출력됨
    val test1 = TestClass()
    val test2 = TestClass()

    test1.count = 10

    // Object는 객체를 한 번만 생성하기 때문에
    println(test1.count) // 얘는 10
    println(test2.count) // 얘는 0이 된다

    // 객체를 한 번만 생성하기 때문에
    // testObject가 1번만 출력됨
    val test3 = testObject
    val test4 = testObject

    test3.count = 10

    println(test3.count)
    println(test4.count)

}

object testObject {
    init {
        println("testObject")
    }
    var count = 0
}

class TestClass() {
    init {
        println("testClass")
    }
    var count = 0
}