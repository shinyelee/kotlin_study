// Lateinit(늦은 초기화) //

fun main () {

    // 자료형만 지정해두고 객체는 나중에 할당 -> 기본적으로는 컴파일 안 됨
    // 킹치만 변수에 객체를 할당하는 것을 선언과 동시에 할 수 없을 때도 있음ㅠㅠ
//    var 변수명: 자료형

    // 이 때 lateinit 사용 -> 선 변수선언 후 초기값할당
//    lateinit var 변수명: 자료형

    // 대신 초기값 할당 전까지 변수를 사용할 수 없고(에러)
    // 기본 자료형에는 사용할 수 없음(String 클래스는 가능)

    // lateinit 변수의 초기화 여부 확인
//    ::변수명.isInitialized

    val a = LateInitSample()
    println(a.getLateInitText())
//    기본값

    a.text = "새로 할당한 값"
    println(a.getLateInitText())
//    새로 할당한 값

}

class LateInitSample {

    lateinit var text: String

    fun getLateInitText(): String {

        if(::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }

    }

}