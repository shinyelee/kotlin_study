// Abstract(추상화)
// 형식만 선언하고 실제 구현은 서브 클래스에 일임할 때 사용하는 기능

// Abstraction Function(추상 함수)
// 선언부만 있고 기능이 구현되지 않은 함수

// Abstraction Class(추상 클래스)
// 추상 함수를 포함하는 클래스

fun main() {

    var r = Carot()

    r.lead()
    r.response()

}

abstract class Game {
    // 얘는 추상 함수(껍데기만 있음)
    abstract fun response()
    // 얘는 일반 함수(내용물이 있음)
    fun lead() {
        println("바니바니 바니바니")
    }
}
// 추상 클래스는 일부 함수가 구현되지 않은 미완성 클래스
// -> 단독으로 인스턴스 만들기 불가능
// -> 서브 클래스에서 상속을 받아 추상 함수를 구현해야 함

// Animal 상속 받음
class Carot : Game() {
    // eat 함수가 실제 동작되는 구현부
    override fun response() {
        println("당근 당근")
    }
}