package com.ivy.kotlin_study.lec12.kotlin

class Person private constructor(
    var name: String,
    var age: Int
) {

    // 1. static 함수와 변수
    // 코틀린에는 static이 없다.
    // 대신 companion object 사용.
    // static: 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
    // companion object: 클래스와 동행하는 유일한 오브젝트
    // const: 진짜 상수. 기본 타입과 String에만 붙일 수 있다.
    // val 은 런타임 시 값이 할당되고, const는 컴파일 시 값이 할당된다.
    // companion object( 동반 객체)도 하나의 객체로 간주될 수 있다.
    // 때문에 이름을 붙일 수도 있고, interface를 구현할 수 도 있다. (이름 안붙이는 경우 Companion이라는 이름이 자동으로 붙게 되는데 이는 생략한다.)
    // companion object에 유틸성 함수들을 넣어도 되지만, 최상단 파일을 활용하는 것을 추천.
    companion object Factory : Log {
        val MIN_AGE = 1
        // 코틀린 쪽에 annotation을 붙여주면 자바 코드에서도 바로 접근이 가능하다.
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행 객체입니다.")
        }
    }


}

