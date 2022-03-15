// 리스트에 있는 숫자들을 모두 더한 후
// 리스트의 갯수로 나눈 값을 출력하는 solution을 만드세요

fun main(){

//    val arr1 = arrayListOf<String>("1", "2")
//    val result1 = solutions(arr1)
//    println(result1)
    // 1.5

    val arr2 = arrayListOf<String>("1", "2", "3", "4","5")
    val result2 = solutions(arr2)
    println(result2)
    // 3.0

}


fun solutions(arr: ArrayList<String>): Double {

    var sum = 0
    var arrLength = arr.size

    for(i in arr) {
        // 전체 출력
        println(i.toInt())
        // 더하기
        sum += i.toInt()
    }

    // 더한 값 출력
//    println(sum)

    // 리스트 길이(값 개수) 출력
//    println(arrLength)

    // 개수만큼 나눈 값 출력
//    println(sum.toDouble()/arrLength.toDouble())

    return sum.toDouble()/arrLength.toDouble()

}
