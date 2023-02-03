package com.ivy.kotlin_study.lec10.Kotlin

// convention TIP:
// 변수의 타입 선언 할때는 띄어쓰기 하지 않고 콜론,
// 상속을 표현할 때는 띄어쓰기 하고 콜론.

// 1. 추상 클래스
// - 'extends' 키워드를 사용하지 않고 ':' 를 사용한다.
// - 상위 클래스의 생성자를 바로 호출한다.
// - override 를 필수로 붙여주어야한다.
class KotlinCat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐사뿐 걸어가~")
    }
}