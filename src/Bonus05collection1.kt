// Collection Function(컬렉션 함수) //

// list, set, map 같은 컬렉션 또는 배열에 일반 함수 또는 람다 함수 형태를 사용해
// for문 없이도 아이템을 순회하며 참조하거나 조건을 걸고, 구조의 변경까지 가능한 여러가지 함수
// 반복문 및 조건문 대체 가능

fun main () {

    val nameList = listOf("최연준", "최수빈", "최범규", "강태현", "휴닝카이")

    // forEach //
    // 전체 반환
    nameList.forEach {print(it + " ")}
    println()
//    최연준 최수빈 최범규 강태현 휴닝카이

    // filter //
    // 조건에 맞는 객체만 반환
    println(nameList.filter{it.startsWith("강")})
//    [강태현]

    // map //
    // 수식 일괄 적용해 반환
    println(nameList.map{"이름 : "+it})
//    [이름 : 최연준, 이름 : 최수빈, 이름 : 최범규, 이름 : 강태현, 이름 : 휴닝카이]

    // any //
    // 하나라도 조건에 맞으면 true
    println(nameList.any{it == "휴닝바히에"})
//    false

    // all //
    // 모두 조건에 맞으면 true
    println(nameList.all{it.length == 3})
//    false

    // none //
    // 하나라도 조건에 맞지 않으면 true
    println(nameList.none{it.startsWith("김")})
//    true

    // first 또는 find //
    // 첫 번째 객체 반환
    // 조건 걸면 조건에 맞는 첫 번째 객체 반환
    println(nameList.first{it.startsWith("최")})
//    최연준

    // last 또는 findLast //
    // 마지막 객체 반환
    // 조건 걸면 조건에 맞는 마지막 객체 반환
    println(nameList.last{it.startsWith("최")})
//    최범규

    // first, last 쓸 때 조건에 맞는 객체 없으면 NoSuchElementException 발생생
    // -> firstOrNull, lastOrNull 사용하면 해당 객체 없을 때 null 반환

    // count //
    // 아이템 개수 반환
    // 조건 걸면 조건에 맞는 아이템 개수 반환
    println(nameList.count{it.contains("수")})
//    1

}