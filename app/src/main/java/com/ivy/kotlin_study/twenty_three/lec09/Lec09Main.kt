package com.ivy.kotlin_study.lec09

// Lec09 코틀린에서 클래스를 다루는 방법
// 1. 클래스와 프로퍼티
// 2. 생성자와 init
// 3. 커스텀 getter, setter
// 4. backing field


// 1. 클래스와 프로퍼티
// 프로퍼티 = 필드 + getter + setter
// 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다.
// 코틀린에서는 getter, setter를 명시적으로 써주지 않아도된다.
// constructor 지시어 생략 가능
// 생성자에서 프로퍼티를 바로 만들 수 있다.
// 내부에 내용이 없으면 {}도 생략할 수 있다.

fun main(){
    val person = Person("임지우", 100)
    // .필드 를 통해 getter와 setter를 바로 호출할 수 있다.
    // println(person.getName()) -> X
    // person.setAge(10) -> X
    println(person.name)
    person.age = 10

    // 자바 코드를 불러와서 쓸때도 .필드로 getter, setter를 사용할 수 있다.
    val person2 = JavaPerson("임지우", 100)
    println(person2.name)
    person2.age = 10

    // 생성자를 하나 더 만들어줬으므로 이름만 넣고 인스턴스를 만들 수 있다.
    val person3 = Person("임지우")

    // 역순으로 출력된다.
    // 두번째 부생성자를 호출했지만 첫번째 부생성자부터 호출됨.
    // 결과:
    // 초기화 블록
    // 첫 번째 부생성자
    // 두 번째 부생성자
    // n번째 생성자를 불러도 타고타고 올라가서 초기화 블록부터 호출되며 내려온다.
    Person()

    // 하지만 사실 코틀린에서는 부 생성자 사용보다는 default parameter 사용을 권장한다.
    // 하지만 converting이 이루어져야 하는 상황에는 부생성자를 사용할 수 있지만,
    // 그보다는 정적 팩토리 메소드를 추천한다.
    // 그래서 사실상 부생성자는 쓸일이 거의 없다.


}

// 가장 위에 있는 생성자: 주 생성자(primary constructor)
// 반드시 존재해야 한다.
// 단, 주 생성자에 파라미터가 하나도 없다면 생략 가능. ex) class Student 끝

class Person (
    name: String = "임지우",
    var age: Int = 1
    ) {

    // +) 커스텀 getter를 사용하면 자기 자신을 변형해줄수도있다.
    // name을 get 할때 무조건 대문자로 바꿔주기
    // getter를 커스텀 해줄 것이므로 주생성자에서 val 선언을 삭제하고
    // 아래에서 초기화 진행.
//    val name = name
//        get() = field.uppercase()
    // 왜 field를 사용하는가?
    // 4. backing field
    // val name = name
    //    get() = name.uppercase()
    // 이렇게 쓰다보면
    // name 을 부르면 getter가 호출되고, getter를 부르면 name이 호출되어 무한루프가 발생한다.
    // 이런 현상을 막기 위해 자기 자신을 가리키는 예약어인 'field' 를 사용한다.
    // 자기 자신을 가리키는 뒤에있는, 보이지 않는 field = backing field
    // 개인적으로는 custom getter에서 backing field를 쓰는 경우는 드물었다.
    // 방금 같은 요구 사항은
    val upperCaseName: String
        get() = this.name.uppercase()
    // 또는
    fun upperCaseName(): String = this.name.uppercase()
    // 이렇게 해결할 수도 있기 때문.

    // 커스텀 setter 만들기
    // 이름을 무조건 대문자로 바꿔서 저장하기
    var name = name
        set (value) {
            field = value.uppercase()
        }
    // 하지만 setter 자체를 지양하기 때문에 custom setter도 잘 안쓴다!
    // 대신 update 하는 함수를 따로 만들어서 사용하는게 더 깔끔.
    // 자연스럽게 backing setter를 활용하는 custom setter도 잘 안쓰게됨.

    // 2. 생성자와 init
    // 클래스가 생성되는 시점에 나이를 검증해보자
    init {
        // 클래스가 초기화되는 시점에 한번 호출된다.
        // 여기서 주로 검증 로직을 구현한다.
        // 또는 값을 적절히 만들어 줄때 사용.
        if (age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    // +) 최초로 태어난 아기는 무조건 1살이니, 생성자를 하나 더 만들자!
    // 여기서 this는 기본 생성자를 가리키고 있다.
    // 이 생성자는 부생성자(secondary constructor)
    // 있을 수도 있고, 없을 수도 있다.
    // 주생성자가 있는 상태에서 추가적으로 생성자를 만ㄷ르고 싶을 때 만들어 쓴다.
    // 부생성자는 바디를 만들 수 있다.
    constructor(name: String): this(name, 1){
        println("첫 번째 부생성자")
    }

    // 여기서 this는 첫번째 부생성자를 가리키고 있다.
    // 최종적으로는 주 생성자를 기리키도록 해야함.
    constructor(): this("홍길동"){
        println("두 번째 부생성자")
    }

    // 3. 커스텀 getter, setter
    // 성인인지 아닌지 확인하는 기능을 추가하자
    // 이렇게 만들수도 있지만 커스텀 getter를 만들 수 있다.
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // 커스텀 getter
    // 함수를 프로퍼티 처럼 만든 것.
    // 위 방법과 동일한 기능임.
    // 어떤방법이 나을까?
    // 개인적 의견: 객체의 속성이라면 custom getter, 그렇지 않다면 함수.
    // ex) isAdult는 성인인지 아닌지 속성을 나타내는것 이므로 custom getter를 사용하여 프로퍼티 처럼 보이게함.
    val isAdult: Boolean
        get() = this.age >= 20

}


// 정리:
// 코틀린에서는 필드를 만들면 getter와 setter가 자동으로 생성된다.
// 때문에 이를 프로퍼티라고 부른다.
// ex) Person 객체에는 name 프로퍼티와 age 프로퍼티가 있다.
// 코틀린에서는 주생성자가 필수이다.
// 코틀린에서는 constructor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
// 단, default parameter나 정적 팩토리 메소드를 추천한다.
// custom getter와 custom setter를 만들 수 있다.
// custom getter, custom setter에서 무한 루프를 막기 위해 field라는 키워드를 사용한다. 이를 backing filed 라고 부른다.