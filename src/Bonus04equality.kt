// Equality(변수의 동일성) //

// 내용의 동일성 //
// a == b
// 메모리상의 서로 다른 곳에 할당된 객체지만 내용이 같으면 동일하다고 판단함
// 코틀린의 모든 클래스가 내부적으로 상속받는 Any라는 최상위 클래스의
// equals() 함수가 반환하는 Boolean 값으로 판단

// 객체의 동일성 //
// a === b
// 서로 다른 변수가 메모리상의 같은 객체를 가리키면 동일하다고 판단함

fun main () {

    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    // 내용만 동일
    println(a == b)
    println(a === b)
//    true
//    false

    // 내용 및 객체 동일
    println(a == c)
    println(a === c)
//    true
//    true

    println(a == d)
    println(a === d)
//    false
//    false

}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Product) {
            return other.name == name && other.price ==price
        } else {
            return false
        }
    }
}