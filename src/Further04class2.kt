// 생성자 보충설명 (4)

fun main() {

    val human = Human("shinyelee")
//    인스턴스 생성할 때 함께 실행됨

    val who = Human()
//    인스턴스 생성할 때 함께 실행됨

    human.eatingCake()
//    yummy!

    println("My name is ${who.name}")
//    My name is anonymous

    // 주생성자 -> 부생성자 순으로 실행
    // init 먼저 실행 후 -> constructor 블럭 실행
    val myBro = Human("min", 27)
//    인스턴스 생성할 때 함께 실행됨
//    My name is min, and 27 years old


}

// 주생성자
class Human(val name : String = "anonymous") {

    // 부생성자 -> this로 주생성자의 위임을 받아야 함
    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, and ${age} years old")
    }

    // init -> 주생성자의 일부
    init {
        println("인스턴스 생성할 때 함께 실행됨")
    }

    fun eatingCake() {
        println("yummy!")
    }

}