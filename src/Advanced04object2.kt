// 싱글톤 패턴 보충설명

fun main() {

    // 10마력짜리 car 생성
    val car = CarFactory.makeCar(10)

    // 20마력짜리 car2 생성
    val car2 = CarFactory.makeCar(20)

    println(car)
//    Car(horsePower=10)

    println(car2)
//    Car(horsePower=20)

    println(CarFactory.cars.size.toString())
//    2
}

// 싱글톤 패턴
object CarFactory {

    // cars라는 이름의 자동차 리스트
    val cars = mutableListOf<Car>()

    // 자동차 생성하는 함수
    fun makeCar(horsePower: Int) : Car {

        // 몇 마력?
        val car = Car(horsePower)

        // 리스트에 추가
        cars.add(car)

        // 리턴
        return car

    }

}

// 데이터 클래스
data class Car(val horsePower : Int)