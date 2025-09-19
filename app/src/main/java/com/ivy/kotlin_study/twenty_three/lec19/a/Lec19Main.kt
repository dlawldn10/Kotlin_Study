package com.ivy.kotlin_study.lec19.a

import com.ivy.kotlin_study.lec18.Fruit
import com.ivy.kotlin_study.lec19.b.printHelloWorld as printHelloWorldB
import com.ivy.kotlin_study.lec19.a.printHelloWorld as printHelloWorldA


// Lec19 코틀린의 이모저모
// 1. Type Alias와 as import
// 2. 구조 분해와 componentN 함수
// 3. Jump와 Label
// 4. TakeIf와 TakeUnless


// 1. Type Alias와 as import
// - Type Alias (타입 별칭)
// 긴 이름의 클래스 혹은 함수 타입이 있을 때 축약하거나 더 좋은 이름을쓰고 싶다!
// ex) 람다 함수를 쓸 때 (타입)->리턴타입 이 너무 길다 ->
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean){
    // ...
}

// ex2) 이름이 긴 클래스를 컬렉션에 사용할 때도 간단히 줄일 수 있다.
data class UltraSuperGeardianTribe(
    val name: String
)

data class Person(
    val name: String,
    val age: Int
)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

typealias USGTMap = Map<String, UltraSuperGeardianTribe>
fun main() {
    var map: USGTMap = mutableMapOf()

    printHelloWorldB()
    printHelloWorldA()

    // 2. 구조 분해와 componentN 함수
    // - 구조 분해: 복합적인 값을 분해하여 여러 변수를 한번에 초기화하는 것.
    val person = Person("임지우", 100)
    // 구조분해 문법 = componentN 함수를 호출한다는 뜻.
    val (name, age) = person
    // 윗줄은 사실 아래와 같은 뜻
    val name1 = person.component1()
    val age1 = person.component2()
    println("이름: ${name}, 나이: ${age}")
    // data class는 기본적으로 자신이 가지고 있는 필드에 대해서
    // componentN이라는 함수를 자동으로 만들어준다.
    // component1() -> 첫번째 프로퍼티 가져옴
    // component2() -> 두번째 프로퍼티 가져옴

    // data class 가 아닌데 구조분해를 사용하고 싶다면
    // componentN 함수를 직접 구현해줄수도 있다.
    val person2 = Person2("임지우", 100)
    val (name2, age2) = person2

    // 사실 이 문법도 구조분해 문법이다.
    val map2 = mapOf(1 to "A", 2 to "B")
    for ((key, value) in map.entries) {
        // ...
    }


    // 3. Jump와 Label
    // retrun / break / continue
    // - return: 기본적으로 가장 가까운 enclosing function 또는 익명함수로 값이 반환된다.
    // - break: 가장 가까운 루프가 제거된다.
    // - continue: 가장 가까운 루프를 다음 step으로 보낸다.

    // 주의! forEach문 안에서는 continue, break 를 쓸 수 없다.
    val numbers = listOf(1, 2, 3, 4, 5)
//    numbers.forEach { number ->
//        if (number == 3) continue
//        println(number)
//    }

    // 하지만 나는 꼭 forEach 안에 break를 쓰고 싶다 -> run{} 사용.
    // 라벨을 이용해 run을 리턴시킨다.
    run {
        numbers.forEach { number ->
            if (number == 3) return@run
            println(number)
        }
    }

    // 나는 꼭 continue를 쓰고 싶다
    // 라벨을 이용해 forEach를 리턴시킨다.
    numbers.forEach { number ->
        if (number == 3) return@forEach
        println(number)
    }

    // 하지만 break, continue를 사용할 때엔 가급적 익숙한 for문 사용 추천
    // 코드를 쓰는사람, 읽는 사람 모두 읽숙한 코드를 접하는 것이 더 중요함.

    // 코틀린에는 라벨이라는 기능이 있다.
    // 특정 expression에 라벨이름@ 을 붙여 하나의 라벨로 간주하고
    // break, continue, return 등을 사용하는 기능.
    // 아래의 코드를 실행시킬 경우 가장 가까운 루프가 아니라 라벨이 달린 루프가 break 된다.
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) break@loop
            print("${i} ${j}")
        }
    }
    // 하지만 라벨을 사용한 Jump는 사용하지 않는 것을 강력히 권고
    // 코드의 흐름이 위아래로 계쏙 움직일 수록 복잡도가 드라마틱하게 증가.
    // 유지보수 힘들어짐.


}


// - as import: 어떤 클래스나 함수를 임포트할 때 이름을 바꾸는 기능
// 다른 패키지의 같은 이름의 함수를 동시에 가져오고 싶다면
fun printHelloWorld(){
    println("HelloWorld A")
}


// 4. TakeIf와 TakeUnless
fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    }else{
        number
    }

    // 위의 코드를 좀더 간소화 시킬 수 있는 takeIF
    // 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
    return number.takeIf { it > 0 }

    // takeUnless
    // 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 null이 반환된다.
    return number.takeUnless { it <= 0 }

}


// 정리:
// 타입에 대한 별칭을 줄 수 있는 typealias 라는 키워드가 존재한다.
// Import 당시 이름을 바꿀 수 있느 as import 기능이 존재한다.
// 변수를 한번에 선언할 수 있는 구조 분해 기능이 있으며, componentN 함수를 사용한다.
// for문, while문과 달리 forEach에는 break와 continue를 사용할 수 없다.
// takeIF와 takeUnless를 활용해 코드 양을 줄이고 method chaining 을 활용할 수 있다.



