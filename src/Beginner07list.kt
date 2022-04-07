// List(리스트) //

// 데이터를 모아 관리하는 콜렉션 클래스를 상속받는 서브 클래스(List, Set, Map) 중 가장 단순한 형태
// 여러 개의 데이터를 원하는 순서대로 넣어 관리하는 형태

fun main() {

    // List //
    // 생성시에 넣은 객체 대체/추가/삭제 불가능

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for (fruit in a) {
        print("${fruit}:")
    }
    println()



    // Mutable List //
    // 생성시에 넣은 객체 대체/추가/삭제 가능

    val b = mutableListOf(6, 3, 1)
    println(b)

    // add(데이터 추가)
    b.add(4)
    println(b)

    // add(데이터, 인덱스 추가)
    b.add(2, 8)
    println(b)

    // remove(데이터 삭제)
    // removeAt(인덱스 삭제)
    b.removeAt(1)
    println(b)

    // shuffle(랜덤, 순서 섞기)
    b.shuffle()
    println(b)

    // sort(정렬)
    b.sort()
    println(b)



    val cards = mutableListOf("Jack", "Queen", "King")
    println(cards)

    cards.add("Ace")
    println(cards)

    cards.remove("Jack")
    println(cards)

    // 전부 비우기
    cards.clear()
    println(cards)

    // 데이터 변경
    // list[인덱스] = 데이터

}