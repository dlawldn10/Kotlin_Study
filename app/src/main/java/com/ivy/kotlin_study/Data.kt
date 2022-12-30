package com.ivy.kotlin_study

data class Ticket(
    val companyName: String,
    val name: String,
    var date: String,
    var seatNumber: Int
)

class TicketNormal(
    val companyName: String,
    val name: String,
    var date: String,
    var seatNumber: Int
)

//data class
//컴파일하면 자동으로 아래 메소드도 자동으로 만들어줌.
// toString(), hashCode(), equals(), copy() 등등

fun main(){
    val ticketA = Ticket(
        "koreanAir",
        "jiwooLim",
        "2022-12-30",
        14
    )

    val ticketB = TicketNormal(
        "koreanAir",
        "jiwooLim",
        "2022-12-30",
        14
    )

//    data class가 아닌 그냥 class로 생성할 경우 프린트하면 그냥 주소값이 나옴.
//    출력 결과:
//    Ticket(companyName=koreanAir, name=jiwooLim, date=2022-12-30, seatNumber=14)
//    com.ivy.kotlin_study.TicketNormal@4783da3f
    println(ticketA)
    println(ticketB)
}

//코틀린은 하나의 파일에 여러개의 클래스 만들 수 있으므로 연관된 데이터 클래스를 한 파일에 모아서 만들면 관리하기 용이하다.
//자바로는 못함.