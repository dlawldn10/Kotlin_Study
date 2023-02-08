package com.ivy.kotlin_study.joyce

//코틀린은 파일 이름이랑 클래스 이름이랑 일치하지 않아도됨.
//여러 클래스를 한 파일에 넣을 수도 있다.
//하지만 관행적으로 이름이랑 파일이랑 맞추는 편

open class Human(val name: String = "Anonymous") {

//    val name = "jiwoo"
//    val name = name

//    이 인스턴스가 생성될때 실행하고 싶은 동작을 정의할 수 있다.
    init {
        println("New human has born!")
    }

//    부생성자를 정의할 수 있다.
//    부생성자는 항상 this를 이용해서 주생성자의 위임을 받아야한다.
    constructor(name: String, age: Int): this(name){
        println("my name is $name and $age years old")
    }

    fun eatingCake(){
        println("$name said this is so yummy!")
    }

    open fun singASong(){
        println("lalala")
    }
}

//상속받기
// 코틀린의 클래스들은 기본적으로 모두 final 타입이기 때문에
// 한 파일에 있더라도 바로 접근할 수 없고 상속할 클래스 앞에 open을 붙여줘야함.
// override 할때도 마찬가지 이유로 상속할 함수 앞에 open을 붙여줘야함.
// 상속은 자바와 마찬가지로 하나만 할 수 있다.
class Korean : Human(){
    override fun singASong(){
//        부모것도 함께 사용하고 싶을 때 아래 처럼 super 사용.
        super.singASong()
        println("라라라")
//        이것이 가능한 이유는 생성할 때 디폴트값 Ananymous가 들어갔기 때문.
        println("my name is $name")
    }
}

fun main(){
//    val human = Human("jiwoo")
//    val human2 = Human()
//    human.eatingCake()
//
//    val mom = Human("Kuri", 52)
//
//    println("this human's name is ${human.name}")
//    println("this human2's name is ${human2.name}")

//    name이 Anonymouse인 상태
    val korean = Korean()
    korean.singASong()
}