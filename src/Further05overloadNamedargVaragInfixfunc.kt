// OverLoading(오버로딩) //

// 같은 스코프 안에서 같은 이름의 함수를 여러 개 만들 수 있는 기능

// 이름이 같고 파라미터(매개변수)의 자료형이 다르면 오버로딩 가능
// 이름이 같고 파라미터의 개수가 다르면 오버로딩 가능
// 이름이 같고 파라미터의 자료형과 개수가 같으면 오버로딩 불가능

fun main() {

    // 만약 기본 인자가 있다면 아래처럼 호출 가능
//    read(x)

    // 기본 인자가 없음
    read(7)
    read("감사합니다")
//    숫자 7 입니다
//    감사합니다



    // 꼭 모든 인자를 쓸 필요는 없음
    deliveryItem("짬뽕")
    deliveryItem("책", 4)
    deliveryItem("노트북", 1, "학교")
//    짬뽕, 2개를 집에 배달 완료
//    책, 4개를 집에 배달 완료
//    노트북, 1개를 학교에 배달 완료

    //    deliveryItem("선물",  "친구집")
//    Kotlin: Type mismatch: inferred type is String but Int was expected

    // Named Argument(명명된 인자, 지명 인자) //

    // 파라미터 개수가 많거나, 기본값이 많을 때 가독성을 높여줌
    // 파라미터의 순서와 관련없이 파라미터의 이름을 사용해 직접 파라미터 값 할당
    // -> count 생략해도 정상적으로 실행됨
    deliveryItem("선물",  destination = "친구집")
//    선물, 2개를 친구집에 배달 완료

    Gfriend().umji()
//    엄지의 데뷔일은 20150116
    Viviz().umji()
//    재데뷔했어도 엄지의 데뷔일은 여전히 20150116

    // first의 기본값이 사용됨
    apple(second = 2)
//    first : 1, second : 2



    sum(1, 2, 3, 4)
    println()
//        10



    val c = Calculator()
//    c.sumNumberTwo(1, 2)
//    c.sumNumberThree(1, 2, 3)
    c.sumNumber(1, 2)
    c.sumNumber(1, 2, 3)
    c.sumNumber("나는 ", "행복합니다")
//    3
//    6
//    나는 행복합니다

}



fun read(x: Int) {
    println("숫자 $x 입니다")
}

// 이름이 같고 자료형이 다름
fun read(x: String) {
    println(x)
}



// Default Arguments(기본 인자, 파라미터의 기본값) //

// (파라미터의) 기본값이 있으면 함수 호출시 해당 인자를 건너뛸 수 있음
// (따로 써넣지 않아도 기본값으로 세팅되기 때문에)
// -> 다른 언어에 비해 과부하 줄어듦
fun deliveryItem(name: String, count: Int = 2, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달 완료")
}
// 매개변수: 자료형 = 기본값
// 의 형태를 가짐(예시에선 count, destination)

// 기본 메서드의 기본값을
open class Gfriend {
    open fun umji(debut : Int = 20150116) {
        println("엄지의 데뷔일은 $debut")
    }
}
// 오버라이딩 메서드가 그대로 사용하기 때문에
class Viviz : Gfriend() {
    override fun umji(debut: Int) {
        println("재데뷔했어도 엄지의 데뷔일은 여전히 $debut")
    }
}
// 오버라이딩 메서드에서는 해당 파라미터의 기본값을 따로 가질 수 없음

// 기본값이 있는 파라미터가 기본값이 없는 파라미터 앞에 위치하면
fun apple(first: Int = 1, second: Int) {
    println("first : $first, second : $second")
}
// 기본값은 지명 인자로 함수를 호출해야만 사용할 수 있음



// Variable Number Of Arguments(가변 인자) //
// vararg
// 같은 자료형을 개수에 상관없이 파라미터로 받고 싶을 때 사용
// 개수가 지정되지 않은 파라미터 -> 다른 파라미터와 혼용시 맨 마지막에 표기
fun sum(vararg numbers: Int) {

    var sum = 0

    for(n in numbers) {
        sum += n
    }
    print(sum)

}



class Calculator() {

//    fun sumNumberTwo(a : Int, b : Int) {
//        println(a + b)
//    }

//    fun sumNumberThree(a : Int, b : Int, c : Int) {
//        println(a + b + c)
//    }

    fun sumNumber(a : Int, b : Int) {
        println(a + b)
    }

    fun sumNumber(a : Int, b : Int, c : Int) {
        println(a + b + c)
    }

    fun sumNumber(a : String, b : String) {
        println(a + b)
    }

}