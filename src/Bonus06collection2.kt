fun main () {

    data class Gfriend(val name: String, val birthYear: Int)

    val gfriendMembers = listOf(Gfriend("소정", 95),
                            Gfriend("예린",96),
                            Gfriend("은비",97),
                            Gfriend("은비",98),
                            Gfriend("예원",98),
                            Gfriend("유나",97))

    // associateBy //
    // 아이템에서 key를 추출해 map으로 변환
    println(gfriendMembers.associateBy { it.birthYear })
//    {95=Gfriend(name=소정, birthYear=95), 96=Gfriend(name=예린, birthYear=96), 97=Gfriend(name=유나, birthYear=97), 98=Gfriend(name=예원, birthYear=98)}

    // groupBy //
    // key가 같은 아이템끼리 배열로 묶어 map으로 만듦 <- 본명
    println(gfriendMembers.groupBy { it.name })
//    {소정=[Gfriend(name=소정, birthYear=95)], 예린=[Gfriend(name=예린, birthYear=96)], 은비=[Gfriend(name=은비, birthYear=97), Gfriend(name=은비, birthYear=98)], 예원=[Gfriend(name=예원, birthYear=98)], 유나=[Gfriend(name=유나, birthYear=97)]}

    // partition //
    // 아이템에 조건을 걸어 두 개의 컬렉션으로 나눔 <- 나이
    val (over97, under97) = gfriendMembers.partition { it.birthYear > 97 }

    println(over97)
    println(under97)
//    [Gfriend(name=은비, birthYear=98), Gfriend(name=예원, birthYear=98)]
//    [Gfriend(name=소정, birthYear=95), Gfriend(name=예린, birthYear=96), Gfriend(name=은비, birthYear=97), Gfriend(name=유나, birthYear=97)]



    val numbers = listOf(-3, 7, 2, -10, 1)

    // flatMap //
    // 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
    println(numbers.flatMap { listOf(it * 10, it + 10) })
//    [-30, 7, 70, 17, 20, 12, -100, 0, 10, 11]

    // getOrElse //
    // 인덱스 위치에 아이템이 있으면 아이템을 반환
    // -> 없으면 지정한 기본값을 반환
    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })
//    7
//    50

    val names = listOf("A", "B", "C", "D")

    // zip //
    // 컬렉션 두 개의 아이템을 1:1로 매칭해 새 컬렉션을 만듦
    // -> 결과 List의 아이템 개수는 더 작은 컬렉션을 따라감
    println(names zip numbers)
//    [(A, -3), (B, 7), (C, 2), (D, -10)]

}