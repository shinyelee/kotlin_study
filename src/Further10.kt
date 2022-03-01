// Data Class(데이터 클래스)
// 서버에서 받아온 데이터를 넣을 때 씀

fun main() {

    val justDog = JustDog("파트라슈", 11)
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())

    val dataDog = DataDog("파트라슈 친구", 15)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())

    // 복붙해서 일부만 변경 가능
    val dataDog2 = dataDog.copy(name = "파트라슈 여친")
    println(dataDog2.toString())

}

// 일반 클래스
class JustDog(var name : String, var age : Int)

// 데이터 클래스
data class DataDog(var name : String, var age : Int)