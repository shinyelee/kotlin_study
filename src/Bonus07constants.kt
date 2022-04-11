// Constants(상수) //

// 컴파일 시점에 결정 -> 절대 바꿀 수 없음(val보다 더 빡셈)
// 기본 자료형(String 포함)만 상수로 선언 가능
// 런타임에 생성될 수 있는 일반적인 다른 클래스의 객체들은 담을 수 없음
// 상수의 이름은 의례적으로 대문자와 언더바 사용해 변수와 구분함

fun main() {

    // var -> 한 번 할당한 객체 다른 객체로 변경해 할당 가능
    var itzy = "채령"
    itzy = "류진"

    // val -> 한 번 할당한 객체 변경 불가
    // (객체 내부의 속성은 변경 가능)
    val idle = "우기"
//    idle = "수진"
//    Kotlin: Val cannot be reassigned

    // 근데 무슨 수를 써도 절대 못 바꾸는 게 상수!



    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
//    크림파스타의 가격은 13000원 입니다.
//    스테이크의 가격은 25000원 입니다.
//    피자의 가격은 15000원 입니다.

    // 근데 왜 굳이 상수를 쓰는 거임? 변수 쓰면 안 됨?
    // -> 변수는 런타임시 객체 생성에 시간이 더 걸림(성능 하락)
    // -> 상수는 객체 생성 없이 메모리에 값을 고정해 사용
    // -> 고정값은 상수로 만드는 게 성능면에서 더 나음

}

// companion object 내에 선언
// -> 객체의 생성과 상관없이 클래스와 관계된 고정적인 값으로만 사용
class Sample {
    companion object {
        const val CONST_A = 1234
    }
}

// 클래스의 속성으로 사용 불가
//    class Sample {
//        const val CONST_A =1234
//    }
//    Kotlin: Const 'val' are only allowed on top level or in objects

// 지역 변수로도 사용 불가
//    fun Sample {
//        const val CONST_A =1234
//    }
//    Kotlin: Expecting '('



class FoodCourt {

    fun searchPrice(foodName: String) {
        val price = when(foodName)
        {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다.")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }

}