package com.ivy.kotlin_study.lec20

import com.ivy.kotlin_study.lec14.KotlinPersonDto

// Lec20 코틀린의 scope function
// 1. scope function이란 무엇인가?
// 2. scope function의 분류
// 3. 언제 어떤 scope function을 사용해야할까?
// 4. scope function과 가독성


// 1. scope function이란 무엇인가?
// scope: 영역
// function: 함수
// -> 일시적인 영역을 형성하는 함수
data class Person(
    val name: String,
    val age: Int
) {
    lateinit var hobby: String
}


fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }

    // 위의 코드를 '일시적인 영역'과 함께 리팩토링 하면
    // Safe Call(?.) 사용 : person이 null이 아닐 때에 let을 호출.
    // let: scope function의 한 종류. 확장함수. 람다를 받아, 람다를 반환한다.
    person?.let {
        println(it.name)
        println(it.age)
    }
    // 람다를 사용해 일시적인 영역을 만들고, 코드를 더 간결하게 만들거나,
    // method chaining에 활용하는 함수를 scope function이라고 합니다.

}

// 2. scope function의 분류
// - let : 람다의 결과를 반환 / it
// - run : 람다의 결과를 반환 / this
// - also : 람다의 결과와 상관 없이 객체 그 자체를 반환 / it
// - apply : 람다의 결과와 상관 없이 객체 그 자체를 반환 / this
// 위의 네개는 확장함수.
// - with : 특이점. with는 확장함수가 아님.

// it -> 생략이 불가능한 대신 다른이름을 붙일 수 있다.
// this -> 생략이 가능한 대신 다른 이름을 붙일 수 없다.
// 왜 이런 차이가 발생하는가? 코틀린 문법 때문.
// let, also은 일반함수를 받는다. 파라미터를 함수 내부에서 호출하기 때문에 이름을 직접 넣어 줄 수 있는것.
// run, apply은 확장함수를 받는다. 확장함수의 문법 -> 본인 자신을 this로 호출하고, 생략할 수 있다.

fun main(){
    val person = Person("임지우", 100)
    val value1 = person.let { it.age } // -> age
    val value1_1 = person.let { p -> p.age }

    val value2 = person.run { this.age } // -> age
    val value2_1 = person.run { age }

    val value3 = person.also { it.age } // -> person

    val value4 = person.apply { this.age } // -> person

    // with (파라미터, 람다): this를 사용해 접근하고, this는 생략 가능하다.
    with(person) {
        println(name)
        println(this.age)
    }


    // 3. 언제 어떤 scope function을 사용해야할까?
    // - let
    // 1) 하나 이상의 call chain 결과로 호출할 때
    val strings = listOf("APPLE", "CAR")
    // 리스트의 값들을 length으로 바꾸고 그 중에 length가 3보다 큰 것만 남겨서 출력한다.
    // List<Int> 자체를 한번 print한다.
    strings.map { it.length }.filter { it > 3 }.let(::println)
    // 아래와 같이 람다를 써서 표현할 수도 있다.
    strings.map { it.length }.filter { it > 3 }.let{ lengths -> println(lengths) }

    // 2) 'non-null인 값에 대해서만' code block을 실행시킬 때
    val str = "jiwoo"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // 3) 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        if (firstItem.length >= 5) firstItem else "!${firstItem}"
    }.uppercase()
    println(modifiedFirstItem)


    // - run
    // 1) 객체 초기화와 반환 값의 계산을 동시에 해야할 때
    // 객체를 만들어 DB에 바로 저장하고, 그 인스턴스를 활용할 때
    // 이 run을 통해 저장된 person이 밖으로 반환된다.
    val person2 = Person("임지우", 120).run(personRepository::save)
    // 응용.
    val person3 = Person("임지우", 120).run{
        hobby = "독서"
        personRepository.save(this)
    }
    // -> but 이런코드는 개인적으로는 잘 사용하지 않는다.
    // 아래 코드가 더 익숙하기도 하고 반복되는 생성 후처리는
    // 생성자, 프로퍼티, init block으로 넣는 것이 좋다.
    // 생성자 코드가 길어질 때는 run을 쓰면 깔끔해지기는 함.
    val person4 = personRepository.save(Person("임지우", 100))


    // apply를 활용하여 이러한 코드도 가능은 하다.
    val person5 = Person("임지우", 100)
    person.apply { this.growOld() }.let { println(it) }


    // - also
    // 객체를 수정하는 로직이 call chain 중간에 필요할 때
    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값: $it")}
        .add("four")


    // - with
    // 특정 객체를 다른 객체로 변환해야하는데,
    // 모듈간의 의존성에 의해 정적 팩토리 혹은 toCass 함수를 만들기 어려울 때
    with(person){
        KotlinPersonDto(
            name = name,
            age = age
        )
    }


    // 4. scope function과 가독성
    // scope function을 사용한 코드가 그렇지 않은 코드보다 가독성 좋은 코드일까?
    // 1번 코드 : 전통적인 if else 활용
    if (person != null && person.isAdult) {
        view.showPerson(peron)
    }else{
        view.showError()
    }

    // 2번 코드 : scope function을 활용한 코틀린스러운 코드
    person?.takeIf { it.isAdult }
        ?.let(view::showPerson)
        ?: view.showError()

    // 1번 코드가 더 가독성이 좋다고 생각
    // 이유?:
    // 구현2는 숙련된 코틀린 개발자만 알아보기 쉽다.
    // 어쩌면 숙련된 코틀린 개발자도 잘 이해하지 못할 수 있다.
    // 그렇기 때문에 구현1의 디버깅과 수정이 쉽다.
    // -> 사용 빈도가 적은 관용구는 코드를 더 복잡하게 만들고,
    // 이런 관용구들은 한 문장 내에서 조합해서 사용하면 복잡성이 훨씬 증가한다.

    // 하지만 scope function을 적절한 convention과 함께 사용하면 유용하게 활용할 수 있다.




}

// - apply
// 1) 객체 설정을 할 때 객체를 수정하는 로직이 call chain 중간에 필요할 때
// Person이 최초 회원가입 시점에는 name과 age만 받다가
// 회원가입 이후에 추가로 정보를 받는 경우.
// hobby가 생성자에  존재하지 않을 수 있음.
// Test Fixture를 만들 때 apply를 이용해서 hobby 추가 생성
fun createPerson(
    name: String, age: Int, hobby: String
): Person {
    return Person(
        name = name,
        age = age
    ).apply {
        this.hobby = hobby
    }
}


// 정리:
// 코틀린의 scope function은 일시적인 영역을 만들어 코드를 더 간결하게 하거나, method chain에 활용된다.
// scope function의 종류에는 let / run / also / apply / with 가 있다.
// scope function을 사용한 코드는 사람에 따라 가독성을 다르게 느낄 수 있기 때문에,
// 함게 프로덕트를 만들어가는 팀 끼리 convention을 잘 정해야한다.


