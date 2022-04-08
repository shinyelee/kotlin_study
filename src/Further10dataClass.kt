// Data Class(데이터 클래스) //

// 데이터를 다루는 데 최적화된 클래스
// 서버에서 받아온 데이터를 넣을 때 사용

// 데이터 클래스에서 자동으로 구현하는 기능 //
// 1. equals() <- 내용의 동일성 판단
// 2. hashcode() <- 객체의 내용에서 고유한 코드를 생성
// 3. toString() <- 포함된 속성을 보기쉽게 나타냄
// 4. copy() <- 객체를 복사해 똑같은 내용의 새 객체 생성
// 5. componentX() <- 속성을 순서대로 반환
// 사용자가 직접 호출하기 위한 함수가 아님
// -> 배열이나 리스트 등에 데이터 클래스의 객체가 담겨있을 때,
// -> 이 내용을 자동으로 꺼내 쓸 수 있는 기능을 지원하기 위한 함수임

fun main() {

//    val a = General("신비", 1)
//
//    println(a == General("신비", 1))
//    println(a.hashCode())
//    println(a)
////    false
////    885951223
////    General@34ce8af7
//
//    val b = Data("은하", 2)
//
//    println(b == Data("은하", 2))
//    println(b.hashCode())
//    println(b)
////    true
////    50711786
////    Data(name=은하, id=2)
//
//    println(b.copy())
//    println(b.copy("엄지"))
//    println(b.copy(id = 3))
////    Data(name=은하, id=2)
////    Data(name=엄지, id=2)
////    Data(name=은하, id=3)

    val list = listOf(Data("보나",8),
                      Data("설아",12),
                      Data("루다", 2))
//    보나, 8
//    설아, 12
//    루다, 2

    for((a, b) in list) {
        println("${a}, ${b}")
    }



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

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)



// 일반 클래스
class JustDog(var name : String, var age : Int)

// 데이터 클래스
data class DataDog(var name : String, var age : Int)