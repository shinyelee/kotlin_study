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

}

class Human(val name : String = "anonymous") {

    init {
        println("인스턴스 생성할 때 함께 실행됨")
    }

    fun eatingCake() {
        println("yummy!")
    }

}