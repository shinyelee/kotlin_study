// 상속 보충설명 (5)

fun main() {

    val korean = Korean()
//    인스턴스 생성할 때 함께 실행됨

    korean.singASong()
//    상속 전 : lalala
//    상속 후 : 라라라
//    I'm anonymous

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

        super.singASong()
        println("상속 후 : 라라라")
        // 상속 받았기 때문에 Human 클래스의 매개변수(파라미터)를 받아옴
        // name 기본값이 "anonymous"이므로
        // I'm anonymous
        // 를 출력함
        println("I'm ${name}")

    }

}