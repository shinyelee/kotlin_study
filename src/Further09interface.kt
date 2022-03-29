// 인터페이스(Interface)

fun main() {

    BMW3().wheel()
    BMW3().engine()
    BMW3().autoDriving()
    BMW3().autoParking()

}

//interface Car2 {
//    fun wheel()
//    fun engine()
//}
//
//class BMW2() : Car2 {
//    override fun wheel() {
//        println("wheel 돌아감")
//    }
//    override fun engine() {
//        println("엔진 돌아감")
//    }
//}

abstract class Car3 {
    abstract fun wheel()
    abstract fun engine()
}

interface CarAutoDriving {
    fun autoDriving()
}

interface CarAutoParking {
    fun autoParking()
}

class BMW3() : Car3(), CarAutoDriving, CarAutoParking {
    override fun wheel() {
        println("wheel 돌아감")
    }
    override fun engine() {
        println("엔진 돌아감")
    }
    override fun autoDriving() {
        println("BMW3 자율주행")
    }
    override fun autoParking() {
        println("BMW 자동주차")
    }
}

class Benz3() : Car3() {
    override fun wheel() {
        println("wheel 돌아감")
    }
    override fun engine() {
        println("엔진 돌아감")
    }
    fun autoParking() {
        println("Benz3 자동주차")
    }
}