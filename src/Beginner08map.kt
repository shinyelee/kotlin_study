// Maps(맵)

fun main() {

    // key(키)-value(값) 저장
    val cards = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println(cards)
//    {Jack=11, Queen=12, King=13}

    // 키 사용해 값 검색
    val jackValue = cards["Jack"]
    println(jackValue)
//    11

    // mutable map이어야
    val cards2 = mutableMapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println(cards2)
//    {Jack=11, Queen=12, King=13}

    // 아이템 추가 및 삭제 가능
    cards2["Ace"] = 1
    println(cards2)
//    {Jack=11, Queen=12, King=13, Ace=1}


    // mutable map으로 변환하기
    val cards3 = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println(cards3)
//    {Jack=11, Queen=12, King=13}

    val mutableCards = cards.toMutableMap()
    mutableCards["Ace"] = 1
    println(mutableCards)
//    {Jack=11, Queen=12, King=13, Ace=1}

}