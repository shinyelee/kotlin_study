// generic(제네릭)
// 컴파일시 타입 체크 가능
// 타입캐스팅 노필요

fun main() {

    val box1 = Box1(10)
    println(box1.value)

    val box2 = Box2("문자 10")
    println(box2.value)

    // 문자 10을 box1에 넣으려면 원래는 이렇게 해야함
    val box1_1 = Box1("10".toInt())
    println(box1_1.value)

}

class Box1(test : Int) {
    val value = test
}

class Box2(test : String) {
    var value = test
}