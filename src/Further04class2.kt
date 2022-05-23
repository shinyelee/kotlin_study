// 상속 보충설명 (2)

fun main() {

    val korean = Korean()
//    인스턴스 생성할 때 함께 실행됨

    korean.singASong()
//    상속 전 : lalala

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

    // 자바와 달리 코틀린에서는 상속해 주는 function 앞에 open을 붙여줘야 함
    fun singASong() {
        println("상속 전 : lalala")
    }

}

class Korean : Human() {

//    Kotlin: 'singASong' in 'Human' is final and cannot be overridden
//    override fun singASong() {
//        println("상속 후 : 라라라")
//    }

}