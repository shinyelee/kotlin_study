fun main () {

    // 자료형만 지정해두고 객체는 나중에 할당 -> 기본적으로는 컴파일 안 됨
//    var 변수명: 자료형



    // Lateinit(늦은 초기화) //

    // 킹치만 변수에 객체를 할당하는 것을 선언과 동시에 할 수 없을 때도 있음ㅠㅠ
    // -> 이 때 lateinit 사용
    // 선 변수선언 후 초기값할당
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



    // Lazy Delegate Properties(지연 대리자 속성) //

    // 변수를 사용하는 시점까지 초기화를 자동으로 늦춤

    // val 변수명: 자료형 by lazy {어쩌구}
    // 코드상 -> 선언시 즉시 객체를 생성 및 할당하여 변수를 초기화하는 형태

    // 실제 실행 -> 변수를 사용하는 시점에 어쩌구로 초기화 과정 진행
//   println(변수명)
    // -> 코드 실행시간 최적화

//    val 변수명: Int by lazy {
//        println("initializing")
//        어쩌구
//    }
    // 람다함수로 초기화가 진행됨 -> 함수 안에 여러 개의 구문이 들어갈 수 있음
    // 맨 마지막 구문의 결과(어쩌구)가 변수에 할당됨

    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
//    코드를 시작합니다
//    초기화를 합니다
//    7
//    7

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