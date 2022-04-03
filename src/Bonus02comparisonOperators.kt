// Comparison Operators(비교연산자) //

// 부등호(>, >=, <, <=)
// 등호(!=, ==)
// 할당 연산자(=)
// is 연산자(is, !is)

fun main() {

    // a = b
    // b를 a에 할당한다
    var lucky = 7
    // 7이라는 값을 lucky라는 변수에 넣겠다는 뜻

    // a == b
    // a는 b와 같다
    if (lucky == 7) {
        println("seven")
    }
//    seven

    // a != b
    // a는 b와 같지 않다
    if (lucky != 13) {
        println("not bad")
    }
//    not bad



    // a > b
    // a는 b보다 크다

    // a >= b
    // a는 b보다 크거나 같다

    var score1 = 100
    if (score1 >= 150) {
        println("150 이상")
    } else {
        println("150 이상이 아님")
    }
//    150 이상이 아님



    // a < b
    // a는 b보다 작다

    // a <= b
    // a는 b보다 작거나 같다

    var score2 = 70
    if (score2 < 140) {
        println("140미만")
    }
    if (score2 <= 70) {
        println("70이하")
    }
//    140미만
//    70이하



    // a is String
    // a의 자료형은 String이다
    var type1 : Any = "abc"
    if(type1 is String) {
        println("this is string")
    } else {
        println("this is not string")
    }
//    this is string

    // a !is Int
    // a의 자료형은 Int가 아니다
    var type2 : Any = "abc"
    if(type2 !is Int) {
        println("this is not int")
    } else {
        println("this is int")
    }
//    this is not int

    // is 연산자는 나중에 재등장

}