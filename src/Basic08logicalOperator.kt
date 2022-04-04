// Logical Operators (논리연산자) //

// && (and)
// 남자 && 20세 이상 -> 두 조건 모두 해당해야 함(and)

// || (or)
// 남자 || 30세 이상 -> 둘 중 하나만 해당해도 됨(or)

// ! (not) //
// !남자 -> 해당 조건을 반대로 해석(not) -> 남자가 아닌 경우

fun main() {

    // && (and)

    val a = "남자"
    val b = 20

    if (a=="남자" && b>=20) {
        println("AND 만족")
    } else {
        println("AND 불만족")
    }



    // || (or)

    val c = "여자"
    val d = 30

    if (c=="남자" || d>=30) {
        println("OR 만족")
    } else {
        println("OR 불만족")
    }



    // ! (not)

    val score1 = 100

    if (score1 != 100) {
        println("100점이 아니야!")
    } else {
        println("100점! ")
    }



    // 문제

    val student = mutableMapOf<Int, String>()

    student[99] = "아이사"
    student[20] = "카리나"
    student[35] = "예지"
    student[48] = "츄"
    student[100] = "소연"
    student[22] = "제니"
    student[45] = "이서"
    student[88] = "휴닝바히에"
    student[91] = "성훈"
    student[87] = "산"
    student[54] = "필릭스"
    student[42] = "하루토"

    // 점수가 50점 이상이고 이름이 세 글자 이상인 학생만 출력하세요

    for (i in student) {
        // 점수(key) 50점 이상 && 이름(value) 세 글자 이상
        if(i.key>=50 && i.value.length>=3) {
            // 각각 이름(value) 출력
            println(i.value)
        }
    }

}