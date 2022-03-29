// Generic(제네릭)
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

    val box3 = Box3(10)
    println(box3.value)

    val box4 = Box3("10")
    println(box4.value)

    // 문자 123은 ㄱㅊ 숫자 123은 에러남
//    testFun1("123")
//    testFun1(123)

    // 둘 다 문제없이 출력됨됨
    testFun2("123")
    testFun2(123)
    
    // 꼭 T가 아니라 다른 알파벳이어도 ㄱㅊ
    testFun3("123")
    testFun3(123)
}

fun testFun1(a : String) {
    println(a)
}

fun <T> testFun2(a : T) {
    println(a)
}

fun <A> testFun3(a : A) {
    println(a)
}

class Box1(test : Int) {
    val value = test
}

class Box2(test : String) {
    var value = test
}

// Generic
class Box3<T>(test : T) {
    var value = test
}
