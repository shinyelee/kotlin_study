// 클래스 보충설명

fun main() {

    // 인스턴스 객체 생성 후
    val human = Human()

    // 점 연산자를 붙여 클래스 내 변수/함수에 접근 가능
    human.eatingCake()

}

// Class(클래스) 생성
class Human {

    // Property(프로퍼티, 속성) //
    // 클래스 안에 들어가는 변수
    val name : String = "shinyelee"
    // 프로퍼티 정의

    // Method(메서드, 함수) //
    // 클래스 안에 들어가는 함수
    fun eatingCake() {
        println("yummy!")
    }
    // 메서드 정의

    // 클래스 안에는 다수의 속성과 메서드가 들어갈 수 있음

}