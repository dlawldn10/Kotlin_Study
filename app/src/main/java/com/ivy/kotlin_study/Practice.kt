package com.ivy.kotlin_study

// companion object
// 자바의 static 대신 사용함.

//private을 붙여주면 다른 곳에서는 객체를 생성하지 못한다.
class Book private constructor(val id: Int,val name: String){
//    private object 도는 method를 읽어얼 수 있도록 하는 역할.
    companion object BookFactory : IdProvider{
    override fun getId(): Int {
        return 444
    }
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main(){
//    이렇게 사용 불가.
//    val book = Book()
    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}
