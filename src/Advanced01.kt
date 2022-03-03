// Lambda(람다)

fun main() {

//    println(a())
//    println(b())

    // 기본
    println(sums(1, 2))

    // 람다
    println(sumNumber(1, 2))
    println(sumTypeNumber(1, 2))
    println(sumTypeNumberNull(1, 2))

    println(sumString("1", "2"))
    println(sumString2("1", "2"))
    println(sumStringType2("1", "2"))

}

// 람다
fun sumString(a : String, b : String) : String {
    return "string1 : $a string2 : $b"
}
val sumString2 = {a : String, b : String -> "string1 : $a string2 : $b"}
val sumStringType2 : (String, String) -> String = {a, b -> "string1 : $a string2 : $b"}

val sumNumber = {a: Int, b : Int -> a + b}
val sumTypeNumber : (Int, Int) -> Int = {a, b -> a + b}
val sumTypeNumberNull : (Int, Int) -> Int? = {a, b -> null}

// 기본
fun sums(a : Int, b : Int) : Int {
    return a + b
}

//fun a() : String {
//    return "text"
//}
//
//// a랑 똑같은데 간소화 한 버전
//fun b() = "text"

