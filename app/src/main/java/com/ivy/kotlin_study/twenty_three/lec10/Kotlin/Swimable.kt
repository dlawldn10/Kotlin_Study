package com.ivy.kotlin_study.lec10.Kotlin

interface Swimable {

    // <Backing field 없는 프로퍼티 만들기>
    // Swimable에 필드가 있는게 아니라
    // getter를 아래에서 구현해주길 기대하고 있다.
    // 따라서 Swimable을 상속한 KotlinPenguin에서 custom getter를 통해 이 프로퍼티에 값을
    // 넣어줄 수 있고, 그렇게 되면 이 인터페이스에서 아래와 같이 자유롭게 사용이 가능하다.
    val swimAbility: Int

    // 또는 여기서 직접 넣을 수도 있다.
    // 이 경우에는 default 값이 되는 것.
    // 위에서 언급한 방법을 통해 추가로 override 해서 이 값을 바꿀 수 있다.
    val swimAbility2: Int
        get() = 3
    // 즉, getter에 대한 default 메소드나 getter에 대한 추상 메소드를 인터페이스에 만드는 것이라 볼 수 있다.


    fun act(){
        // 아래에서 구현해줄거라 믿는 것.
        println(swimAbility)
        println("어푸 어푸푸")
   }
}