// class == 값 + 기능
// function == 기능

fun main() {

    println(Test().a)
    println(Test2("abcd").b)
    Test3().test3Fun()

//    val myinfo = MyInfo()
//    println(myinfo.getMyAge())
//    println(myinfo.getMyName())
//    println(myinfo.getMyLocation())

    val dog = Dog("파트라슈", 10)
    println(dog.getMyDogInfo())
    initTest().testInitFun()

    InitialValue("송중기", 30)
    InitialValue("박보검")

    var bts = Singer("정국", 1997)
    var txt = Singer("연준", 1999)
    var aespa = Singer("윈터", 2001)
    var nmixx = Singer("설윤", 2004)

    // 너무 번거로움 -> class내에 println function 추가
//    println("안녕하세요, ${bts.birthYear}년생 ${bts.name}입니다.")
    bts.introduce()
    txt.introduce()
    aespa.introduce()
    nmixx.introduce()
    // 코드가 훨씬 짧아짐

}

class Singer (var name: String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}

class InitialValue(name : String, age : Int = 20) {
    init {
        println(name)
        println(age)
    }
}

class initTest() {
    init {
        println("여기에서 뭔가 해주고 싶음")
    }
    fun testInitFun() {
        println("testInitFun")
    }
}

class Dog(name : String, age : Int) {
    val dogName = name
    val dogAge = age

    fun getMyDogInfo() : String {
        return "$dogName : $dogAge"
    }
}

//class MyInfo() {
//    fun getMyAge() : Int {
//        return 20
//    }
//    fun getMyName() : String {
//        return "MyNameisShinyelee"
//    }
//    fun getMyLocation() : String {
//        return "Busan"
//    }
//}

class Test3() {
    fun test3Fun() {
        println("test3Fun 출력")
    }
}

class Test2(str : String) {
    val b = str
}

class Test {
    val a = "abc"
}