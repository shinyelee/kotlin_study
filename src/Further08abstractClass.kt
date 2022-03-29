// Abstract Class(추상클래스)

fun main() {

//    Bike().wheel()
//    Bike().engine()
    BMW().wheel()
    BMW().engine()
    Benz().wheel()
    Benz().engine()

}

//open class Car {
//    open fun wheel() {
//        println("굴러갑니다")
//    }
//    open fun engine() {
//        println("시동이 켜졌습니다")
//    }
//}
//
//class Bike() : Car() {
//    override fun wheel() {
//        println("자전거가 굴러갑니다")
//    }
//}


// 추상클래스
abstract class Car {
    abstract fun wheel()
    abstract fun engine()
}

class BMW() : Car() {
    override fun wheel() {
        println("BMW 굴러갑니다")
    }
    override fun engine() {
        println("BMW 시동이 켜졌습니다")
    }
}
// 둘 중 하나라도 안 채워지면 에러
// Kotlin: Class 'BMW' is not abstract and does not implement abstract base class member public abstract fun wheel(): Unit defined in Car

class Benz() : Car() {
    override fun wheel() {
        println("Benz 굴러갑니다")
    }
    override fun engine() {
        println("Benz 시동이 켜졌습니다")
    }
}