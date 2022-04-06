// Object(오브젝트) //
// 객체를 한 개만 생성하도록 하며 전역으로 생성 가능
// 하나의 객체로 공통적인 속성과 함수를 사용해야 할 때 -> 클래스보다 오브젝트가 나음
// 싱글톤 패턴을 언어 차원에서 지원하는 것

// Singleton Pattern(싱글톤 패턴) //
// 디자인 패턴(코드를 어떻게 짜는게 더 좋고, 어떤 방식으로 구성해야 유지보수가 쉬운가) 중 하나
// 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴

fun main() {

    // 오브젝트는 인스턴스를 생성하지 않음
    // -> 오브젝트명.멤버명 형태로 사용
    println(Counter.count)
//    0

    Counter.countUp()
    println(Counter.count)
//    1

    Counter.countUp()
    println(Counter.count)
//    2

    Counter.clear()
    println(Counter.count)
//    0

    // 오브젝트로 선언된 객체는 최초 사용시 자동으로 생성됨
    // -> 이후에는 코드 전체에서 공용으로 사용할 수 있음

}

// 오브젝트는 객체 그잡채 -> 생성자 사용하지 않음
object Counter {

    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}
