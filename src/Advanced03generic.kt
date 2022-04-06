// Generic(제너릭) //

// 함수나 클래스를 선언할 때 고정적인 자료형 대신
// 실제 자료형으로 대체되는 타입 파라미터를 받아 사용하는 방법

// 타입 파라미터는 관례적으로 <T> 사용
// (여럿일 경우 T, U, V 등 알파벳 사용)

// 제너릭을 특정한 수퍼 클래스를 상속받은 클래스 타입으로만 제한하려면
// <T: SuperClass> 라고 쓰면 됨

fun main() {

    UsingGeneric(S()).doSing()
    UsingGeneric(Y()).doSing()
//    시은이가 노래를 합니다
//    자윤이가 노래를 합니다

    doSing(Y())
    doSing(I())
//    자윤이가 노래를 합니다
//    아이사가 노래를 합니다

}

fun <T: S> doSing(t: T) {
    t.sing()
}

// 수퍼 클래스
open class S {
    open fun sing() {
        println("시은이가 노래를 합니다")
    }
}

class Y : S() {
    override fun sing() {
        println("자윤이가 노래를 합니다")
    }
}

class I : S() {
    override fun sing() {
        println("아이사가 노래를 합니다")
    }
}

class UsingGeneric<T: S> (val t: T) {
    fun doSing() {
        t.sing()
    }
}