// Inheritance(상속)
// 자식 클래스가 부모 클래스의 멤버를 물려받음
// Overriding(오버라이딩)
// 부모클래스의 메소드를 자식클래스에서 재정의해서 사용할 수 있음

fun main() {

//    Parents().doing()
//    Parents().disease()
    Child().doing()
    Child().disease()

}

// open 붙여줘야 상속 가능
open class Parents() {
    fun doing() {
        println("자식을 돌봅니다")
    }
    // open 붙여줘야 재정의 가능
    open fun disease() {
        println("비염이 있습니다")
    }
}

class Child() : Parents() {
    override fun disease() {
        // 재정의 하고 싶지 않을 때 super 붙임
//        super.disease()
        // 재정의 하고 싶을 때 걍 새로 쓰면 됨
        println("겁이 많습니다")
    }
}