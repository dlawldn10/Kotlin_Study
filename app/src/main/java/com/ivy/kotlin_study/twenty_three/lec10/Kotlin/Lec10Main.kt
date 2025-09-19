package com.ivy.kotlin_study.lec10.Kotlin

// Lec10 코틀린에서 상속을 다루는 방법
// 1. 추상 클래스
// 2. 인터페이스
// 3. 클래스를 상속할 때 주의할 점
// 4. 상속 관련 지시어 정리

fun main() {
    // 3. 클래스를 상속할 때 주의할 점
    // Drived 클래스를 인스턴스화 하면?
    Derived(300)
    // 결과:
    // "Base Class"
    // 0
    // "Derived Class"
    // -> number 값에 300도 아니고 100도 아닌 0이 들어가는 것을 알 수 있음.
    // 이유: 상위 클래스의 초기화가 이루어지는 단계에서 하위 클래스의 프로퍼티를 불러버리면
    // 하위 클래스가 아직 생성되지도 않은 상태라 값에 아무것도 없기 때문에
    // Int의 기본값인 0이 들어가게 되는 것.
    // 따라서 상위 클래스의 constructor와 init 블록에서는 (final이 아닌)하위 클래스 필드에 접근하면 안된다.
    // 다시 말해, 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야한다.


    // 4. 상속 관련 지시어 정리
    // - final: 다른 클래스가 상속받아 override를 할 수 없게 한다. default로 보이지 않게 존재한다.
    // - open: 다른 클래스가 상속 받을 수 있게 override를 열어준다. 상속해도 되고 안해도된다.
    // - abstract: 반드시 override 해야한다.
    // - override: 상위 타입을 오버라이드 하고있다. 코틀린에서는 annotation이 아니라 키워드로 꼭 사용해야한다.
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number){
    init {
        println("Derived Class")
    }

}


// 정리:
// 상속 또는 구현을 할 때에 ':' 을 사용해야한다.
// 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야한다.
// override를 필수로 붙여야한다.
// 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하며,
// 하위 클래스에서 오버라이드 하려면 open을 붙여주어야한다.
// 상위 클래스의 생성자 또는 초기화 블록에서 하위 클래스의 open된 프로퍼티를 사용하면 예기치 못한 버그가 생길 수 있다.

