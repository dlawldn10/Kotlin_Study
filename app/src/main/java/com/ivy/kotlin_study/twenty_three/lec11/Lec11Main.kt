package com.ivy.kotlin_study.lec11

// Lec11 코틀린에서 접근 제어를 다루는 방법
// 1. 자바와 코틀린의 가시성 제어
// 2. 코틀린 파일의 접근 제어
// 3. 다양한 구성요소의 접근 제어
// 4. 자바와 코틀린을 함께 사용할 경우 주의할 점.


// 자바의 접근제어
// public: 모든 곳에서 접근 가능
// protected: 같은 패키지 또는 하위 클래스에서만 접근 가능
// default: 같은 패키지에서만 접근 가능
// private: 선언된 클래스 내에서만 접근 가능


// 코틀린의 접근 제어
// public: 모든 곳에서 접근 가능 ( 자바와 동일 )
// protected: 같은 패키지가 아니라 선언된 클래스 또는 하위 클래스에서만 접근 가능
// '같은 패키지'가 빠진 이유? : 코틀린에서는 namespace를 관리하기 위한 용도(영역을 나누기 위한 용도)로만 사용하고 가시성 제어에는 사용하지 않기 때문
// default가 사라지고 internal : 같은 모듈에서만 접근 가능.
// 사라진 이유?: 위의 경우와 같다. namespace 사용하지 않아서.
// 모듈?: 한번에 컴파일 되는 Kotlin 코드 - IDEA Module, Maven Project, Gradle Source Set, Ant Task <kotlinc> 의 코틀린으로 호출한 컴파일 집합.
// -> 하위 모듈에서 internel로 선언된 것을 상위 모듈에서 가져오지 못한다. 같은 모듈에서만 접근할 수 있게 막아놨기 때문.
// private: 선언된 클래스 내에서만 접근 가능( 자바와 동일 )


// 코틀린에서는 패키지라는 개념을 접근 제어에 사용하지 않기 때문에
// protected에서는 패키지가 빠지고 default는 아예 사라지고
// 대신에 모듈을 접근 제어하는 기능이 생겼다고 이해하기


// 자바의 기본 접근 지시어는 default -> default를 안붙여도 default로 인식했음.
// 코틀린의 기본 접근 지시어는 public -> public을 안붙여도 public이라고 인식함.


// 2. 코틀린 파일의 접근 제어
// 코틀린은 .kt 파일에 변수, 함수, 클래스 여러개를 바로 만들 수 있다.
// 코틀린 파일의 접근 제어는?
val a = 3

fun add (a: Int, b: Int): Int {
    return a + b
}

class Cat()

// public: 코틀린 파일에서 사용 가능. 기본값으로 어디서든 접근할 수 있다.
// protected: 파일(최상단)에는 사용 불가능. 애당초 클래스가 아니라 파일이므로.
// internal : 코틀린 파일에서 사용 가능. 같은 모듈에서만 접근 가능.
// private: 코틀린 파일에서 사용 가능. 같은 파일 내에서만 접근 가능.


// 3. 다양한 구성요소의 접근 제어
// 클래스, 생성자, 프로퍼티에 접근 지시어를 붙이면 어떻게 되는지
// - 클래스 안의 멤버
// public: 모든 곳에서 접근 가능
// protected: 선언된 클래스 또는 하위 클래스에서만 접근 가능
// internal : 같은 모듈에서만 접근 가능
// private: 선언된 클래스 내에서만 접근 가능
// - 생성자: 가시성 범위는 동일하나, 생성자에 접근 지시어를 붙이려면 'constructor' 를 사용해함.
class Dog private constructor()
// 원래는 class Dog public constructor() 에서 'public constructor' 부분을 생략하고 썼던 것.
// - 프로퍼티: 가시성 범위는 동일. 가시성 제어하는 방법에 2가지가 있다.
// 1) internal val name... 과 같이 val 앞에 지시어 붙여주기
// 2) getter는 public으로 두고 setter는 private으로 두고 싶은 경우 -> setter에만 추가로 가시성을 부여할 수 있다.
// custom setter 앞에 private set() = ...와 같이 사용.


// 3개의 getter와 owner와 price에 대한 2개의 setter를 가지고 있다.
// name에 대한 getter를 internal로 만들고 싶다면
// owner에 대한 getter와 setter를 private으로 만들고 싶다면
// price에 대한 setter만 private으로 만들고 싶다면
class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}


// 4. 자바와 코틀린을 함께 사용할 경우 주의할 점.
// - Internal은 바이트 코드로 바뀌게 되면 public이 된다.
// 때문에 자바 코드에서는 코틀린 모듈의 internal 코드를 가져올 수 있다.
// - 코틀린의 protected와 자바의 protected는 다르다.
// 자바는 같은 패키지의 코틀린 protected 멤버에 접근할 수 있다.


// 정리:
// 코틀린에서 패키지는 namespace 관리용이기 때문에 자바의 protected와 의미가 달라졌다.
// 코틀린에서 default가 사라지고, 모듈간의 접근을 통제하는 internal이 새로 생겼다.
// 생성자에 접근지시어를 붙일 때는 constructor를 명시적으로 써주어야한다.
// 유틸성 함수를 만들 때는 파일 최상단을 이용하면 편리하다.
// 프로퍼티의 custom setter에 접근 지시어를 붙일 수 있다.
// 자바에서 코틀린 코드를 사용할 때 internal과 protected는 주의해야 한다.
