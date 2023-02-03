package com.ivy.kotlin_study.lec10.Kotlin

// 'open' 키워드
// 추상 프로퍼티가 아니라면, 프로퍼티를 상속 할 때 open을 꼭 붙여야한다.
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {

    abstract fun move()
}