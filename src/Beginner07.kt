// Lists(리스트)

fun main() {

    // mutable list는 수정 가능한 리스트

    // 생성
    val cards = mutableListOf("Jack", "Queen", "King")
    println(cards)

    // 추가
    cards.add("Ace")
    println(cards)

    // 삭제
    cards.remove("Jack")
    println(cards)

    // 전부 비우기
    cards.clear()
    println(cards)

}