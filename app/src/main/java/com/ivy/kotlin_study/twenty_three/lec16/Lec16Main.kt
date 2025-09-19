package com.ivy.kotlin_study.lec16

// Lec16 코틀린에서 다양한 함수를 다루는 방법
// 1. 확장 함수
// 2. infix 함수
// 3. inline 함수
// 4. 지역함수


// 1. 확장 함수
// 코틀린은 자바와 코드와 100% 호환을 목표로 하고 있음.
// 기존 자바 코드 위에 자연스럽게 코틀린 코드를 추가할수는 없을까
// 자바로 만들어진 라이브러리를 유지 보수, 확장 할 때 코틀린 코드를 덧붙이고 싶어!
// -> 어떤 클래스 안에 있는 메소드(멤버함수)처럼 호출할 수는 있지만, 함수는 밖에 만들 수 있게 하자
fun main(){
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 100)
    person.nextYearAge()

    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive()  // Train의 확장함수

    val srt2:Srt = Srt()
    srt2.isExpensive()  // Srt의 확장함수

    3.add(4)
    3.add2(4)
    3 add2 4
}

// 확장 함수:
// fun 확장할클래스명.함수명(파라미터): 리턴타입{
//      this(수신객체)를 이용해 실제 클래스 안의 값에 접근
// }
// -> 원래 String 클래스에 있던 멤버함수인것처럼 사용할 수 있다.
fun String.lastChar(): Char {
    return this[this.length-1]
}

// 확장함수가 public이고, 확장함수에서 수신 클래스의 private 함수를 가져오면 캡슐화가 깨지는거 아닌가?
// -> 애당초 확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.
// 멤버함수와 확장함수의 시그니처가 같다면?
// -> 멤버함수가 우선적으로 호출된다.
// 확장함수를 만들었지만, 다른 기능의 똑같은 멤버함수가 생기면 오류가 발생할 수 있다.
// 확장함수가 오버라이드된다면?
// -> 해당 변수의 현재 타입, 즉 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
// 정리:
// 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다.
// 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
// 확장함수는 현재 타입을 기준으로 호출된다.
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age+1
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}

// 자바에서는 코틀린 확장함수를 어떻게 가져다 사용할 수 있을까
// 자바에서는 정적 메소드를 부르는 것처럼 사용 가능하다.

// 확장함수라는 개념은 확장 프로퍼티와도 연결된다.
// 확장 프로퍼티의 원리는 확장함수 + custom getter와 동일하다.
val String.lastChar: Char
    get() = this[this.length-1]


// infix 함수. 중위 함수
// 함수를 호출하는 새로운 방법
// ex) downTo, step
// 변수.함수이름(argument) 대신
// 변수 함수이름 argument
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int{
    return this + other
}
// infix는 멤버함수에도 붙일 수 있다.


// 3. inline 함수
// 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본믄을 그대로 복붙하고 싶은 경우
// 이 복붙을 왜 사용하냐 -> 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
// 하지만 inline 함수의 사용은 성능 측정과 함께 신중하게 사용되어야한다.
inline fun Int.add3(other: Int): Int {
    return this + other
}


// 4. 지역함수
// 함수 안에 선언된 함수를 지역함수라 한다.
// 함수로 추출하면 좋을 것 같은데, 이 함수를 지금 함수 내에서만 사용하고 싶을 때
// 하지만 depth가 깊어지기도 하고 코드가 깔끔하지는 않음.
// 실무에서 많이 쓰이지는 않는듯.
fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재 값 ${name}")
        }
    }
//    if (firstName.isEmpty()) {
//        throw IllegalArgumentException("firstName은 비어있을 수 없습니다. 현재 값 ${firstName}")
//    }
//
//    if (lastName.isEmpty()) {
//        throw IllegalArgumentException("lastName은 비어있을 수 없습니다. 현재 값 ${lastName}")
//    }

    // 이렇게 지역함수를 사용하여 바꿀 수 있다.
    // 하지만 이런 경우는 그냥 Person을 만들어주는 쪽에서 validation을 진행하는 것이 더 깔끔하겠다.
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")
    return Person(firstName, lastName, 1)
}


// 정리:
// 자바 코드가 있는 상황에서, 코틀린 코드로 추가 기능 개발을 하기 위해 확장함수와 확장 프로퍼티가 등장했다.
// fun 확장할클래스명.함수명(파라미터): 리턴타입{
//      this(수신객체)를 이용해 실제 클래스 안의 값에 접근
// }
// 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다.
// 멤버함수, 확장 함수 중 멤버함수에 우선권이 있다.
// 확장함수는 현재 타입을 기준으로 호출된다.
// 자바에서는 static 함수를 쓰는 것처럼 코틀린의 확장함수를 쓸 수 있다.
// 함수 호출 방식을 바꿔주는 infix 함수가 존재
// 변수 함수이름 argument
// 함수를 복사-북여넣기하는 inline 함수가 존재
// 코틀린에서는 함수 안에 함수를 선언할 수 있고, 이를 지역함수라고 부른다.