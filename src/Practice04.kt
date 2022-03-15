// 별이 아래와 같이 2배씩 늘어나며 출력되는 solution을 완성하세요

fun main(){

    solution(3)
    // *
    // **
    // ****

    solution(5)
    // *
    // **
    // ****
    // ********
    // ****************
}

fun solution(star : Int){

    var count = 1

    // 줄 개수
    for(i in 1..star) {
//        println("*")
        // 별 개수
        for(j in 1..count) {
            print("*")
        }
        println("")
        // 2배수 증가
        count = count*2
    }

}