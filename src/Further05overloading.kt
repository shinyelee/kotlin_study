// OverLoading(오버로딩) //

// 같은 스코프 안에서 같은 이름의 함수를 여러 개 만들 수 있는 기능

// 이름이 같고 파라미터의 자료형이 다르면 오버로딩 가능
// 이름이 같고 파라미터의 개수가 다르면 오버로딩 가능
// 이름이 같고 파라미터의 자료형과 개수가 같으면 오버로딩 불가능

fun main() {

    read(7)
    read("감사합니다")
//    숫자 7 입니다
//    감사합니다



    deliveryItem("짬뽕")
    deliveryItem("책", 4)
    deliveryItem("노트북", 1, "학교")
//    짬뽕, 2개를 집에 배달 완료
//    책, 4개를 집에 배달 완료
//    노트북, 1개를 학교에 배달 완료

    //    deliveryItem("선물",  "친구집")
//    Kotlin: Type mismatch: inferred type is String but Int was expected

    // Named Arguments //
    // 파라미터의 순서와 관련없이 파라미터의 이름을 사용해 직접 파라미터 값 할당
    // -> count 생략해도 정상적으로 실행됨
    deliveryItem("선물",  destination = "친구집")
//    선물, 2개를 친구집에 배달 완료



    sum(1, 2, 3, 4)
//    10
    println()



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



fun deliveryItem(name: String, count: Int = 2, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달 완료")
}



// Variable Number Of Arguments //
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