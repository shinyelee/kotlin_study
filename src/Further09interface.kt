// Interface(인터페이스)
// 서로 다른 기능들을 여러개 물려줘야 할 때 유용한 기능

// 추상함수로만 이루어져있는 순수 추상화 기능
// 속성 || 추상함수 || 일반함수 가질 수 있음
// 생성자를 가질 수 없음

fun main() {

    var d = Dogs()

    d.run()
    d.eat()

}

// 구현부 X 함수 -> 자동으로 abstract 함수로 인식 -> abstract 생략
interface Runner {
    fun run()
}

// 구현부 O 함수 -> 자동으로 open 함수로 인식 -> open 생략
interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

// 서브 클래스 하나가 한 번에 여러 인터페이스를 상속 받을 수 있음
class Dogs : Runner, Eater {
    override fun run() {
        println("WADADA WADADA 달려")
    }
    override fun eat() {
        println("like hubba-hubba")
    }
}