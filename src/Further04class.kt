// Class(클래스)

// class == 값 + 기능
// function == 기능

fun main() {

    var bts = Singer("정국", 1997)
    var txt = Singer("연준", 1999)
    var aespa = Singer("윈터", 2001)
    var nmixx = Singer("설윤", 2004)

//    println("안녕하세요, ${bts.birthYear}년생 ${bts.name}입니다.")
    // 너무 번거로움

//    bts.introduce()
//    txt.introduce()
//    aespa.introduce()
//    nmixx.introduce()
    // class내에 println function 추가 -> 코드가 훨씬 짧아짐

    var astro = Singer("은우")
    var twice = Singer("지효")
    // 보조생성자 -> 자동으로 1997년생 됨

}

// 클래스 속성 && 생성자 선언
//class Singer (var name: String, val birthYear: Int) {
//    fun introduce() {
//        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
//    }
//}
// constructor(생성자)
// 새 인스턴스를 만들기 위해 호출하는 특수한 함수
// 인스턴스 속성 초기화 && 인스턴스 생성시 구문 수행


class Singer (var name: String, val birthYear: Int) {
    // init
    // 파라미터/반환형 없는 함수
    // 생성자 -> 인스턴스 생성시 호출됨
    init {
        // this
        // 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내에서 사용되는 키워드
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다.")
    }
    // secondary constructor(보조 생성자)
    // 필요에 따라 추가적으로 선언
    // 기본 생성자와 다른 형태의 생성자 제공
    // -> 인스턴스 생성시 편의 제공 || 추가적인 구문 수행
    // (기본 생성자는 클래스를 만들 때 기본으로 선언)
    constructor(name: String) : this(name, 1997) {
        // 보조 생성자를 만들 때는 반드시 기본 생성자를 통해 속성을 초기화 해줘야 함
        // : this 쓴 후 기본 생성자가 필요로 하는 파라미터를 ()안에 넣어주면 됨
        println("보조생성자가 사용되었습니다")
    }
}
