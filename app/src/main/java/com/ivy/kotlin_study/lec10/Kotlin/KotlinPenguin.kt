package com.ivy.kotlin_study.lec10.Kotlin

// 인터페이스 구현도 ':'를 사용한다.
class KotlinPenguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    // 추상 클래스에서 자동으로 만들어진 getter를 override.
    // 자바와 같이 상위 클래스에 접근하는 키워드는 super이다.
    // 자바와 코틀린 모두 추상 클래스를 인스턴스화 할 수 없다.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        // 중복되는 인터페이스를 특정할 때 'super<타입>.함수' 사용
        // 자바, 코틀린 모두 인터페이스를 인스턴스화할 수 없다.
        // 코틀린에서는 backing field가 없는 프로퍼티를 Interface에 만들 수 있다.
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        println("추상 메소드 fly")
    }

    override val swimAbility: Int
        get() = 3

}