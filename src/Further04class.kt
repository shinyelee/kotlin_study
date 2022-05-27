// Class(클래스) //
// 인스턴스를 만드는 틀

// Instance(인스턴스) //
// 클래스를 이용해 만들어내는 서로 다른 속성의 객체

// 클래스 == 값(속성) + 기능(함수)
// 함수 == 기능

fun main() {

    var bts = Singer("정국", 1997)
    var txt = Singer("연준", 1999)
    var aespa = Singer("윈터", 2001)
    var nmixx = Singer("설윤", 2004)
//    println("안녕하세요, ${bts.birthYear}년생 ${bts.name}입니다.")
    // 매번 쓰기 번거로움 -> 아예 클래스 내에 함수로 넣어주면 됨



    // class내에 println function 추가 -> 코드가 훨씬 짧아짐

//    bts.introduce()
//    안녕하세요, 1997년생 정국입니다.

//    txt.introduce()
//    안녕하세요, 1999년생 연준입니다.

//    aespa.introduce()
//    안녕하세요, 2001년생 윈터입니다.

//    nmixx.introduce()
//    안녕하세요, 2004년생 설윤입니다.



    // 보조생성자 -> 자동으로 1997년생 됨

    var astro = Singer("은우")
//    안녕하세요, 1997년생 은우입니다.
//    보조생성자가 사용되었습니다.

    var twice = Singer("지효")
//    안녕하세요, 1997년생 지효입니다.
//    보조생성자가 사용되었습니다.

}



// 클래스 기본 형태 //

// class 클래스명(매개변수, 기본 생성자 등) { 본문 }

// 있을 거 다 있는 클래스
class Normal(name: String) { /* 내용 */ }

// 몇몇 요소가 없는 클래스
class Normal2() { /* 내용 */ }
class Normal3()
class Normal4 { /* 내용 */ }
class Normal5



// 클래스 속성(생성자) 선언
//class Singer (var name: String, val birthYear: Int) {
//    fun introduce() {
//        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
//    }
//}

// constructor(생성자) //
// 새 인스턴스를 만들기 위해 호출하는 특수한 함수
// 인스턴스 속성 초기화 && 인스턴스 생성시 구문 수행

// () 안에 클래스가 가지는 속성 == 생성자
// 함수 없이 속성만 가지는 클래스는 이 한 줄로 구현 끝!
class Singer (var name: String, val birthYear: Int)
// 중괄호 안에 함수 추가 가능
{
    // init //
    // 파라미터/반환형 없는 함수
    // 생성자 -> 인스턴스 생성시 호출됨
    init {
        // this //
        // 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내에서 사용되는 키워드
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다.")
    }
    // secondary constructor(보조 생성자) //
    // 필요에 따라 추가적으로 선언
    // 기본 생성자와 다른 형태의 생성자 제공
    // -> 인스턴스 생성시 편의 제공 || 추가적인 구문 수행
    // (기본 생성자는 클래스를 만들 때 기본으로 선언)
    constructor(name: String) : this(name, 1997) {
        // 보조 생성자를 만들 때는 반드시 기본 생성자를 통해 속성을 초기화 해줘야 함
        // : this 쓴 후 기본 생성자가 필요로 하는 파라미터를 ()안에 넣어주면 됨
        println("보조생성자가 사용되었습니다.")
    }

}
