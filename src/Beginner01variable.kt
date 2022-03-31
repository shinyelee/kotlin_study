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



    // 다음에 배울 내용 //

    // 클래스에 선언된 변수 -> Property(속성)
    // 스코프 내에 선언된 변수 -> Local Variable(지역 변수)
    // 자료형 뒤에 ? 붙여서 nullable 변수로 선언
//    var nullable: Int? = null

}
