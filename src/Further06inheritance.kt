// Inheritance(상속)

fun main() {

    var a = Animal("휴지", 5, "강아지")
    var b = Dog("휴지", 5)

    // Animal 클래스로부터 "개" 속성을 상속받기 때문에 결과적으로는 a와 b의 속성이 똑같음
    a.introduce()
    b.introduce()

    // bark()는 Dog 클래스에만 해당함
//    a.bark()
    b.bark()

    var c = Cat("감쟈", 1)

    c.introduce()
    c.meow()

}

// Super Class(수퍼/부모 클래스)
// 물려주는 쪽
// class 앞에 open 붙여줘야 상속 가능
open class Animal (var name: String, var age: Int, var type: String)
{
    fun introduce() {
        // this 생략 가능
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}


// 상속 규칙 //
// 1. 서브 클래스는 수퍼 클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없음
// -> var, val 등을 붙이면 클래스 자체 속성으로 선언되기 때문에 일반 파라미터로 받아야 함
// 2. 서브 클래스가 생성될 때 수퍼 클래스의 생성자가 호출되어야 함

// Sub Class(서브/자식 클래스)
// 물려받는 쪽
class Dog (name: String, age: Int) : Animal (name, age, "강아지")
{
    fun bark() {
        println("멍멍")
    }
}

class Cat (name: String, age: Int) : Animal (name, age, "고양이")
{
    fun meow() {
        println("야옹")
    }
}