// 조건식 //
// if
// else
// when

fun main() {

    // if는 참/거짓 확인
    // if + else 조합이 보통임
    var studentScore1 = 100
    if (studentScore1 >= 150) {
        println("150 이상")
    } else {
        println("150 이상이 아님")
    }
//    150 이상이 아님



    // if 구문을 여러 개 써도 됨
    // 둘 중 하나만 해당 -> 하나만 출력
    var studentScore2 = 50
    if (studentScore2 > 50) {
        println("50 초과")
    }
    if (studentScore2 >= 50) {
        println("50 이상")
    }
//    50 이상



    // 둘 다 해당 -> 둘 다 출력
    var studentScore3 = 65
    if (studentScore3 < 70) {
        println("70미만")
    }
    if (studentScore3 <= 70) {
        println("70이하")
    }
//    70미만
//    70이하



    // 여러 조건 중 하나만 얻어걸리면 된다 -> if else 사용
    var studentScore4 = 40
    if (studentScore4 > 100) {
        // 처음은 무조건 if
        println("100보다 큼")
    } else if (studentScore4 > 50) {
        // if 말고 다른 조건은 else if
        println("50보다 큼")
    } else if (studentScore4 > 30) {
        println("30보다 큼")
    } else {
        // 맨 마지막 쩌리는 else
        println("30보다 작음")
    }
//    30보다 큼



    // 간단한 조건문을 이용한 문제풀이
    // 학생의 A B C D F 점수를 출력

    var score2 = 80

    // 학생의 점수가
    // 100 초과 == A
    // 90 초과 == B
    // 80 초과 == C
    // 70 초과 == D
    // 70 이하 == F

    if (score2 > 100) {
        println("A")
    } else if (score2 > 90) {
        println("B")
    } else if (score2 > 80) {
        println("C")
    } else if (score2 > 70) {
        println("D")
    } else {
        println("F")
    }
//    D



    // when
    // switch문을 좀 더 편리하게 바꾼 기능
    // 하나의 변수를 여러 개의 값과 비교 가능
    // 등호, 부등호 사용 불가
    // 여러 조건에 부합해도 제일 처음 만족하는 구간에서 실행 종료

    var score1 = 90

    when(score1) {
        100 -> {
            println("100")
        }
        90 -> {
            println("90")
        }
        // 복수로 조건 걸기 가능
        80,70 -> {
            println("80 or 70")
        }
        else -> {
            println("no")
        }
    }
//    90



    var score3 = 78

    when(score3) {
        100 -> {
            println("Perfect!")
        }
        // 범위 설정 가능
        in 90..99 -> {
            println("Great!")
        }
        in 80..89 -> {
            println("Good!")
        }
        in 70..79 -> {
            println("Ok!")
        }
        else -> {
            println("Well...")
        }
    }
//    OK!



    doWhen(1)
    // 1 만족 -> 종료
    // (!is String도 만족)

    doWhen(1L)
    // is Long 만족 -> 종료
    // (!is String도 만족)

    doWhen(1.1)
    // !is String 만족 -> 종료

    doWhen("shinyelee")
    // "shinyelee" 만족 -> 종료

    doWhen("shinye")
    // else 만족 -> 종료

}



// 조건문.ver
//fun doWhen (a: Any) {
//    when(a) {
//        1 -> println("1")
//        "shinyelee" -> println("my name")
//        is Long -> println("long type"
//        !is String -> println("not string")
//        // else 생략 가능
//        else -> println("else")
//    }
//}

// 표현식.ver
fun doWhen (a: Any) {
    var result = when(a) {
        1 -> "1"
        "shinyelee" -> "my name"
        is Long -> "long type"
        !is String -> "not string"
        // else 생략 불가
        else -> "else"
    }
    println(result)
}

// Any 자료형은 나중에 재등장