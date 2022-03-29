// Maps(맵)

fun main() {

    // 키-값 저장
    val cards = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println(cards)

    // 키 사용해 값 검색
    val jackValue = cards["Jack"]
    println(jackValue)

    // mutable map이어야
    val cards2 = mutableMapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println(cards2)
    // 아이템 추가 가능
    cards2["Ace"] = 1
    println(cards2)


    // mutable map으로 변환하기
    val cards3 = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println(cards3)
    val mutableCards = cards.toMutableMap()
    mutableCards["Ace"] = 1
    println(mutableCards)

}