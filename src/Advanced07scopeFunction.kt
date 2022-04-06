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
// run과의 공통점 -> 동일한 기능
// run과의 차이점 -> 인스턴스를 참조연산자 대신 파라미터로 받음
// a.run {...}
// with(a) {...}

// also //
// apply와의 공통점 -> 처리가 끝나면 인스턴스를 반환

// let //
// run과의 공통점 -> 처리가 끝나면 최종값을 반환

// also && let //
// 같은 이름의 변수나 함수가 스코프 바깥에 중복된 경우 혼란을 방지하기 위해
// -> 파라미터로 인스턴스를 넘긴 것처럼 it을 통해 인스턴스 사용

fun main() {

    // run 함수가 메인함수의 price 변수를 우선시함
    // -> 8000원이 아닌 5000원 출력
    // -> let 사용하면 해결!(run->let처럼 apply->also로 대체 가능)
    var price = 5000
//    상품명: [초특가]오마이걸의 Real Love, 가격: 5000원

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

    // let
    a.let {
        // .let 붙이고 it. 붙이면 됨
        println("상품명: ${it.title}, 가격: ${it.price}원")
    }
//    상품명: [초특가]오마이걸의 Real Love, 가격: 8000원

}

class Book(var title: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}