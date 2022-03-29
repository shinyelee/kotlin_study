// Inheritance(상속)

fun main() {

    Job1()
    Job2()
    Job3()
}

open class AllJobs() {
    init {
        println("일을 합니다")
    }
}

class Job3() : AllJobs() {
    init {
        println("마케팅을 합니다")
   }
}

class Job1() {
    init {
        println("일을 합니다")
        println("코딩을 합니다")
    }
}

class Job2() {
    init {
        println("일을 합니다")
        println("디자인을 합니다")
    }
}