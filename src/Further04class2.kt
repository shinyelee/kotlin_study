// 생성자 보충설명 (1)

fun main() {

    val human = Human("shinyelee")

    human.eatingCake()
//    yummy!

    println("My name is ${human.name}")
//    My name is shinyelee

}

// 생성자가 없는 클래스의 예시
class Human1 {}

// 생성자가 있는 클래스의 예시
class Human2() {} // 인자 0개
class Human3(age : Int) {} // 인자 1개
class Human4(fistName : String, lastName : String) {} // 인자 2개 이상

// 클래스 선언부에서 클래스명 옆에 괄호를 붙여 생성자를 만듦
// -> 기본 생성자
class Human(name : String) {

    val name : String = name
//    Property is explicitly assigned to parameter name, so it can be declared directly in constructor

    fun eatingCake() {
        println("yummy!")
    }

}