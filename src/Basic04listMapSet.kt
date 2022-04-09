// list
// mutable list
// map
// set

fun main () {

    // list는 추가/제거를 못 함
    val testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0])
//    [a, b, c]
//    a

    // 이렇게 만들면 추가/제거 불가능
//    testList1.add("d")

    // mutable list는 추가/제거 가능
    val testList2 = mutableListOf("a", "b", "c")
    println(testList2)
//    [a, b, c]

    // "d" 추가
    testList2.add("d")
    println(testList2)
//    [a, b, c, d]

    // "a" 제거
    testList2.remove("a")
    println(testList2)
//    [b, c, d]

//     5 유리
//     10 철수
//     15 짱구
//     22 훈이

    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)

    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList2[findIndex])
//    1
//    철수



    // Map //

    // 객체를 넣을 때 그 객체(value)를 찾아낼 수 있는 key(객체를 찾기 위한 값)를 쌍으로 넣어주는 컬렉션
    // 객체의 위치가 아닌 고유한 키를 통해 객체를 참조한다는 특징을 가짐
    // 같은 키에 다른 객체를 넣음 -> 기존 객체가 대체됨
    // put으로 데이터 추가, remove로 데이터 삭제
    // 인덱스는 겁나 귀찮음 -> map 사용

    val testMap1 = mutableMapOf<Int, String>()

    testMap1.put(5, "유리")
    testMap1.put(10, "철수")
    testMap1.put(15, "짱구")
    testMap1.put(22, "훈이")

    println(testMap1[15])
//    짱구



    val b = mutableMapOf("아이브" to "LOVE DIVE",
                         "아이들" to "TOMBOY",
                         "아이유" to "GANADARA")

    for (entry in b) {
        println("${entry.key} : ${entry.value}")
    }
//    아이브 : LOVE DIVE
//    아이들 : TOMBOY
//    아이유 : GANADARA

    b.put("레드벨벳", "Feel My Rhythm")
    println(b)
//    {아이브=LOVE DIVE, 아이들=TOMBOY, 아이유=GANADARA, 레드벨벳=Feel My Rhythm}

    b.remove("아이유")
    println(b)
//    {아이브=LOVE DIVE, 아이들=TOMBOY, 레드벨벳=Feel My Rhythm}

    println(b["레드벨벳"])
//    Feel My Rhythm



    // Set //

    // 리스트와 달리 순서가 정렬되지 않으며 중복이 허용되지 않는 컬렉션
    // 인덱스로 위치 지정해 객체 참조하기 불가능
    // contains로 객체가 set 안에 존재하는지를 확인하는 식으로만 사용

    val testSet1 = mutableSetOf("a", "b", "c")

    println(testSet1)
//    [a, b, c]

    // add로 데이터 추가
    testSet1.add("d")
    testSet1.add("e")

    println(testSet1)
//    [a, b, c, d, e]

    // 중복을 자동으로 거르기 때문에 e는 한 번만 추가됨
    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")

    println(testSet1)
//    [a, b, c, d, e]

    // remove로 데이터 삭제
    testSet1.remove("e")

    println(testSet1)
//    [a, b, c, d]



    val a = mutableSetOf("귤", "바나나", "키위")

    for (item in a) {
        println("${item}")
    }
//    귤
//    바나나
//    키위

    a.add("자몽")
    println(a)
//    [귤, 바나나, 키위, 자몽]

    a.remove("바나나")
    println(a)
//    [귤, 키위, 자몽]

    println(a.contains("귤"))
//    true

}

