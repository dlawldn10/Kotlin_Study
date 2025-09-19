package com.ivy.kotlin_study.lec10.Kotlin

interface Flyable {

    // default 키워드를 쓰지 않고도 default 함수를 만들 수 있다.
    fun act(){
        println("파닥 파닥")
    }

    // 코틀린도 추상 메소드를 만들 수 있다.
    fun fly()

}