// 상속 보충설명 (3)

fun main() {

    val korean = Korean()
//    인스턴스 생성할 때 함께 실행됨

    // 상속됨
    korean.singASong()
//    상속 후 : 라라라

}

open class Human(val name : String = "anonymous") {

    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, and ${age} years old")
    }

    init {
        println("인스턴스 생성할 때 함께 실행됨")
    }

    fun eatingCake() {
        println("yummy!")
    }

    open fun singASong() {
        println("상속 전 : lalala")
    }

}

class Korean : Human() {

    override fun singASong() {
        println("상속 후 : 라라라")
    }

}