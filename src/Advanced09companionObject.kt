// 동반 객체 보충설명

fun main() {

    // 객체 생성
    // 중간에 Companion 생략 가능
//    val theBook = TheBook.Companion.create()

    val theBook = TheBook.create()
    // TheBook(getId(), "new book")

    // 역시 BookFactory 생략 가능
//    val bookId = TheBook.BookFactory.getId()

    val bookId = TheBook.getId()
    // return 40

    println("${theBook.id} ${theBook.title}")
    // theBook.id <- getId() <- 40
    // theBook.title <- myBook <- "new book"
//    40 new book

}

interface IdProvider {
    fun getId() : Int
}

class TheBook private constructor(val id : Int, val title : String) {

    // 동반 객체에 이름 붙이기 가능
    companion object BookFactory : IdProvider {

        override fun getId(): Int {
            return 40
        }

        val myBook = "new book"

        fun create() = TheBook(getId(), myBook)
        // TheBook(40, "new book")

    }

}