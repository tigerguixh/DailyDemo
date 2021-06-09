package tiger.com.lp.dailydemo.kotlin.clarity

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/10/18
 * @Description :
 */
fun main(array: Array<String>) {
    val book1 = Book("1", "java1")
    val book2 = Book("2", "java2")
    val book3 = Book("'1'", "java3")
    val book4 = Book("4", "java4")
    val book5 = Book("5", "java5")

    var bookList: MutableList<Book> = ArrayList()
    bookList.add(book1)
    bookList.add(book2)
    //bookList.add(book3)
    bookList.add(book4)
    bookList.add(book5)

    for (book in bookList) {
        print(book.bookId)
    }
}

class Book(val bookId : String, val bookName : String) {
    override fun equals(other: Any?): Boolean {
        var book : Book = other as Book
        return bookId.equals(book.bookId)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}