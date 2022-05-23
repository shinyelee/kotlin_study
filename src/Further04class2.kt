// 상속 보충설명 (4)

fun main() {

    val korean = Korean()
//    인스턴스 생성할 때 함께 실행됨

    korean.singASong()
//    상속 전 : lalala
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
        // 상속 전 메서드와 상속 후 메서드를 모두 쓰고 싶다면
        // super.메서드명
        // 형태로 활용하면 됨
        super.singASong()
        println("상속 후 : 라라라")
    }

}