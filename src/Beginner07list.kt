// List(리스트) //

// 데이터를 모아 관리하는 콜렉션 클래스를 상속받는 서브 클래스(List, Set, Map) 중 가장 단순한 형태
// 여러 개의 데이터를 원하는 순서대로 넣어 관리하는 형태

fun main() {

    // List //
    // 생성시에 넣은 객체 대체/추가/삭제 불가능

//    val a : List<String> = listOf("사과", "딸기", "배")
    // 코틀린은 알아서 타입추론하기 때문에
    // : List<String> 즉 자료형 부분 생략 가능
    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for (fruit in a) {
        print("${fruit}:")
    }
    println()

    // : List<Any>일 경우 자료형 아무거나 다 넣을 수 있음
//    val anyList : List<Any> = listOf(4,"b",5L)
    // 자료형 생략
    val anyList = listOf(4,"b",5L)

    // 리스트는 배열과 달리 인터페이스
    // 객체 가져올 순 있어도 그 값을 직접 바꾸는 것은 불가능
    var result = a.get(0)



    // Mutable List //
    // 생성시에 넣은 객체 대체/추가/삭제 가능

    // arrayList 초기화
//    val arrList : ArrayList<Int> = arrayListOf<Int>()
    // 자료형 생략
    val arrList = arrayListOf<Int>()

    // var 아니고 val인 이유?
    // -> 객체 대체/추가/삭제 (O)
    // -> 리스트 자체를 재정의 (X)
    arrList.add(10)
    arrList.add(20)
//    arrList = arrayListOf()
//    Kotlin: Val cannot be reassigned



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