// Enum(enumerations) Class //

fun main() {

//    println(Direction.NORTH)
//    Direction.values().forEach {
//        println(it)
//    }
//
//    CustomerType.values().forEach {
//        println(it)
//    }

//    val direction = Direction.EAST
//    when(direction) {
//        Direction.NORTH -> {
//            println("N")
//        }
//        Direction.SOUTH -> {
//            println("S")
//        }
//        Direction.WEST -> {
//            println("W")
//        }
//        Direction.EAST -> {
//            println("E")
//        }
//    }

//    val color = Color.GREEN
//    when(color) {
//        Color.RED -> {
//            println(Color.RED.colorName)
//        }
//        Color.GREEN -> {
//            println(Color.GREEN.colorName)
//        }
//        Color.BLUE -> {
//            println(Color.BLUE.colorName)
//        }
//    }

    println(Device.DEVICE_ON.status)
    Device.DEVICE_ON.status = "OFF"
    println(Device.DEVICE_ON.status)

}

enum class Device(var status : String) {
    DEVICE_ON("ON"),
    NETWORK("OFF"),
    LOCATION("SEOUL")
}

//enum class Color(val colorName : String) {
//    RED("빨강"),
//    GREEN("초록"),
//    BLUE("파랑")
//}

//enum class Direction {
//    NORTH, SOUTH, WEST, EAST
//}

//enum class CustomerType {
//    A, B, C, D, VIP
//}