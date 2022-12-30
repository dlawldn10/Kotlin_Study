package com.ivy.kotlin_study

// 1. Lambda
// 마치 value 처럼 다룰 수 있는 익명 함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a: Int)
// 2) return 값으로 사용할 수 있다.

// 람다의 기본 정의
// val lambdaName : Type = {argumentList -> codebody}

val square : (Int) -> (Int) = {number -> number * number}

val nameAge = {name: String, age: Int ->
    "my name is $name I'm $age"
}

fun main(){
    println(square(12))
    println(nameAge("jiwoo", 99))
    val a = "joyce said"
    val b = "jiwoo said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))
    println(calculateGrade(971))

    val lambda = {number: Double ->
        number == 3.141592
    }
//    다 같은 것.
    println(invokeLambda(lambda))
    println(invokeLambda { it > 3.22 })
    println(invokeLambda { it > 3.22 })
}

// 2. 확장 함수
// 원래 있는 클래스에 몇가지를 추가하고 싶을 때 사용
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = {"I am $this and $it years old"}
    return name.introduceMyself(age)
}

// 3. 람다의 리턴
var calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "else"
    }
}

// 4. 람다의 표현 방법 - 1
// invokeLambda 함수는 Boolean을 리턴할건데, 매개변수로 오는 lambda라는 함수를 호출하여 리텅할 것이다.
fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}