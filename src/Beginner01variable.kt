// Variables(변수) //

// 값을 저장하는 메모리 공간

fun main() {

    // Variable Declaration(변수 선언) //

    // var 변수명: 변수타입 = 변수값
    // 이런 형태로 작성
    var greeting: String = "Hello World!"

    // : String 생략해도 OK
    // (자세한 내용은 자료형에서 추가 설명)
    var greeting2 = "Hello World!"

    // 변수를 초기화 할 때는 var 필수
    // -> 값 수정할 때는 var를 생략
    var greeting3 = "Hello World!"
    greeting3 = "Hello Kotlin!"

    // 변수명은 camelCase(카멜표기법)으로 작성
    // -> 아래와 같이 띄어쓰기를 대문자로 대체함
    var permissionToDance = "We don't need permission to dance"
    var dreamsComeTrue = "나를 지켜줄 거야 아껴왔던 작은 사랑도"



    // Mutable Variable(가변 변수) //

    // 일반적인 변수
    // 언제든지 읽기/쓰기 가능
    // 변수명 앞에 var 붙임
    // variable -> var

    var greeting4 = "Hello World!"
    // 재정의 가능
    greeting4 = "Hello Kotlin!"



    // Immutable Variable(불변 변수) //

    // 선언시에만 초기화
    // 읽기만 가능(중간에 값 변경 불가) <- 그치만 상수랑은 다름
    // 변수명 앞에 val 붙임
    // value -> val

    val greeting5 = "Hello World!"
    // 재정의 불가능
//    greeting5 = "Hello Kotlin!"
//    Kotlin: Val cannot be reassigned

    // Int 타입의 상수 whatType을 선언(냅다 자료형만 지정) 후
    val whatType : Int
    // Int 타입의 값을 대입해주는 건 가능함
    whatType = 1
    // 물론 재정의는 안 됨
//    val whatType = 1
//    Kotlin: Conflicting declarations: val whatType: Int, val whatType: Int

    // 즉시 할당
    val a: Int = 1

    // (Int로) 타입 추론
    val b = 2

    // 자료형 먼저 명시한 후
    val c: Int
    // 나중에 할당(지연 초기화)
    c = 3

    // 수정할 수 없는 변수를 만들고 싶다면 var 대신 val 사용



    // 다음에 배울 내용 //

    // 클래스에 선언된 변수 -> Property(속성)
    // 스코프 내에 선언된 변수 -> Local Variable(지역 변수)
    // 자료형 뒤에 ? 붙여서 nullable 변수로 선언
//    var nullable: Int? = null

}
