// Looping(반복문) //

// 조건형 반복문 //
// 조건이 참인 경우(즉 변수가 false 될 때까지) 반복 유지
// 변수가 false 될 때까지
// while, do...while

// 범위형 반복문 //
// 범위를 정해 반복 수행
// for

fun main() {

    // while //

    // a는 0부터 시작
    var a = 0
    // a가 3보다 작으면 해당 구문 반복
    while (a < 3) {
        // a는 1씩 증가
        println(++a)
    }
//    1 <- 0에서 1 더한 후 출력
//    2 <- 1에서 1 더한 후 출력
//    3 <- 2에서 1 더한 후 출력



    // do while //

    // b는 0부터 시작
    var b = 0
    // 최초 1회 한정으로 조건 노상관
    do
    {
        // 실행 갈긴 후
        println(b++)
    // 두 번째 실행부터 조건 확인
    } while (b < 3)
//    0 <- 냅다 0 출력
//    1 <- 0에서 1 더한 후 출력
//    2 <- 1에서 1 더한 후 출력



    // Increment & Decrement Operators(증감연산자) //

    // Increment Operators(증가연산자)
    // 변수값 1 증가
//     count = count + 1
//     count++

    // Decrement Operators(감소연산자)
    // 변수값 1 감소
//     count = count - 1
//     count--

    // Prefix Operators(전위연산자)
    // 구문 내에서 증가/감소 값 즉시 반영
    // ++a
    // --a

    // Postfix Operators(후위연산자)
    // 구문 수행한 후에 증가/감소 값 반영
    // a++
    // a--

    // ++a <- 선증가 후출력
    var c = 0
    while (c < 5) {
        println(++c)
    }
//    1 <- 0에서 1 더한 후 출력
//    2 <- 1에서 1 더한 후 출력
//    3 <- 2에서 1 더한 후 출력
//    4 <- 3에서 1 더한 후 출력
//    5 <- 4에서 1 더한 후 출력

    // --b <- 선감소 후출력
    var d = 5
    while (d > 0) {
        println(--d)
    }
//    4 <- 5에서 1 뺀 후 출력
//    3 <- 4에서 1 뺀 후 출력
//    2 <- 3에서 1 뺀 후 출력
//    1 <- 2에서 1 뺀 후 출력
//    0 <- 1에서 1 뺀 후 출력

    // c++ <- 선출력 후증가
    var e = 0
    while (e < 5) {
        println(e++)
    }
//    0 <- 0 출력 후 1 더하기
//    1 <- 1 출력 후 1 더하기
//    2 <- 2 출력 후 1 더하기
//    3 <- 3 출력 후 1 더하기
//    4 <- 4 출력 후 1 더하기

    // d-- <- 선출력 후감소
    var f = 5
    while (f > 0) {
        println(f--)
    }
//    5 <- 5 출력 후 1 빼기
//    4 <- 4 출력 후 1 빼기
//    3 <- 3 출력 후 1 빼기
//    2 <- 2 출력 후 1 빼기
//    1 <- 1 출력 후 1 빼기



    // for //

    // 1부터 10까지 더하기
    var sum : Int = 0
    for(i in 1..10) {
//        sum = sum+ i
//        과 동일
        sum += i
    }
    println(sum)
//    55

    // 11 .. 15 -> 11부터 15까지(포함) i값 1씩 증가
    for(i in 11 .. 15) {
        // 관습적으로 i로 씀 -> 다른 알파벳이어도 노상관
        println(i)
    }
//    11
//    12
//    13
//    14
//    15

    // 21 .. 25 -> 21부터 25'미만'까지 i값 1씩 증가
    for(i in 21 until 25) {
        // 관습적으로 i로 씀 -> 다른 알파벳이어도 노상관
        println(i)
    }
//    21
//    22
//    23
//    24

    // 35 downTo 31 -> 35부터 31까지 j값 1씩 감소
    for(j in 35 downTo 31) {
        println(j)
    }
//    35
//    34
//    33
//    32
//    31

    // step 3 -> k값 3씩 증가
    for (k in 41..49 step 3) {
        println(k)
    }
//    41
//    44 <- 41+3
//    47 <- 44+3

    // step 2 -> l값 2씩 감소
    for (l in 59 downTo 51 step 2) {
        println(l)
    }
//    59
//    57 <- 59-2
//    55 <- 57-2
//    53 <- 55-2
//    51 <- 53-2

    // 문자열도 가능
    for (m in 'a'..'e') {
        println(m)
    }
//    a
//    b
//    c
//    d
//    e

    // 배열이나 리스트도 가능
    val blackPink = arrayListOf("Jennie", "Rosé", "Jisoo", "Lisa")
    for(member in blackPink) {
        println("${member} ")
    }
//    Jennie
//    Rosé
//    Jisoo
//    Lisa

    // 인덱스도 함께 출력 가능
    for((index, member) in blackPink.withIndex()) {
        println("${index + 1}번째 멤버 ${member}")
    }
//    1번째 멤버 Jennie
//    2번째 멤버 Rosé
//    3번째 멤버 Jisoo
//    4번째 멤버 Lisa



    // return //
    // 함수 종료 -> 값 반환



    // break //
    // 반복문 종료 -> 다음 구문으로 넘어감
    for (n in 61..70) {
        if(n == 63) break
        // n == 61 -> 11 출력
        // n == 62 -> 12 출력
        // n == 63 -> 종료
        println(n)
    }
    // 61
    // 62



    // continue //
    // 다음 반복 조건으로 넘어감
    for (o in 71..80) {
        if(o == 73) continue
        // o == 71 -> 71 출력
        // o == 72 -> 72 출력
        // o == 73 -> 74로 넘어감
        println(o)
    }
//    71
//    72
//    74
//    75
//    76
//    77
//    78
//    79
//    80

    // 다중 반복문에서 break, continue 사용 -> label로 지정
    // 외부 반복문에 레이블명@for
    // break/continue문에 break/continue@레이블명
    // -> 레이블이 달린 반복문 기준으로 즉시 break/continue
    loop@for (p in 1..5) {
        for( q in 1..5) {
            if(p == 1 && q == 3) break@loop
            println("p : $p, q : $q")
        }
    }
//    p : 1, q : 1
//    p : 1, q : 2

}