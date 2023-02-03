package com.ivy.kotlin_study.lec12.kotlin

import com.ivy.kotlin_study.lec12.java.Movable

// Lec12 코틀린에서 object 키워드를 다루는 방법
// 자바에서는 없는 object 코드
// 1. static 함수와 변수
// 2. 싱글톤
// 3. 익명 클래스



fun main(){
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 3. 익명 클래스 : 특정 인터페이스나 클래스를 상속 받은 구현체를 일회성으로 사용할 때 쓰는 클래스
    // 자바에서는 new 타입이름()
    // 코틀린에서는 object: 타입이름
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })

}

// 2. 싱글톤
// 싱글톤: 단 하나의 인스턴스만을 갖는 "클래스"
// 코틀린에서 싱글톤 만들기.
// 싱글톤 클래스에 대해서는 애초에 인스턴스가 하나이기 때문에 인스턴스화를 하지 않고
// 코드에서 바로 . 을 이용해 접근할 수 있다.
// 근데 실무에서 싱글톤 만들일은 거의 없다.
object Singleton {
    var a: Int = 0
}


private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}



// 정리:
// 자바의 static 변수와 함수를 만드려면 코틀린에서는 companion object를 사용해야 한다.
// companion object 도 하나의 객체로 간주되기 때문에 이름을 붙일 수 있고, 다른 타입을 상속받을 수 있다.
// 코틀린에서는 싱글톤 클래스를 만들 때 object 키워드를 사용한다.
//