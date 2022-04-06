// Companion Object //
// 클래스의 인스턴스 기능은 그대로 사용하면서
// 인스턴스간에 공용으로 사용할 속성과 함수를 별도로 만드는 기능
// 다른 언어의 Static 멤버와 비슷함

// Static 멤버 //
// 클래스 내부에서 별도의 영역에 고정적으로 존재하며
// 인스턴스를 생성하지 않아도 공용으로 사용 가능한 속성이나 함수

fun main() {

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