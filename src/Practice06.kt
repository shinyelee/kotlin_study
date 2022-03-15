// 리스트의 숫자를 뒤집어서 반환하는 solution 을 만드세요

fun main(){

    val arr1 = arrayListOf(1,2,3,4,5)
    val result1 = solutions(arr1)
    println(result1)
    // [5,4,3,2,1]

    val arr2 = arrayListOf(2,4,6,8)
    val result2 = solutions(arr2)
    println(result2)
    //  [8,6,4,2]

}

fun solutions(arr: ArrayList<Int>) :ArrayList <String> {

    var length = arr.size
    val resultArr = mutableListOf<String>()

//    for(i in arr) {
//        println(i)
//    }
//    println(length)

    for(i in 0..length-1) {
//        println(arr[length-1-i])
        resultArr.add(arr[length-1-i].toString())
    }
//    println(resultArr)
    return resultArr as ArrayList<String>

}