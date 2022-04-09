// Enum(enumerated type) Class(열거형 클래스) //

// 클래스 내 객체는 관행적으로 대문자로 기술
// 클래스 내 객체는 고유한 속성 가짐(생성자 있으면 객체 선언시 속성 설정 가능)
// 클래스 내 함수 기술시 마지막 객체 뒤에 세미콜론(;) 붙인 후 추가

fun main() {

    var state = State.SING
    println(state)
//    SING

    state = State.SLEEP
    println(state.isSleeping())
//    true

    state = State.EAT
    println(state.message)
//    밥을 먹습니다



    println(Direction.NORTH)
//    NORTH

    Direction.values().forEach {
        println(it)
    }
//    NORTH
//    SOUTH
//    WEST
//    EAST



    CustomerType.values().forEach {
        println(it)
    }
//    A
//    B
//    C
//    D
//    VIP



    val direction = Direction.EAST
//    E

    when(direction) {
        Direction.NORTH -> {
            println("N")
        }
        Direction.SOUTH -> {
            println("S")
        }
        Direction.WEST -> {
            println("W")
        }
        Direction.EAST -> {
            println("E")
        }
    }



    val color = Color.GREEN
//    초록

    when(color) {
        Color.RED -> {
            println(Color.RED.colorName)
        }
        Color.GREEN -> {
            println(Color.GREEN.colorName)
        }
        Color.BLUE -> {
            println(Color.BLUE.colorName)
        }
    }



    println(Device.DEVICE_ON.status)
//    ON

    Device.DEVICE_ON.status = "OFF"
    println(Device.DEVICE_ON.status)
//    OFF

}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");
    fun isSleeping() = this == State.SLEEP
}

enum class Device(var status : String) {
    DEVICE_ON("ON"),
    NETWORK("OFF"),
    LOCATION("SEOUL")
}

enum class Color(val colorName : String) {
    RED("빨강"),
    GREEN("초록"),
    BLUE("파랑")
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class CustomerType {
    A, B, C, D, VIP
}