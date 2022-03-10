// object => 싱글톤패턴(디자인 패턴 중 하나)
// 디자인패턴 => 코드르 ㄹ어떻게 짜는게 더 좋고, 어떤 방식으로 구성해야 유지보수가 쉬운가
// 객체를 한 개만 생성하도록 한다

fun main() {

    // testClass가 2번 출력됨
    val test1 = TestClass()
    val test2 = TestClass()

    // 객체를 한 번만 생성하기 때문에
    // testObject가 1번만 출력됨
    val test3 = testObject
    val test4 = testObject

}

object testObject {
    init {
        println("testObject")
    }
}

class TestClass() {
    init {
        println("testClass")
    }
}