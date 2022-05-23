// 생성자 보충설명 (2)

fun main() {

    val human = Human("shinyelee")

    human.eatingCake()
//    yummy!

    println("My name is ${human.name}")
//    My name is shinyelee

}

// class Human constructor(val name : String) {}
// constructor 생략 가능
class Human(val name : String) {
    // 프로퍼티를 생성자에서 직접 선언 -> 코드 깔끔해짐

    fun eatingCake() {
        println("yummy!")
    }

}