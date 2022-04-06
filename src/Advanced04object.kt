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



    // Companion Object //
    // 클래스의 인스턴스 기능은 그대로 사용하면서
    // 인스턴스간에 공용으로 사용할 속성과 함수를 별도로 만드는 기능
    // 다른 언어의 Static 멤버와 비슷함

    // Static 멤버 //
    // 클래스 내부에서 별도의 영역에 고정적으로 존재하며
    // 인스턴스를 생성하지 않아도 공용으로 사용 가능한 속성이나 함수

    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println(a.count)
    println(b.count)
    println(FoodPoll.total)
//    2
//    3
//    5

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



// 예제
class FoodPoll (val name: String) {

    // 전체 투표수
    companion object {
        var total = 0
    }

    // 개별 투표수
    var count= 0

    // 투표 1씩 증가
    fun vote() {
        total++
        count++
    }

}