// 상속 보충설명 (1)

fun main() {

}

// 자바와 달리 코틀린에서는 상속해 주는 class 앞에 open을 붙여줘야 함
class Human(val name : String = "anonymous") {

    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, and ${age} years old")
    }

    init {
        println("인스턴스 생성할 때 함께 실행됨")
    }

    fun eatingCake() {
        println("yummy!")
    }

    fun singASong() {
        println("상속 전 : lalala")
    }

}

//Kotlin: This type is final, so it cannot be inherited from
//class Korean : Human() {}