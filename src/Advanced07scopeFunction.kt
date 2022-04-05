// Kotlin Scope Function(스코프 함수) //
// 함수형 언어의 특징을 좀 더 편리하게 사용할 수 있도록 기본 제공하는 함수

// apply //
// 인스턴스 생성 후 변수에 담기 전 초기화 과정 수행에 많이 사용
// 메인 함수와 별도의 스코프에서 인스턴스의 변수 및 함수 조작
// -> 코드가 깔끔해짐

// run //
// apply와의 공통점 -> run 스코프 안에서 참조연산자를 사용하지 않아도 됨
// apply와의 차이점 -> 일반 람다함수처럼 인스턴스대신 마지막 구문에 결과값을 반환
// 이미 인스턴스 만든 후 인스턴스의 함수나 속성을 스코프 내에서 사용시 유용

// with //

// also //

// let //

fun main() {
    // 인스턴스에 .apply 붙이고 람다함수 만듦
    var a = Book("오마이걸의 Real Love", 10000).apply {
        // -> apply의 스코프 안에서 직접 인스턴스의 속성 및 함수 사용
        title = "[초특가]" + title
        discount()
    }

    // run
    a.run {
        println("상품명: ${title}, 가격: ${price}원")
    }
//    상품명: [초특가]오마이걸의 Real Love, 가격: 8000원

}

class Book(var title: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}