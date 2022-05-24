// 데이터 클래스 보충설명

fun main() {

    // 데이터 클래스
    val ticketA = Ticket("korean", "shinyelee", "2022-05-24", 11)

    // 객체의 내용을 출력
    println(ticketA)
//    Ticket(company=korean, name=shinyelee, date=2022-05-24, seatNum=11)

    // 일반 클래스
    val ticketB = Ticket2("korean", "shinyelee", "2022-05-24", 11)

    // 메모리 주소값을 출력
    println(ticketB)
//    Ticket2@b684286

}

// 데이터 클래스
data class Ticket(val company : String, val name : String, var date : String, var seatNum : Int)

// 일반 클래스
class Ticket2(val company : String, val name : String, var date : String, var seatNum : Int)

// toString(), hashCode(), equals(), copy()