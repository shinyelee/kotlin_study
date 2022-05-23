// 생성자 보충설명 (3)

fun main() {

    val human = Human("shinyelee")

    // ()안에 name 안 넣어도 컴파일 오류가 나지 않음
    // -> 기본값을 anonymous로 설정했기 때문
    val who = Human()

    human.eatingCake()
//    yummy!

    println("My name is ${who.name}")
//    My name is anonymous

}

// 디폴트값 부여함
class Human(val name : String = "anonymous") {

    fun eatingCake() {
        println("yummy!")
    }

}