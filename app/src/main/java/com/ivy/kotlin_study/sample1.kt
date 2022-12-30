package com.ivy.kotlin_study

fun main(){
//    1. 함수
//    helloWorld()

//    2. String Template
//    var name = "Joyce"
//    var lastName = "Hong"
//    println("my name is ${name + lastName}")
//    println("this is 2\$")
//    println("if this true? ${1==0}")

//    forAndWhile()

//    nullCheck()
//    ignoreNulls("dlawldn10@naver.com")
//    ignoreNulls(null)
}

fun helloWorld() : Unit {
    println("Hello World!")
}

// 3. 조건식
fun maxBy(a: Int, b: Int) : Int {
    if(a > b){
        return a
    }else{
        return b
    }
}

// 삼항 연산자처럼 함수 간단하게 쓰기
fun maxBy2(a: Int, b: Int) = if(a > b) a else b

fun checkNum(score: Int){
//    코틀린의 switch case문
    when(score){
        0 -> println("this is 0")
        1 -> println("thish is 1")
        2, 3 -> println("this is 2 or 3")
//        else -> println("I don't know")
    }

//    이렇게 쓸 경우 else를 반드시 써야한다. 값이 들어가야하기 때문에
   var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    when(score){
        in 90..100 -> println("you are genious")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}


fun add(a: Int, b: Int) : Int {
//    2. val, var 차이
    val a: Int = 10
    var b: Int = 5
    return a+b
}

// Expression Vs. Statement
// 값을 리턴하면 Expression -> 리턴값이 있는 when, 코틀린의 모든 함수(Unit 함수도 포함).
// 값을 리턴하지 않으면 Statement -> 리턴하지 않는 when, 자바의 void 타입 함수


// 4. Array & List
// Array - 값 변경은 가능하고 사이즈 변경은 불가능
// List
// 1) List - 수정 불가능. 읽기 전용. 인터페이스
// 2) MutableList - 수정 가능. 읽기 스기 가능. arrayList

fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
//    불가능
//    list[0] = 1
//    가능
    var result = list.get(1)
    var result2 = list[1]

//    arrayList의 주소는 바뀌지 않으므로 val로 써도 오류 안나는 것.
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
//    따라서 이렇게 리스트 자체를 재할당 하는 것은 안되는 것. val 인데 주소값이 바뀌니까.
//    재할당 하고 싶으면 var로 선언.
//    arrayList = arrayListOf()

}

//   6. for / while
fun forAndWhile(){
    val students = arrayListOf("joyce", "james", "harry", "jiny")
    for (name in students){
        println("${name}")
    }

    var sum: Int = 0
    for (i in 1..10){
        sum += i
    }
    println(sum)

//    두 칸씩 가기
    for (i in 1..10 step 2){
        sum += i
    }
    println(sum)

//    10부터 차례로 두칸씩 내려가기
    for (i in 10 downTo 1 step 2){
        sum += i
    }
    println(sum)

//    1..100 -> 1부터 100까지
//    1 until 100 -> 1 부터 99까지
    for (i in 1 until 100){
        sum += i
    }
    println(sum)

    for ((idx, name) in students.withIndex()){
        println("${idx+1}번재 학생: $name")
    }

    var index = 0
    while (index < 10){
        println("current index : ${index}")
        index++
    }
}


// Nullable / NonNull
fun nullCheck(){
//    NPE: NullPointerException

//    NonNull 타입
    var name: String = "joyce"
//    불가능
//    name = null

//    Nullable 타입
    var nullName: String? = null

    var nameInUpperCase = name.toUpperCase()

//    null인지 아닌지 몰라서 이 함수를 사용해도 되는지 아닌지 모르겠어 -> ?써주기.
    var nullNameInUpperCase = nullName?.toUpperCase()

//    엘비스 연산자
//    ?:
//    디폴트값을 주고 싶을 때 사용.
    val lastName: String? = null
    val fullName = name + " " + (lastName?: "No lastName")
    println("$fullName")



}

//    !!
// 여기에 절대 null이 들어올 일이 없을 때 표시함.
// 하지만 이거는 쓰는 것을 지양해야함. 정말 확실할때만 사용해야함. 하지만 편해서 자주 쓰게 됨...
fun ignoreNulls(str: String?){
//    val mNotNull : String = str!!
//    val upper = mNotNull.toUpperCase()

    var email: String?  = str
//    null이면 let 안의 코드가 실행되지 않음.
    email?.let{
        println("my email is $email")
    }
}