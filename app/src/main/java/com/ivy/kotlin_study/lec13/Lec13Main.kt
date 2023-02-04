package com.ivy.kotlin_study.lec13
import com.ivy.kotlin_study.lec13.JavaHouse.LivingRoom

// Lec13. 코틀린에서 중첩 클래스를 다루는 방법

// 1. 중첩 클래스의 종류
// 2. 코틀린의 중첩 클래스와 내부 클래스


// 자바의 중첩 클래스
// Static을 사용하는 중첩 클래스: 클래스 안에 static을 붙인 클래스. 밖의 클래스 직접 참조 불가.
// Static을 사용하지 않는 중첩 클래스 - 내부 클래스, 지역 클래스, 익명 클래스
// 내부 클래스: 밖에 클래스를 직접 참조 가능한 클래스
// 지역 클래스: 메소드 내부에 클래스를 정의 (많이 쓰이지느 않는듯)
// 익명 클래스: 일회성 클래스
// 중첩 클래스 -> 내부 클래스와 Static을 사용하는 중첩 클래스를 지칭함.

// 1) 내부 클래스는 숨겨진 외부 클래스 정보를 가지고 있어,
// 참조를 해지하지 못하는 경우 메모리 누수가 발생할 수 있고
// 이를 디버깅하기 어렵다.

// 2) 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아 직렬화에 있어 제한적이다.

// -> 내부 클래스가 외부 클래스를 참조함으로서 생기는 몇가지 문제점이 있다.
// -> 클래스 안에 클래스를 만들 때는 static 클래스를 사용하라는 가이드가 있다.
// 코틀린은 이 가이드를 충실히 따르고 있음.
// -> 기본적으로 바깥 클래스를 참조하지 않는다.
// 바깥 클래스를 참조하고 싶다면 inner 키워드를 추가한다.


class KotlinHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    // 권장되는 클래스 (자바에서 static 중첩 클래스)
    // 이처럼 기본적으로 바깥 클래스에 대한 연결이 없는 중첩 클래스가 만들어진다.
    class LivingRoom(
        private val array: Double
    ) {

    }

    // 권장되지 않는 클래스 (자바에서 내부 클래스)
    // 이처럼 권장되지 않는 방법으로 클래스를 만들때는 inner 키워드를 직접적으로 명시해야한다.
    inner class LivingRoom2(
        private val array: Double
    ) {
        val address: String
            // 바깥 클래스를 참조하기 위해 this@바깥클래스를 사용한다.
            get() = this@KotlinHouse.address
    }

}




// 정리:
// 클래스 안에 클래스가 있는 경우 종류는 두 가지. (자바 기준)
// 1. static을 사용하는 클래스
// 2. static을 사용하지 않는 클래스 - 내부 클래스
// 권장되는 클래스는 1번.
// 코틀린은 이러한 가이드를 따르게 위해
// 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한 참조를 할 수 없다.
// 바깥 클래스를 참조하고 싶다면, inner 키워드를 붙여야한다.
// inner 클래스에서 바깥 클래스를 참조하려면 this@바깥클래스를 사용해야한다.


// 자바
// 1) 권장 - 클래스 안의 static 클래스: 바깥 클래스 참조 없음.
// 2) 클래스 안의 클래스: 바깥 클래스 참조 있음.

// 코틀린
// 1) 권장 - 클래스 안의 클래스: 바깥 클래스 참조 없음.
// 2) 클래스 안의 inner 클래스: 바깥 클래스 참조 있음.