package com.ivy.kotlin_study.lec01

// Java에서
// long = 가변, final long = 불변
// kotlin에서
// var = 가변, val = 불변

class Lec01Main_kt {

    fun main(){
        var number1 = 10L
        val number2 = 10L
        // number2 = 20L -> 불가. val은 불변값으로, 초기화 한번만 가능.

        // TIP: 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.
        // TIP: 코틀린 코드를 자바 코드로 보고 싶을 때 -> Tools > Kotlin > KotlinBytecode > Decomplie

        // 변수에 null이 들어갈 수 있는지 없는지. nullable 표현하기. ?
        var number3: Long? = 1_000L
        number3 = null

        // 코틀린에서 객체 인스턴스화. new를 붙이지 않는다.
        var person = Person("임지우")

    }

}

//정리:
// 1. 모든 변수는 var/ val 로 선언한다.
// 2. 타입을 명시적으로 작성하지 않아도, 타입이 추론된다.
// 3. primitive type과 reference type을 구분하지 않아도된다.
// 4. null이 들어갈 수 있는 변수는 타입 뒤어 ? 를 붙여주어야한다. 아예 다른 타입으로 간주된다.




