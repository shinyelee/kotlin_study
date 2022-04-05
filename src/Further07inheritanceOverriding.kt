// Overriding(오버라이딩) //

// 기본적으로 서브 클래스에서는 수퍼 클래스와 동일한 함수를 만들 수 없으나
// -> 오버라이딩 -> 부모클래스의 메소드를 자식클래스에서 재정의 및 사용 가능
// 이미 구현이 끝난 함수를 서브 클래스에서 변경해야 할 때 사용

fun main() {

    var t = Tiger()

    t.eat()

    // 오버라이딩 전
//    음식을 먹습니다

    // 오버라이딩 후
//    고기를 먹습니다

}

// 수퍼 클래스 내 함수 앞에 open 붙이고
open class Animal2 {
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal2() {
    // 서브 클래스 내 함수 앞에 override 붙이면 됨
    override fun eat() {
        println("고기를 먹습니다")
    }
}