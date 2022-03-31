// Kotlin Scope Function(스코프 함수)
// 함수형 언어의 특징을 좀 더 편리하게 사용할 수 있도록 기본 제공하는 함수

// apply
// 값을 반환하지 않고, 객체 구성에 대해 주로 사용
// 인스턴스 생성 후 변수에 담기 전 초기화 과정 수행에 많이 사용

// run
// 객체 초기화와 return값 계산이 필요할 때 주로 사용

// with
// 컨텍스트 내부에서 함수 호출

// also
// 객체에 대해 추가적인 작업

// let
// non null일 때 동작O null일때 동작X

fun main() {

    var a = Book("오마이걸의 Real Love", 10000).apply {
        title = "[초특가]" + title
        discount()
    }

}

class Book(var title: String, var price: Int)
{
    fun discount()
    {
        price -= 2000
    }
}