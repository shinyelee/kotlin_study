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

}