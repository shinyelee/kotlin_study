// 조건문 //
// if else
// when

fun main() {

    // 150 이상이 아님
//    val studentScore1 = 100
//    if (studentScore1 >= 150) {
//        println("150 이상")
//    } else {
//        println("150 이상이 아님")
//    }

    // 50 이상
//    val studentScore2 = 50
//    if (studentScore2 > 50) {
//        println("50 초과")
//    }
//    if (studentScore2 >= 50) {
//        println("50 이상")
//    }

    // 둘 다 해당 -> 둘 다 출력
//    val studentScore3 = 65
//    if (studentScore3 < 70) {
//        println("70미만")
//    }
//    if (studentScore3 <= 70) {
//        println("70이하")
//    }

    // 30보다 큼
//    val studentScore4 = 40
//    if (studentScore4 > 100) {
//        println("100보다 큼")
//    } else if (studentScore4 > 50) {
//        println("50보다 큼")
//    } else if (studentScore4 > 30) {
//        println("30보다 큼")
//    } else {
//        println("30보다 작음")
//    }

    // when 사용
//    val score = 80
//    when(score) {
//        100 -> {
//            println("100")
//        }
//        90 -> {
//            println("90")
//        }
//        80 -> {
//            println("80")
//        }
//        else -> {
//            println("no")
//        }
//    }

    // 간단한 조건문을 이용한 문제풀이
    // 학생의 A B C D F 점수를 출력

    val score = 80

    // 학생의 점수가
    // 100 초과 == A
    // 90 초과 == B
    // 80 초과 == C
    // 70 초과 == D
    // 70 이하 == F

    if (score > 100) {
        println("A")
    } else if (score > 90) {
        println("B")
    } else if (score > 80) {
        println("C")
    } else if (score > 70) {
        println("D")
    } else {
        println("F")
    }

}